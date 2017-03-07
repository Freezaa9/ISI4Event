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
public class OperationBancaire {

    private int id;
    private TypeOpération typeOpération;
    private double montant;
    private Date date;

    public enum TypeOpération {
        Virement,
        Cheque,
        Depot,
        Retrait;
    }

    public OperationBancaire(int id, TypeOpération typeOpération, double montant, Date date) {
        this.id = id;
        this.typeOpération = typeOpération;
        this.montant = montant;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeOpération getTypeOpération() {
        return typeOpération;
    }

    public void setTypeOpération(TypeOpération typeOpération) {
        this.typeOpération = typeOpération;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
