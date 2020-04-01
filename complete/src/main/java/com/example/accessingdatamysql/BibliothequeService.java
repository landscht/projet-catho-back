package com.example.accessingdatamysql;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public interface BibliothequeService {

    public HttpStatus addNewGame(String login, int id_game);

    public Iterable<Bibliotheque> getAllGameByLogin(String login);
}
