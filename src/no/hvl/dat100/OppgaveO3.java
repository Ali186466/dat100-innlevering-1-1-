package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

    public static void main(String[] args) {
        int n = Integer.parseInt(showInputDialog("Skriv inn et heltall n > 0:"));

        if (n > 0) {
            long fakultet = beregnFakultet(n);
            showMessageDialog(null, n + "! = " + fakultet);
        } else {
            showMessageDialog(null, "Ugyldig input. Vennligst skriv inn et heltall større enn 0.");
        }
    }

    public static long beregnFakultet(int n) {
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }
}
