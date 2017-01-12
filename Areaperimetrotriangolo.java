/
package areaperimetrotriangolo;

import java.util.Scanner;

/*Sanguigni LorenzoDavide 4*INB
 */
public class Areaperimetrotriangolo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l1;
        int l2;
        int l3;
        int h;
        float per;
        float area;
        do {
            System.out.println("inserisci il valore del primo lato: ");
            l1 = input.nextInt();
            System.out.println("inserisci il valore del secondo lato: ");
            l2 = input.nextInt();
            System.out.println("inserisci il valore del terzo lato: ");
            l3 = input.nextInt();
            System.out.println("inserisci il valore del altezza: ");
            h = input.nextInt();
        } while ((l1 < 0) || (l1 > l2 + l3) || (l2 < 0) || (l2 > l1 + l3) || (l3 < 0) || (l3 > l2 + l1) || (h < 0));
        per = l1 + l2 + l3;
        area = (l2 * h) / 2;

        System.out.println("Perimetro: " + per);
        System.out.println("Area: " + area);

    }
}