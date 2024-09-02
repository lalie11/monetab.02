package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@Table(name = "School")
public class School implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "url_logo")
    private String urllogo;

    @OneToOne(mappedBy = "school", cascade = CascadeType.ALL)
    private AppSetting appSetting;


}
