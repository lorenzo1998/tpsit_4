/*
 *obliqua a e b diversi da 0;
orizzontale a=0;
veticale b=0;
 */
package retta;

import java.util.Scanner;

public class Retta {

    public static void main(String[] args) {
        Finestracoeff f1;
        Finestra f;
        f= new Finestra();
        f.setVisible(true);
        
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        double a, b, c;
        do {
            System.out.println("Inserire valore a: ");
            a = input.nextInt();
        } while ((a < 0) || (a > 100));
        do {
            System.out.println("Inserire valore b: ");
            b = input.nextInt();
        } while ((b < 0) || (b > 100));
        do {
            System.out.println("Inserire valore c: ");
            c = input.nextInt();
        } while ((c < 0) || (c > 100));
        do {
            System.out.println("Inserire valore x: ");
            x = input.nextInt();
            System.out.println("Inserire valore y: ");
            y = input.nextInt();
        } while ((x < 0) || (y < 0));
    }

}
