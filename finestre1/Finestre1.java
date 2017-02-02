/*
 Chiedere in input un valore e stampare "quante finestre vuoi stampare?"
 e aprire un numero di finestre quante scelte da utente.
 */
package finestre1;

/**
 *
 * @author studente
 */
import java.util.Scanner;

public class Finestre1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;
        Finestra f;
        do {
            System.out.println("Quante finestre vuoi stampare? ");
            n = input.nextInt();
        } while ((n < 0) || (n > 150));
        for (i = 0; i < n; i++) {
            f = new Finestra();
            f.setVisible(true);
            f.setLocation(150 + (i * 120), 150 + (i * 101));
            f.testo.setText("sono la finestra " + (i + 1));
            f.setTitle("ciao sono una finestra");
        }
    }

}
