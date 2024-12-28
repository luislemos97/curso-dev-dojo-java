package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 5000 por DevDojo";
        String mensagemNaoDoar = "Eu não vou doar 5000 por DevDojo";
        //(Condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar :mensagemNaoDoar;

        System.out.println(resultado);
    }
}
