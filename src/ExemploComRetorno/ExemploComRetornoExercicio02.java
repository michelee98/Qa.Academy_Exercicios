package ExemploComRetorno;



public class ExemploComRetornoExercicio02 {
    public static void main(String[] args) {
        String status = verificarAprovacao();
        System.out.println(status);
    }

    public static String verificarAprovacao() {
        int nota = 10;
        if (nota >= 5) {
            return "Aprova" + (nota);
        }else {

            return "Reprovado";
        }
            

    }public static String verificarReprovacao() {
        int nota = 10;
        if (nota <= 5) {
            return "Reprovado" + (nota);
        }else {
            return "Aprova";

        }
    }

}
