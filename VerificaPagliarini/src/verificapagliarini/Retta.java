/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificapagliarini;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author studente
 */
public class Retta {

    protected double a1, b1, c1;

    public Retta(double a, double b, double c) {
        if((a==0)&&(b==0)){
            try {
                throw new Exception("Errore, non è una retta.\n");
            } catch (Exception ex) {
                System.out.println("Errore, non è una retta.\n");
            }
        }
        this.a1 = a;
        this.b1 = b;
        this.c1 = c;
    }

    public String getTipo() {
        if ((a1 != 0) && (b1 != 0)) {
            return "OBLIQUA";
        }
        if (a1 == 0) {
            return "ORIZZONTALE";
        }
        if (b1 == 0) {
            return "VERTICALE";
        }
        return null;
    }

    public String stampa() {
        String r="";
        if (this.a1!=0){
            r+=this.a1+"x";
        }
        if (this.b1!=0){
            if (this.b1>0){
                r+="+";
            }
            r+=this.b1+"y";
        }
        if (this.c1!=0){
            if (this.c1>0){
                r+="+";
            }
            r+=this.c1;
        }
        r+="=0";
        return r;
    }

    public boolean appartiene(double x, double y) {
        double tot = a1 * x + b1 * y + c1;
        if (tot == 0) {
            return true;
        } else {
            return false;
        }
    }
}
