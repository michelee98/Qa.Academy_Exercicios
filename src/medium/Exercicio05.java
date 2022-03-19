package medium;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int numeroDigitado, menorNumero=0, i = 1;
        while (i <= 5) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("digita um numero"));
            if (numeroDigitado < menorNumero || i == 1){
                menorNumero = numeroDigitado;

            }
           i++;
        }
        System.out.println("O número: "+ menorNumero+ "é o menor.");

    }

}
