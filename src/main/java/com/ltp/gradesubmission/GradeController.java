package com.ltp.gradesubmission;

import java.util.ArrayList;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class GradeController {
    List<Grade> studentGrades = new ArrayList<>();
    
        @GetMapping("/")
        public String gradeForm(Model model) {
            model.addAttribute("grade", new Grade());
            return "form";
        }
        

        @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", studentGrades);
        return "grades";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(Grade grade) {
        studentGrades.add(grade);
        return "redirect:/grades";
    }
    
}
