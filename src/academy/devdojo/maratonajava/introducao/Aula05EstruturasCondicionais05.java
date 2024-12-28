package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    /**
     * (imprima um dia da semana considerando domingo como dia 1, em switch case)
     * char, enus, byte, int , short, String  são os tipos primitivos aceitos.
     */

    public static void main(String[] args) {
        
        byte dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
            System.out.println("Qui");
            break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println(" opção inválida");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher"); 
                break;
            default:
                System.out.println("nenhuma das alternativas");
                break;
        }
    }
}
