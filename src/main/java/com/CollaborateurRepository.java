package com;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollaborateurRepository extends CrudRepository<Collaborateur, Long> {

    @Query("select matricule from Collaborateur collaborateur")
    public Iterable<String> getAllMatricule();

    public Iterable<Collaborateur> getAllByMatricule(String matricule);

    public Iterable<Collaborateur> getAllByYear(int year);
}
