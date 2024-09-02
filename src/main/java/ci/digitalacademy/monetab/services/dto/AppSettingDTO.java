package ci.digitalacademy.monetab.services.dto;

import ci.digitalacademy.monetab.models.School;
import jakarta.persistence.*;

public class AppSettingDTO {


    private Long id;


    private int smtpPort;


    private String smtpServer;


    private String smtpUserName;


    private String smtpPassword;


    private SchoolDTO schoolDTO;
}
