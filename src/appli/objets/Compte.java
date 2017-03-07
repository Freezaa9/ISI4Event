/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli.objets;

import java.util.Date;

/**
 *
 * @author Jordi
 */
public class Compte {
    private Integer id_compte;
    private double solde;
    private Date dateOuverture;
    
    
    public Compte(Integer id_compte, double solde, Date dateOuverture){
        this.id_compte=id_compte;
        this.solde=solde;
        this.dateOuverture=dateOuverture;
    }

    public Integer getId_compte() {
        return id_compte;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setId_compte(Integer id_compte) {
        this.id_compte = id_compte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }
    
    public void crediter(Integer ajout){
        this.solde = this.solde + ajout;
    }
    
    public void debiter(Integer retrait){
        this.solde = this.solde - retrait;
    }
}