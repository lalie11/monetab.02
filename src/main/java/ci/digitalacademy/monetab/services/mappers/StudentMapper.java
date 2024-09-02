package ci.digitalacademy.monetab.services.mappers;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.services.dto.StudentDTO;

public final class StudentMapper {

    private StudentMapper (){}

    public static StudentDTO toDto(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setClasse(student.getClasse());
        studentDTO.setVille(student.getVille());
        studentDTO.setGenre(student.getGenre());
        studentDTO.setDateNaissance(student.getDateNaissance());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setMatricule(student.getMatricule());
        studentDTO.setTelephone(student.getTelephone());
        return studentDTO;
    }

    public static Student toEntity(StudentDTO studentDTO){
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setEmail(studentDTO.getEmail());
        student.setClasse(studentDTO.getClasse());
        student.setVille(studentDTO.getVille());
        student.setGenre(studentDTO.getGenre());
        student.setDateNaissance(studentDTO.getDateNaissance());
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setMatricule(studentDTO.getMatricule());
        student.setTelephone(studentDTO.getTelephone());
        return student;
    }
}
