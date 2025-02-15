package academy.devdojo.maratonajava.orientacaoobjetos.test;

import academy.devdojo.maratonajava.orientacaoobjetos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Lucy";
        estudante.idade =  21;
        estudante.sexo =  "F";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.idade);

    }
}
