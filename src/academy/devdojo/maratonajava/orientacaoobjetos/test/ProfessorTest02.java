package academy.devdojo.maratonajava.orientacaoobjetos.test;

import academy.devdojo.maratonajava.orientacaoobjetos.dominio.Professor;

public class ProfessorTest02 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Luis"; 
        professor.idade = 27; 
        professor.sexo = 'M'; 

        System.out.println("Nome:" + professor.nome + "idade:" + professor.idade + " sexo:"+ professor.sexo);
    }
}
