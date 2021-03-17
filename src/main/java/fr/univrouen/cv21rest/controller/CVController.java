package fr.univrouen.cv21rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CVController {
    
    @GetMapping("/resume")
    public String getListCVinXML()
    {
        return"Envoi de la liste des CV";
    }
    
    @GetMapping("/id")
    public String getCVinXML() 
    {
        return"Détail du CV demandé";
    }
}
