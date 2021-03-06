/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli.objets;

import java.util.Date;

/**
 *
 * @author Geoffrey
 */
public class CompteCourant extends Compte {

    private double seuilCritique;
    private double montantAlimentation;
    private double seuilEpargne;
    private CompteCourantState state;
    private CompteEpargne compteEpargneADebiter;
    private CompteEpargne compteEpargneACrediter;


    public CompteCourant(Integer id_compte, double solde, Date dateOuverture, double seuilCritique, double montantAlimentation, double seuilEpargne) {
        super(id_compte, solde, dateOuverture);
        this.seuilCritique=seuilCritique;
        this.seuilEpargne=seuilEpargne;
        this.montantAlimentation=montantAlimentation;
    }

    public enum CompteCourantState {
        JAVA,
        C,
        CPlus,
        PHP;
    }

    public double getSeuilCritique() {
        return seuilCritique;
    }

    public void setSeuilCritique(double seuilCritique) {
        this.seuilCritique = seuilCritique;
    }

    public double getMontantAlimentation() {
        return montantAlimentation;
    }

    public void setMontantAlimentation(double montantAlimentation) {
        this.montantAlimentation = montantAlimentation;
    }

    public double getSeuilEpargne() {
        return seuilEpargne;
    }

    public void setSeuilEpargne(double seuilEpargne) {
        this.seuilEpargne = seuilEpargne;
    }

    public CompteCourantState getState() {
        return state;
    }

    public void setState(CompteCourantState state) {
        this.state = state;
    }

    public CompteEpargne getCompteEpargneADebiter() {
        return compteEpargneADebiter;
    }

    public void setCompteEpargneADebiter(CompteEpargne compteEpargneADebiter) {
        this.compteEpargneADebiter = compteEpargneADebiter;
    }

    public CompteEpargne getCompteEpargneACrediter() {
        return compteEpargneACrediter;
    }

    public void setCompteEpargneACrediter(CompteEpargne compteEpargneACrediter) {
        this.compteEpargneACrediter = compteEpargneACrediter;
    }

    
    

}
