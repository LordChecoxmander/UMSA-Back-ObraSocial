package services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import modelsDTO.ResponseSpecialistDTO;
import modelsEntities.Specialist;
import repositories.SpecialistRepository;

import java.util.List;

@Transactional
@ApplicationScoped
public class SpecialistService {

    @Inject
    private SpecialistRepository specialistRepository;

    public List<ResponseSpecialistDTO> getAllSpecialists() {

        return specialistRepository.getAllSpecialistsResponse();
    }

}
