package co.develhope.Esercizio3Spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NameController {

    @GetMapping
    public String get() {
        return "Felipe";
    }

}
