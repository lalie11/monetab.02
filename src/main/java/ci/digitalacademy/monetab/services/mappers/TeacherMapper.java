package ci.digitalacademy.monetab.services.mappers;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;

public final class TeacherMapper {

    private TeacherMapper(){}

    public static TeacherDTO toDto(Teacher teacher){
        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setId(teacher.getId());
        teacherDTO.setFirstName(teacher.getFirstName());
        teacherDTO.setLastName(teacher.getLastName());
        teacherDTO.setVille(teacher.getVille());
        teacherDTO.setTelephone(teacher.getTelephone());
        teacherDTO.setEmail(teacher.getEmail());
        teacherDTO.setMatiere(teacher.getMatiere());
        teacherDTO.setGenre(teacher.getGenre());
        teacherDTO.setVaccant(teacher.getVaccant());
        return teacherDTO;
    }

    public static Teacher toEntity(TeacherDTO teacherDTO){
        Teacher teacher = new Teacher();
        teacher.setId(teacherDTO.getId());
        teacher.setFirstName(teacherDTO.getFirstName());
        teacher.setLastName(teacherDTO.getLastName());
        teacher.setVille(teacherDTO.getVille());
        teacher.setVaccant(teacherDTO.getVaccant());
        teacher.setGenre(teacherDTO.getGenre());
        teacher.setTelephone(teacherDTO.getTelephone());
        teacher.setMatiere(teacherDTO.getMatiere());
        teacher.setEmail(teacherDTO.getEmail());
        return teacher;

    }
}
