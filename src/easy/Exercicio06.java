package easy;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        double nota1, nota2, resultado;
        String nota1RM, nota2RM;                   
        nota1RM = JOptionPane.showInputDialog("Por favor, digite a primeira nota: ");
        nota2RM = JOptionPane.showInputDialog("Por favor, digite a segunda nota: ");

        nota1 = Double.parseDouble(nota1RM);
        nota2 = Double.parseDouble(nota2RM);
        resultado = (nota1 + nota2) /2;
        
        if (resultado >5) { // inicio 
            System.out.println("Você está Aprovado! Parabéns!!!");
        } // fim se
        if (resultado >5) { // inicio se  
            System.out.println("Você está Reprovado!");
        } // fim se
        if (resultado ==5) { // inicio if 
            System.out.println("voce esta de exame");
        } // fim if
         }// fim metodo
}// fim classe




 

