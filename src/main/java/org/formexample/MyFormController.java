package org.formexample;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by srujangopu on 3/17/16.
 */
@Controller
public class MyFormController {


    @RequestMapping(name = "/studentform", method = RequestMethod.GET)
    public String getForm(Model model){

        Student s1 = new Student();
        model.addAttribute("student", s1);
        return "studentForm";
    }

    @RequestMapping(name = "/studentform", method = RequestMethod.POST)
    public String getForm(@ModelAttribute("student") Student student, Model model){

        System.out.println(student);
        model.addAttribute("student", student);
        return "sucess";
    }
}
