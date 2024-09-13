package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double bruttoinntekt = Double.parseDouble(showInputDialog("Skriv inn bruttoinntekt for person " + i + ":"));
            double trinnskatt = beregnTrinnskatt(bruttoinntekt);
            showMessageDialog(null, "Person " + i + ": Trinnskatt: " + trinnskatt + " kr");
        }
    }

    public static double beregnTrinnskatt(double bruttoinntekt) {
        double trinnskatt = 0;

        if (bruttoinntekt > 1021550) {
            trinnskatt += (bruttoinntekt - 1021550) * 0.174;
            bruttoinntekt = 1021550;
        }
        if (bruttoinntekt > 643800) {
            trinnskatt += (bruttoinntekt - 643800) * 0.134;
            bruttoinntekt = 643800;
        }
        if (bruttoinntekt > 267900) {
            trinnskatt += (bruttoinntekt - 267900) * 0.042;
            bruttoinntekt = 267900;
        }
        if (bruttoinntekt > 190350) {
            trinnskatt += (bruttoinntekt - 190350) * 0.017;
        }
        trinnskatt=trinnskatt+0.5;
        int trinnskattI=(int) trinnskatt;
        return trinnskattI;
    }
}

