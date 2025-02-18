package academy.devdojo.maratonajava.orientacaoobjetos.test;

import academy.devdojo.maratonajava.orientacaoobjetos.dominio.Carro;


public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Mustang";
        carro01.modelo = "GT";
        carro01.ano = 2000;

        carro02.nome = "Ferrari";
        carro02.modelo = "lamborguini";
        carro02.ano = 2000;

        System.out.println("CARRO 1");
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("\nCARRO 2");
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);
    }
}
