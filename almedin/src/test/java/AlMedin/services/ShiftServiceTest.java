package AlMedin.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import modelsDTO.RequestShiftDTO;
import modelsEntities.Shift;
import modelsEntities.Specialist;
import modelsEntities.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repositories.ShiftRepository;
import repositories.SpecialistRepository;
import repositories.UserRepository;
import services.ShiftService;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ExtendWith(MockitoExtension.class)
public class ShiftServiceTest {

    @Mock
    private ShiftRepository shiftRepository;

    @Mock
    private SpecialistRepository specialistRepository;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private ShiftService shiftService;

    @Test
    public void testCreateShift() {
        // Mock data
        RequestShiftDTO requestShiftDTO = new RequestShiftDTO();
        requestShiftDTO.setIdSpecialist(1L);
        requestShiftDTO.setNamePacient("John Doe");
        requestShiftDTO.setMotive("Checkup");

        // Mock repositories
        Specialist specialist = new Specialist();
        when(specialistRepository.findById(1L)).thenReturn(specialist);

        User user = new User();
        when(userRepository.findByName("John Doe")).thenReturn(user);

        // Call the method under test
        shiftService.createShift(requestShiftDTO);

        // Verify that the shift was persisted
        verify(shiftRepository).persist(any(Shift.class));
    }

    @Test
    public void testDeleteShift_ShouldDeleteShiftIfExists() {
        // Mock data
        Long shiftId = 1L;

        // Mock repository
        Shift shiftToDelete = new Shift();
        when(shiftRepository.findById(shiftId)).thenReturn(shiftToDelete);

        // Call the method under test
        shiftService.deleteShift(shiftId);

        // Verify that the shift was deleted
        verify(shiftRepository).delete(shiftToDelete);
    }

    @Test
    public void testDeleteShift_ShouldThrowExceptionIfShiftNotFound() {
        // Mock data
        Long shiftId = 1L;

        // Mock repository
        when(shiftRepository.findById(shiftId)).thenReturn(null);

        // Call the method under test and verify that it throws an exception
        assertThrows(RuntimeException.class, () -> shiftService.deleteShift(shiftId));
    }

    @Test
    public void testUpdateShift_ShouldUpdateShiftIfExists() {
        // Mock data
        Long shiftId = 1L;
        RequestShiftDTO shiftDTO = new RequestShiftDTO();
        shiftDTO.setMotive("New motive");
        shiftDTO.setDate(LocalDateTime.now());
        shiftDTO.setIdSpecialist(1L);

        // Mock repository
        Shift existingShift = new Shift();
        existingShift.setId(shiftId);
        when(shiftRepository.findById(shiftId)).thenReturn(existingShift);

        Specialist specialist = new Specialist();
        when(specialistRepository.findById(shiftDTO.getIdSpecialist())).thenReturn(specialist);

        // Call the method under test
        shiftService.updateShift(shiftDTO, shiftId);

        // Verify that the shift was updated
        assertEquals("New motive", existingShift.getMotive());
        // Verificar que la fecha es igual, sin tener en cuenta la hora
        assertEquals(LocalDate.now(), existingShift.getDate().toLocalDate());

        assertEquals(specialist, existingShift.getSpecialist());
    }

    @Test
    public void testUpdateShift_ShouldThrowExceptionIfShiftNotFound() {
        // Mock data
        Long shiftId = 1L;
        RequestShiftDTO shiftDTO = new RequestShiftDTO();
        shiftDTO.setMotive("New motive");
        shiftDTO.setDate(LocalDateTime.now());
        shiftDTO.setIdSpecialist(1L);

        // Mock repository
        when(shiftRepository.findById(shiftId)).thenReturn(null);

        // Call the method under test and verify that it throws an exception
        assertThrows(RuntimeException.class, () -> shiftService.updateShift(shiftDTO, shiftId));
    }
}
