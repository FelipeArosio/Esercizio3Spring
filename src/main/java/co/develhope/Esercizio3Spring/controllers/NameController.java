package co.develhope.Esercizio3Spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api")
public class NameController {

    @GetMapping ("/name")
    public String get() {
        return "Felipe";
    }

    @PostMapping ("/name/reverse")
    public String reverseName (@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return reversedName.toString();
    }

}
