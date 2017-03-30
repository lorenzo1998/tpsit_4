/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retta;

/**
 *
 * @author studente
 */
public class punti {

    double a, b, c;
    double x, y;

    public String getTipo() {
        if ((a != 0) && (b != 0)) {
            return "Retta obliqua";
        } else if (a == 0) {
            return "Retta orizzontale";
        } else if (b == 0) {
            return"Retta verticale";
        }
        return "";
    }

    public boolean appartiene(double x, double y) {
        this.x = x;
        this.y = y;
        if (((a * x) + (b * y) + c) == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public String stampa(){
        return a+"*x"+b+"*y"+c;
    }

}
