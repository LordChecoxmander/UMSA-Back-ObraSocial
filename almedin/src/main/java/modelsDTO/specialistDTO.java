package modelsDTO;

import config.JsonParser;

public class SpecialistDTO {

    //Attributes
    private Long id;
    private String name;
    private String speciality;
    private String ubication;
    private JsonParser schedule;

    //Constructors
    public SpecialistDTO(Long id, String name, String speciality, String ubication, JsonParser schedule) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.ubication = ubication;
        this.schedule = schedule;
    }

    public SpecialistDTO() {
    }
}

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public JsonParser getSchedule() {
        return schedule;
    }

    public void setSchedule(JsonParser schedule) {
        this.schedule = schedule;
    }