package medium;

public class Exercicio10 {
    public static void main(String[] args) {
        int elemento = 20;
        int [] fibonacci;// é um objeto
        fibonacci = new int[elemento]; // é um objeto
        int i = 2;
        fibonacci[0]= 0;
        fibonacci[1]= 1;

        while (i<20){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        i =0;
        while (i < elemento) {
            System.out.println("Termo: "+(i+1)+" - Valor: " +fibonacci[i]);
            i++;
    }
    
}
}