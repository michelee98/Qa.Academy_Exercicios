package easy;

public class Exercicio09 {
    public void numeroDigitado(){
        int numeroDigitado, i = 1, resultado;
        String numeroDigitadoStg = "10";
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);
        while (i <= 10) {
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + " X " + i + " = " + resultado);
            i++; // soma do i+1 para entrar em loop infinito
        }
        System.out.println("fim do algoritimo");

    }
}// fim da classe
