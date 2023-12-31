package com.esprit.ms.candidate;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Candidat implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 795450928237931201L;

    @Id
    @GeneratedValue
    private int id;
    private String nom, prenom, email;

    public int getId() {
        return id;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public Candidat() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Candidat(String nom, String prenom, String email) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }



}
