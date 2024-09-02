package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;

import java.util.Date;

public class StudentCards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference")
    private String reference;

    @Column(name = "issu_date")
    private Date issuDate;

    @Column(name = "expiration_date")
    private Date expirationDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
