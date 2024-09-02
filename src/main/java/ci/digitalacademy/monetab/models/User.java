package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "User")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "pseudo", unique = true, nullable = false)
    private String pseudo;

    @Column(name = "password", nullable = false)
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="creationDate", nullable = false)
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

//    @OneToOne
//    @JoinColumn(name = "Adresse")
//    private Adresse adresse;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", password='" + password + '\'' +
                ", creationDate=" + creationDate +
//                ", adresse=" + adresse.getCountry() +
                '}';
    }
}
