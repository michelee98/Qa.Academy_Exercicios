package medium;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        int fatorial, i;
        fatorial = Integer.parseInt(JOptionPane.showInputDialog("digita um numero pra calcular um fatorial"));
        i= fatorial;

        while(i>1){
            fatorial = fatorial * (i-1);
            i--;
        

        }
        System.out.println("o fatorial do numero digitado é" + fatorial);

    }
    
}
