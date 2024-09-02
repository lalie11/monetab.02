package ci.digitalacademy.monetab.models;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Adresse")
@ToString
public class Adresse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Country")
    private String Country;


    @Column(name = "City")
    private String City;

    @Column(name = "Street" )
    private String Street;

//    @OneToOne(mappedBy = "adresse")
//    private User user;
}
