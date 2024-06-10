package AlMedin.services;

import config.JsonParser;
import modelsDTO.ResponseSpecialistDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repositories.SpecialistRepository;
import services.SpecialistService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SpecialistServiceTest {


    @Mock
    private SpecialistRepository specialistRepository;

    @Mock
    private JsonParser jsonParser;

    @InjectMocks
    private SpecialistService specialistService;

    @Test
    public void testgetAllSpecialists(){

        // Mock data
        JsonParser shceduleJson = new JsonParser();
        shceduleJson.setJsonString("{\n" + "  \"horarios\": [\n" + "    {\n" + "      \"dia\": \"Lunes\",\n" + "      \"turnos\": [\n" + "        {\"hora\": \"09:00\", \"disponible\": true},\n" + "        {\"hora\": \"10:00\", \"disponible\": true},\n" + "        {\"hora\": \"11:00\", \"disponible\": false}\n" + "      ]\n" + "    },\n" + "    {\n" + "      \"dia\": \"Martes\",\n" + "      \"turnos\": [\n" + "        {\"hora\": \"09:00\", \"disponible\": true},\n" + "        {\"hora\": \"10:00\", \"disponible\": false},\n" + "        {\"hora\": \"11:00\", \"disponible\": true}\n" + "      ]\n" + "    }\n" + "  ]\n" + "}");

        //Creat a list for ResponseSpecialistDTO
        ResponseSpecialistDTO s1 = new ResponseSpecialistDTO("nombre1", "especialidad1", "ubicacion1", shceduleJson);
        ResponseSpecialistDTO s2 = new ResponseSpecialistDTO("nombre2", "especialidad2", "ubicacion2", shceduleJson);
        ResponseSpecialistDTO s3 = new ResponseSpecialistDTO("nombre3", "especialidad3", "ubicacion3", shceduleJson);
        ResponseSpecialistDTO s4 = new ResponseSpecialistDTO("nombre4", "especialidad4", "ubicacion4", shceduleJson);
        List<ResponseSpecialistDTO> specialists = new ArrayList<>();
        specialists.add(s1);
        specialists.add(s2);
        specialists.add(s3);
        specialists.add(s4);

        // Mock repositories
        when(specialistRepository.getAllSpecialistsResponse()).thenReturn(specialists);

        List<ResponseSpecialistDTO> result = specialistService.getAllSpecialists();

        //verify that the list of specialist is correct
        assertEquals(specialists, result);
    }
}