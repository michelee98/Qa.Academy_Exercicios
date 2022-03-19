package ExemploSemRetorno;

public class ExemploComParametro {
    public static void main(String[] args) {
        exemploComParametro1("Michele");
        exemploComParametroSemRetorno5("Roni");
        exemploComParametroSem3("Maria");
        exemploComParametro4("Silai");
        exemploComParametroSemRetorno5("Mika");
        System.out.println(exemploComParametro2ComRetorno("Com Cards2"));
        
        
    }

    public static void exemploComParametro1(String cardsUm){
        System.out.println(cardsUm);  
    }
    public static void exemploComParametroSemRetorno2(String cardsDois){
        System.out.println(cardsDois);  
    }
    public static void exemploComParametroSem3(String cardsTres){
        System.out.println(cardsTres);  
    }
    public static void exemploComParametro4(String cardsQuatro){
        System.out.println(cardsQuatro);  
    }
    public static void exemploComParametroSemRetorno5(String cardsCinco){
        System.out.println(cardsCinco);  
    }

    public static String exemploComParametro1ComRetorno(String cardsUm){
        System.out.println(cardsUm);
        return cardsUm;  
    }
    public static String exemploComParametro2ComRetorno(String cardsDois){
        System.out.println(cardsDois);
        return cardsDois;  
    }
    public static String exemploComParametro3ComRetorno(String cardsTres){
        System.out.println(cardsTres);
        return cardsTres;  
    }
    public static String exemploComParametro4ComRetorno(String cardsQuatro){
        System.out.println(cardsQuatro);
        return cardsQuatro;  
    }
    public static String exemploComParametroSComRetorno5(String cardsCinco){
        System.out.println(cardsCinco);
        return cardsCinco;  
    }
         
    
}



        
    

