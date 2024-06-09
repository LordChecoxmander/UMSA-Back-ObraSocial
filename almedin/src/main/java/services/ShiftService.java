package services;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import modelsDTO.ShiftDTO;
import modelsEntities.Shift;
import modelsEntities.Specialist;
import modelsEntities.User;
import repositories.ShiftRepository;
import repositories.SpecialistRepository;
import repositories.UserRepository;

import java.time.LocalDateTime;

@Transactional
@ApplicationScoped
public class ShiftService {

    @Inject
    private ShiftRepository shiftRepository;
    @Inject
    private SpecialistRepository specialistRepository;
    @Inject
    private UserRepository userRepository;


    //aca tengo que crear un nuevo turno con los datos del DTO
    public void createShift(ShiftDTO shiftdto) {
        //busco el medico con el id
        Specialist medic = specialistRepository.findById(shiftdto.getIdSpecialist());
        //busco el usuario por el nombre
        User user = userRepository.findByName(shiftdto.getNamePacient());
        //Yo usaria el id, but tengo que cambiar el DTO y lo que recibe, dejo el codigo
        //User user = userRepository.findById(shiftdto.getIdPacient);

        Shift s = new Shift(shiftdto.getMotive(), user, medic);
        shiftRepository.persist(s);
    }

    // New method to delete a shift by ID
    public void deleteShift(Long id) {
        Shift shiftDelete = shiftRepository.findById(id);
        if (shiftDelete != null) {
            shiftRepository.delete(shiftDelete);
        } else {
            throw new RuntimeException("Shift not found");
        }
    }

}
