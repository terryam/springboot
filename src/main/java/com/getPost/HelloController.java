package com.getPost;

 // return JSON Request
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController                               //  @RestController affiche une requête JSON
public class HelloController {

    /* GET request*/
    @GetMapping("hi")
    public Personne sayHi() {         // On crée un point d'entrée avec cette methode sayHi

        Personne rock = new Personne();
        rock.setNom("Amir");
        rock.setPrenom("Samir");
        rock.setAge(150);

        /* addong addresse to Personne */
        Adresse adress =  new Adresse(12,"Panurge","Montpellier");

        // On affecte l'adresse à Rock
        rock.setAdresse(adress);

        // On  renvoie la requête pour l'afficher
        return rock;
    }

    /* POST request using POSTMAN (http client)*/
    @PostMapping("hi")
    public String addpersonne(@RequestBody Personne pers) {   // @RequestBody va récupérer la requête envoyée

        System.out.println(pers);
        return"La personne a été ajoutée";
    }

}
