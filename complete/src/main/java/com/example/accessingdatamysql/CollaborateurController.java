package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/coll")
public class CollaborateurController {

    @Autowired
    private CollaborateurRepository collaborateurRepository;

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/add")
    public @ResponseBody HttpStatus addNewColl(@RequestBody Collaborateur collaborateur) {
        collaborateurRepository.save(collaborateur);
        return HttpStatus.CREATED;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/getAll")
    public @ResponseBody Iterable<Collaborateur> getAll() {
        return collaborateurRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/getAllByMatricule")
    public @ResponseBody Iterable<Collaborateur> getAllByMatricule(@RequestParam String matricule) {
        return collaborateurRepository.getAllByMatricule(matricule);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/getAllMatricule")
    public @ResponseBody Iterable<String> getAllMatricule() {
        return collaborateurRepository.getAllMatricule();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping("/deleteFicheById")
    public @ResponseBody HttpStatus deleteFicheById(@RequestParam long id) {
        collaborateurRepository.deleteById(id);
        return HttpStatus.OK;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PutMapping("/updateById")
    public @ResponseBody Collaborateur updateById(@RequestBody Collaborateur collaborateur) {
        return collaborateurRepository.save(collaborateur);
    }
}
