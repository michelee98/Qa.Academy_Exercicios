package medium;

import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        String[] alunosVetor = new String[3];
        int[] numeroAlunosVetor = new int[3];
        int i = 0;

       while(i<7){
            alunosVetor[i] = JOptionPane.showInputDialog("digite o nome do aluno");
            numeroAlunosVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno"));

            i++;
        }
        i=0;
        while (i<7){
            System.out.println("o nome do Aluno: " +alunosVetor[i] + "-"+ "Numero do aluno:"+numeroAlunosVetor[i]);
            i++;



        }
        
    }


    
}
