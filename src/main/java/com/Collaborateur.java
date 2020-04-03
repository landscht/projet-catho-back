package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Collaborateur {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) long id;

    private String nom;
    private String prenom;
    private String matricule;
    private Date date_entree;
    private Date debut_periode;
    private Date date_sortie;
    private float heure_hebdomadaire;
    private int year;
    private float totalJour;
    private float totalConge;
    private float totalWe;
    private float totalJourFerie;
    private float totalJourTravail;
    private float totalSemaine;
    private float totalHeure;
    private float totalMinDay;
    private float totalDayProra;
    private float totalWorkPeriod;
    private float totalRtt;
    private float avenant;
    private String service;
    private String statut;
    private float totalCongeAnciennete;
    private float penalisationConge;
    private float reporte;
    private String commentaire;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Date getDate_entree() {
        return date_entree;
    }

    public void setDate_entree(Date date_entree) {
        this.date_entree = date_entree;
    }

    public Date getDate_sortie() {
        return date_sortie;
    }

    public void setDate_sortie(Date date_sortie) {
        this.date_sortie = date_sortie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getTotalJour() {
        return totalJour;
    }

    public void setTotalJour(float totalJour) {
        this.totalJour = totalJour;
    }

    public float getTotalConge() {
        return totalConge;
    }

    public void setTotalConge(float totalConge) {
        this.totalConge = totalConge;
    }

    public float getTotalWe() {
        return totalWe;
    }

    public void setTotalWe(float totalWe) {
        this.totalWe = totalWe;
    }

    public float getTotalJourFerie() {
        return totalJourFerie;
    }

    public void setTotalJourFerie(float totalJourFerie) {
        this.totalJourFerie = totalJourFerie;
    }

    public float getTotalJourTravail() {
        return totalJourTravail;
    }

    public void setTotalJourTravail(float totalJourTravail) {
        this.totalJourTravail = totalJourTravail;
    }

    public float getTotalSemaine() {
        return totalSemaine;
    }

    public void setTotalSemaine(float totalSemaine) {
        this.totalSemaine = totalSemaine;
    }

    public float getTotalHeure() {
        return totalHeure;
    }

    public void setTotalHeure(float totalHeure) {
        this.totalHeure = totalHeure;
    }

    public float getTotalMinDay() {
        return totalMinDay;
    }

    public void setTotalMinDay(float totalMinDay) {
        this.totalMinDay = totalMinDay;
    }

    public float getTotalDayProra() {
        return totalDayProra;
    }

    public void setTotalDayProra(float totalDayProra) {
        this.totalDayProra = totalDayProra;
    }

    public float getTotalWorkPeriod() {
        return totalWorkPeriod;
    }

    public void setTotalWorkPeriod(float totalWorkPeriod) {
        this.totalWorkPeriod = totalWorkPeriod;
    }

    public float getTotalRtt() {
        return totalRtt;
    }

    public void setTotalRtt(float totalRtt) {
        this.totalRtt = totalRtt;
    }

    public float getAvenant() {
        return avenant;
    }

    public void setAvenant(float avenant) {
        this.avenant = avenant;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public float getTotalCongeAnciennete() {
        return totalCongeAnciennete;
    }

    public void setTotalCongeAnciennete(float totalCongeAnciennete) {
        this.totalCongeAnciennete = totalCongeAnciennete;
    }

    public float getPenalisationConge() {
        return penalisationConge;
    }

    public void setPenalisationConge(float penalisationConge) {
        this.penalisationConge = penalisationConge;
    }

    public float getHeure_hebdomadaire() {
        return heure_hebdomadaire;
    }

    public void setHeure_hebdomadaire(float heure_hebdomadaire) {
        this.heure_hebdomadaire = heure_hebdomadaire;
    }

    public float getReporte() {
        return reporte;
    }

    public void setReporte(float reporte) {
        this.reporte = reporte;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDebut_periode() {
        return debut_periode;
    }

    public void setDebut_periode(Date debut_periode) {
        this.debut_periode = debut_periode;
    }
}
