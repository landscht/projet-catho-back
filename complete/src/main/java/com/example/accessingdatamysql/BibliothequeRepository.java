package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BibliothequeRepository extends CrudRepository<Bibliotheque, BibliothequeId> {

    @Query("select bibliotheque from Bibliotheque bibliotheque where bibliotheque.login = ?1 and bibliotheque.id_game = ?2")
    public Bibliotheque findWithLoginAndId_game(String login, int id_game);

    public Iterable<Bibliotheque> findAllByLogin(String login);
}
