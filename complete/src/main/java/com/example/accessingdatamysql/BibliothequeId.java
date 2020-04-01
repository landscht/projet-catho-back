package com.example.accessingdatamysql;


import java.io.Serializable;
import java.util.Objects;

public class BibliothequeId implements Serializable {
    private String login;
    private int id_game;

    public BibliothequeId() {}

    public BibliothequeId(String login, int id_game) {
        this.login = login;
        this.id_game = id_game;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BibliothequeId bibliothequeId = (BibliothequeId) o;
        return login.equals(bibliothequeId.login) &&
                id_game == bibliothequeId.id_game;
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, id_game);
    }
}
