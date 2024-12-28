package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicios {
    /* (Calculo do valor do imposto sobre salário)
         *
         * $0 a $34,712  9.78%
         * $34,713  a $68,587 37.35%
         * $68,588 49.58%
         */
    public static void main(String[] args) {
        double salarioAnual = 78000;
        double primeiraFaixa = 9.78 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.58 / 100;
        double valorImposto = 0;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68587) {
            valorImposto = salarioAnual  * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
