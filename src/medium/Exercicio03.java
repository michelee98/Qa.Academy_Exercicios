package medium;

public class Exercicio03 {
    public static void main(String[] args) {
        int i = 0,soma = 0;
        while(i<=1000){
        soma = soma+i;
        if(soma>=1500){
          break;
        }

        System.out.println(soma);
        i++;
        
      }
    }
  
}
