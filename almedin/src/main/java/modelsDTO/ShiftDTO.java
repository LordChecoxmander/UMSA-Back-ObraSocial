package modelsDTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ShiftDTO implements Serializable {

    //Attributes
    private String namePacient;
    private LocalDateTime date;
    private Long idSpecialist;
    private String motive;

    //Constructors

    public ShiftDTO(String namePacient, LocalDateTime date, Long idSpecialist, String motive) {
        this.namePacient = namePacient;
        this.date = date;
        this.idSpecialist = idSpecialist;
        this.motive = motive;
    }

    public ShiftDTO() {}

    //Getters and Setters


    public String getNamePacient() {
        return namePacient;
    }

    public void setNamePacient(String namePacient) {
        this.namePacient = namePacient;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Long getIdSpecialist() {
        return idSpecialist;
    }

    public void setIdSpecialist(Long idSpecialist) {
        this.idSpecialist = idSpecialist;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }
}
