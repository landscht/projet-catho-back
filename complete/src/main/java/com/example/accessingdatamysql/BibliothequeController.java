package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo/game")
public class BibliothequeController implements BibliothequeService {

    @Autowired
    private BibliothequeRepository bibliothequeRepository;

    @PostMapping(path = "/addGame")
    public @ResponseBody
    HttpStatus addNewGame(@RequestParam String login, @RequestParam int id_game) {
        Bibliotheque tmp = bibliothequeRepository.findWithLoginAndId_game(login, id_game);
        if(tmp == null) {
            Bibliotheque b = new Bibliotheque();
            b.setLogin(login);
            b.setId_game(id_game);
            bibliothequeRepository.save(b);
            return HttpStatus.CREATED;
        }
        return HttpStatus.UNAUTHORIZED;
    }

    @GetMapping(path = "/getGameByLogin")
    public @ResponseBody Iterable<Bibliotheque> getAllGameByLogin(@RequestParam String login) {
        return bibliothequeRepository.findAllByLogin(login);
    }
}
