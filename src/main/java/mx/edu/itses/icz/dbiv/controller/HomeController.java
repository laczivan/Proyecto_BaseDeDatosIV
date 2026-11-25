package mx.edu.itses.icz.dbiv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("titulo", "Inicio - Gestión de Productos");
        return "home/index";
    }
}