package ci.digitalacademy.monetab.models;

import ci.digitalacademy.monetab.models.enumeration.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "person")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "person_type")
public abstract class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email",  unique = true, nullable = false)
    private String email;

    @Column(name = "telephone", unique = true, nullable = false)
    private String telephone;

    @Column(name = "url_picture")
    private String urlpicture;

    @Column(name = "ville", nullable = false)
    private String ville;

    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @OneToOne
    @JoinColumn(name = "user_id" )
    private User user;

    @OneToOne
    @JoinColumn(name = "adress_id")
    private Adresse adresse;
}
