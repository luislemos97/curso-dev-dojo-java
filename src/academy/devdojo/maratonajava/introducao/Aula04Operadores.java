package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    // operadores aritiméticos + - * /

    public static void main(String[] args) {
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 + numero02;

        System.out.println(resultado);

        // %
        int resto = 38 % 7;
        System.out.println(resto);

        // operadores relacionais < > <= >= == !=
        boolean isDezémaiorqueVinte = 10 > 20;
        boolean isDezémenorqueVinte = 10 < 20;
        boolean isDezéigualaVinte = 10 == 20;
        boolean isDezédiferenteaVinte = 10 != 20;
        boolean isDezéMaiorOuIgualqueVinte = 10 >= 20;
        boolean isDezéMenorOuIgualqueVinte = 10 <= 20;


        System.out.println("isDezémaiorqueVinte "+isDezémaiorqueVinte);
        System.out.println("isDezémenorqueVinte "+isDezémenorqueVinte);
        System.out.println("isDezéigualaVinte "+isDezéigualaVinte);
        System.out.println("isDezédiferenteaVinte "+isDezédiferenteaVinte);
        System.out.println("isDezéMaiorOuIgualqueVinte "+isDezéMaiorOuIgualqueVinte);
        System.out.println("isDezéMenorOuIgualqueVinte "+isDezéMenorOuIgualqueVinte);

        // operadores lógicos && and || or

        int idade = 29;
        float salario = 3500f;
        boolean IsDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;
        boolean IsDentroDaLeiMaiorQueTrinta = idade >= 30 && salario <= 4680;

        System.out.println("IsDentroDaLeiMaiorQueTrinta "+IsDentroDaLeiMenorQueTrinta);
        System.out.println("IsDentroDaLeiMaiorQueTrinta "+IsDentroDaLeiMaiorQueTrinta);

        double ValorTotalContaCorrente = 200;
        double ValorTotalContaPoupança = 10000;
        double ValorDoPlaystationCinco = 5000;

        boolean IsPlaystationCincoCompravel = ValorTotalContaCorrente > ValorDoPlaystationCinco || ValorTotalContaPoupança >= ValorDoPlaystationCinco;
        boolean PlaystationCincoCompravel = ValorTotalContaCorrente > ValorDoPlaystationCinco || ValorTotalContaPoupança < ValorDoPlaystationCinco;

        System.out.println("IsPlaystationCincoCompravel "+IsPlaystationCincoCompravel);
        System.out.println("PlaystationCincoCompravel "+PlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador -= 1;
        contador ++;
        contador--;
        ++ contador;
        -- contador;
        System.out.println(contador);

    }
}
