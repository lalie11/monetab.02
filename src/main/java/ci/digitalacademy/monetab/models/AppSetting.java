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
@Table(name = "AppSetting")
public class AppSetting implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "smtp_port", nullable = false)
    private int smtpPort;

    @Column(name = "smtp_server", nullable = false)
    private String smtpServer;

    @Column(name = "smtp_username")
    private String smtpUserName;

    @Column(name = "smtp_password")
    private String smtpPassword;

    @OneToOne
    @JoinColumn(name = "school_id")
    private School school;
}
