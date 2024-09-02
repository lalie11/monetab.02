package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.services.StudentService;
import ci.digitalacademy.monetab.services.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
@Slf4j
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/add")
    public String addShowStudentForms(Model model){
        log.debug("Request to add show students forms");
        model.addAttribute("student", new Student());
        return "students/form";
    }

    @PostMapping
    public String saveStudent(StudentDTO student){
        log.debug("Request to save teacher :{}", student);
        studentService.save(student);
        return "redirect:/students";
    }


    @GetMapping
    public String showStudentPages(Model model){
        final List<StudentDTO> students = studentService.findAll();
        model.addAttribute("students", students);
        return "students/add";

    }

    @GetMapping("/{id}")
    public String showUpdateStudentForms(Model model, @PathVariable Long id){
        log.debug("Request to show update student forms");
        Optional<StudentDTO> student = studentService.findOne(id);
        if (student.isPresent()){
            model.addAttribute("student", student.get());
            return "students/form";
        }
        else {
            return "redirect:/students";
        }

    }

    @PostMapping("/{id}")
    public String showDeleteStudent( @PathVariable Long id){
        log.debug("Request delete student");
        studentService.delete(id);
        return "redirect:/students";
    }






}
