package com.controllers;

import com.models.Collaborateur;
import com.repository.CollaborateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/coll")
public class CollaborateurController {

    @Autowired
    private CollaborateurRepository collaborateurRepository;

    @CrossOrigin(origins = {"http://localhost:8080","https://projet-catho-front.herokuapp.com"})
    @PostMapping("/add")
    public @ResponseBody HttpStatus addNewColl(@RequestBody Collaborateur collaborateur) {
        collaborateurRepository.save(collaborateur);
        return HttpStatus.CREATED;
    }

    @CrossOrigin(origins = {"http://localhost:8080","https://projet-catho-front.herokuapp.com"})
    @GetMapping("/getAll")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public @ResponseBody Iterable<Collaborateur> getAll() {
        return collaborateurRepository.findAll();
    }

    @CrossOrigin(origins = {"http://localhost:8080","https://projet-catho-front.herokuapp.com"})
    @GetMapping("/getAllByMatricule")
    public @ResponseBody Iterable<Collaborateur> getAllByMatricule(@RequestParam String matricule) {
        return collaborateurRepository.getAllByMatricule(matricule);
    }

    @CrossOrigin(origins = {"http://localhost:8080","https://projet-catho-front.herokuapp.com"})
    @GetMapping("/getAllMatricule")
    public @ResponseBody Iterable<String> getAllMatricule() {
        return collaborateurRepository.getAllMatricule();
    }

    @CrossOrigin(origins = {"http://localhost:8080","https://projet-catho-front.herokuapp.com"})
    @DeleteMapping("/deleteFicheById")
    public @ResponseBody HttpStatus deleteFicheById(@RequestParam long id) {
        collaborateurRepository.deleteById(id);
        return HttpStatus.OK;
    }

    @CrossOrigin(origins = {"http://localhost:8080","https://projet-catho-front.herokuapp.com"})
    @PutMapping("/updateById")
    public @ResponseBody Collaborateur updateById(@RequestBody Collaborateur collaborateur) {
        return collaborateurRepository.save(collaborateur);
    }

    @CrossOrigin(origins = {"http://localhost:8080","https://projet-catho-front.herokuapp.com"})
    @GetMapping("/getById")
    public ResponseEntity getById(@RequestParam long id) {
        Optional<Collaborateur> optional = collaborateurRepository.findById(id);
        if(optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @CrossOrigin(origins = {"http://localhost:8080","https://projet-catho-front.herokuapp.com"})
    @GetMapping("/getAllByYear")
    public ResponseEntity getAllByYear(@RequestParam int year) {
        Iterable<Collaborateur> collaborateurs = collaborateurRepository.getAllByYear(year);
        return ResponseEntity.ok(collaborateurs);
    }
}
