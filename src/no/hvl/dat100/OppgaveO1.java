package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		int student = 0;
		for(int i = 1; i <=10; i++) {
		int poeng = Integer.parseInt(showInputDialog("Skriv inn poengsum:"));
		
		if (poeng<= 0) {
			showMessageDialog (null, "ugyldig poengsum");
			
		}else if(0 <= poeng && poeng <= 39) {
			showMessageDialog (null, "karakter F");
		
		}else if(40 <= poeng && poeng <= 49) {
			showMessageDialog (null, "karakter E");
			
		}else if(50 <= poeng && poeng <= 59) {
			showMessageDialog (null, "karakter D");
			
		}else if(60 <= poeng && poeng <= 79) {
			showMessageDialog (null, "karakter C");
			
		}else if(80 <= poeng && poeng <= 89) {
			showMessageDialog (null, "karakter B");
			
		}else if(90 <= poeng && poeng <= 100) {
			showMessageDialog (null, "karakter A");
		
		}else {
			showMessageDialog (null, "ugyldig poengsum");
		}
	}
}
}
