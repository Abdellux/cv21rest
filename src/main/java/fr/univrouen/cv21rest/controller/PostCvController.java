package fr.univrouen.cv21rest.controller;

import fr.univrouen.cv21rest.model.TestCV;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;


@RestController
public class PostCvController {
   
    @RequestMapping(value = "/testpost", method = RequestMethod.POST, consumes = "application/xml")
    public String postTest(@RequestBody String cv) 
    {
        return ("<result><response>Message reçu : </response>"+ cv + "</result>");
    }

    @PostMapping(value = "/postcv", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public String postCV()
    {
        TestCV cv = new TestCV();
        return cv.loadFileXML();
    }
}
