package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@ToString
@Entity
@Table(name = "Absence")
public class Absence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "Absence_Date")
    private Date AbsenceDate;

    @Column(name = "Absence_Number")
    private int AbsenceNumber;

    @ManyToOne
    @JoinColumn(name = "Student_id")
    private Student student;
}
