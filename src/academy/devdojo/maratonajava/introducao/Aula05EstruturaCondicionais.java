package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean IsAutorizadoComprarBebida = idade >= 18;
        if (IsAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebidas alcoólicas.");
        }
        if (!IsAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebidas alcoólicas.");
        }

        int salario = 3500;
        boolean IsAutorizadoComprarIphone = salario >= 4500;
        if (IsAutorizadoComprarIphone) {
            System.out.println("Autorizado a comprar um Iphone.");
        }
        if (!IsAutorizadoComprarIphone) {
            System.out.println("Não Autorizado a comprar um Iphone.");
        }
    }
}
