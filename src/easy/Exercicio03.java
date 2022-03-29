package easy;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public void retornaNumeroDigitado(){
        String numeroDigitado1;
        String numeroDigitado2;
        numeroDigitado1 = JOptionPane.showInputDialog("numeroDigitado1");
        numeroDigitado2 = JOptionPane.showInputDialog("numeroDigitado2");
        System.out.println("o valor do primeiro numero é:" + numeroDigitado1);
        System.out.println("o valor do primeiro numero é:" + numeroDigitado2);
    }

}
