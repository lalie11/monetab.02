package ci.digitalacademy.monetab.services.dto;

import ci.digitalacademy.monetab.models.Student;
import jakarta.persistence.*;

import java.util.Date;

public class AbsenceDTO {


    private Long Id;

    private Date AbsenceDate;


    private int AbsenceNumber;

    @ManyToOne
    @JoinColumn(name = "Student_id")
    private Student student;
}
