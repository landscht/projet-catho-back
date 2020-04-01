package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@IdClass(BibliothequeId.class)
public class Bibliotheque implements Serializable {

    @Id
    private String login;

    @Id
    private int id_game;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId_game() {
        return id_game;
    }

    public void setId_game(int id_game) {
        this.id_game = id_game;
    }
}
