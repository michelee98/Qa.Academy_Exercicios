package medium;

public class Exercicio04 {
    public void resultadoMultiplicacao() {
        int i = 1, resultadoMultiplicacao = 1;
        while(i<=1000){
        resultadoMultiplicacao = resultadoMultiplicacao * i; 
        System.out.println("o resultado da multiplicacao: "+ resultadoMultiplicacao);
        if(resultadoMultiplicacao >= 1000){

            resultadoMultiplicacao = 1; 
        }
        i++;
    }





    }
    
}
