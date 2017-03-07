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
public class CompteEpargne extends Compte{ 
    
    private double tauxInteret;
    private String typeEpargne;
    
    public CompteEpargne(Integer id_compte, double solde, Date dateOuverture, double tauxInteret, String typeEpargne) {
        super(id_compte, solde, dateOuverture);
        this.tauxInteret = tauxInteret;
        this.typeEpargne = typeEpargne;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public String getTypeEpargne() {
        return typeEpargne;
    }

    public void setTauxInteret(Integer tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void setTypeEpargne(String typeEpargne) {
        this.typeEpargne = typeEpargne;
    }
    
}