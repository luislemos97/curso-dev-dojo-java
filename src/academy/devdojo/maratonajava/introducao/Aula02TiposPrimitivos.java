package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {

        int idade = (int) 1000000000l;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0d;
        float  salarioFloat = (float)2500d;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Luis";

        System.out.println("A idade é " +idade+ " anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(salarioFloat);
        System.out.println("O meu nome é "+nome);
    }
}
