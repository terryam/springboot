package com.getPost;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller                               // Affiche une requête simple, @RestController affiche une requête JSON
public class HelloController {

    @GetMapping("hi")
    @ResponseBody                         // Permet d'afficher la requete sur le body, associée à @Controller
    public String sayHi() {              // On crée un point d'entrée avec cette methode sayHi

        return "<h1>Salut</h1>";
    }

}
