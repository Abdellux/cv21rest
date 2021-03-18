package fr.univrouen.cv21rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.univrouen.cv21rest.model.CV;

@RestController
public class GetCVController {
    
    @GetMapping("/resume")
    public String getListCVinXML()
    {
        return"Envoi de la liste des CV";
    }
    
    @GetMapping("/id")
    public String getCVinXML(@RequestParam(value="name") String text) 
    {
        return ("Détail du CV demandé " + text);
    }

    @GetMapping("/test")
    public String TestUrl(@RequestParam(value="nb") Integer id, @RequestParam(value="texte") String texte) {
        return "<li> Test: </li>" + "<li> Id: " + id + "</li>" + "<li>titre: " + texte + "</li>"; 
    }

    @RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public CV getXML() 
    {
        CV cv = new CV("HAMILTON","Margaret","1969/07/21","Appollo11@nasa.us");
        return cv;
    }
}
