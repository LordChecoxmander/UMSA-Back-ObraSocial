package services;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import modelsDTO.RequestShiftDTO;
import modelsEntities.Shift;
import modelsEntities.Specialist;
import modelsEntities.User;
import repositories.ShiftRepository;
import repositories.SpecialistRepository;
import repositories.UserRepository;

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
    public void createShift(RequestShiftDTO shiftdto){
        //busco el medico con el id
         Specialist medic = specialistRepository.findById(shiftdto.getIdSpecialist());
         //busco el usuario por el nombre
         User user = userRepository.findByName(shiftdto.getNamePacient());
         //Yo usaria el id, but tengo que cambiar el DTO y lo que recibe, dejo el codigo
        //User user = userRepository.findById(shiftdto.getIdPacient);

         Shift s = new Shift(shiftdto.getMotive(), user, medic);
         shiftRepository.persist(s);
    }

}
