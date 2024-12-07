package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    @RequestMapping("/welcome")
    public String displayWelcomeMessage() {
        return "welcome";
    }

    @RequestMapping("/test")
    public String renderTestPage() {
        return "test";
    }

    @RequestMapping("/showInfo")
    public String displayInfo(@RequestParam int id, @RequestParam String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo";
    }

    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "calculateSum";
    }

    @RequestMapping("/employeeForm")
    public String showEmployeeForm() {
        return "employeeForm";
    }

    @RequestMapping("/addNumbers")
    public String addNumbers(@RequestParam int num1, @RequestParam int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "addNumbers";
    }

    @RequestMapping("/combine")
    public String combineStrings(@RequestParam String str1, @RequestParam String str2, Model model) {
        model.addAttribute("combined", str1 + " " + str2);
        return "combine";
    }

    @RequestMapping("/calculate")
    public String calculateOperations(@RequestParam int num1, @RequestParam int num2, Model model) {
        model.addAttribute("addition", num1 + num2);
        model.addAttribute("multiplication", num1 * num2);
        return "calculate";
    }
}
