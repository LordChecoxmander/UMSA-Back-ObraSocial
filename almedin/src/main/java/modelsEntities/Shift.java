package modelsEntities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@ApiModel(value= "shift", description = "representacion de los turnos")
@Entity
@Table(name = "Shifts")
public class Shift {
    //Attributes
    @ApiModelProperty(notes="id numerico autoincremental y unico de cada turno")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ApiModelProperty(notes="fecha del turno", example = "3/08/2024", required = true)
    @Column(name = "date")
    private LocalDate date;

    @ApiModelProperty(notes="motivo de la turno", example = "fractura expuesta de pierna",
            required = true)
    @Column(name = "motive")
    private String motive;

    @ApiModelProperty(notes="estado del turno, activo o finalizado",
            required = true)
    @Column(name = "turno_state")
    private boolean turnoState;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_specialist", referencedColumnName = "id")
    private Specialist specialist;

    //Constructors

    public Shift() {

    }

    //constructor que setea por defecto la fecha y el estado
    public Shift(String motive, User user, Specialist specialist) {
        this.motive = motive;
        this.user = user;
        this.specialist = specialist;
        this.date = LocalDate.now();
        this.turnoState = true;
    }

    public Shift(Long id, Specialist specialist, User user, String motive, boolean turnoState, LocalDate date) {
        this.id = id;
        this.specialist = specialist;
        this.user = user;
        this.motive = motive;
        this.turnoState = turnoState;
        this.date = date;
    }

//Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public boolean isTurnoState() {
        return turnoState;
    }

    public void setTurnoState(boolean turnoState) {
        this.turnoState = turnoState;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

}
