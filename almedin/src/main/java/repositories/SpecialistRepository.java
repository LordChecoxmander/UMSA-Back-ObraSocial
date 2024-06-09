package repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import modelsDTO.ResponseSpecialistDTO;
import modelsEntities.Specialist;


import java.util.List;

@Transactional
@ApplicationScoped
public class SpecialistRepository implements PanacheRepository<Specialist> {

    @Inject
    private EntityManager em;

    //Creo una query para devolver los especialistas sin su id(el ResponseSpecialistDTO)
    public List<ResponseSpecialistDTO> getAllSpecialistsResponse() {
        return em.createQuery("SELECT p.name, p" + ".ubication, p.speciality, p" + ".schedule " + "FROM Specialist" + " p", ResponseSpecialistDTO.class).getResultList();
    }
}
