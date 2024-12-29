package academy.devdojo.maratonajava.introducao;

/*Utilizando Switch e dados os valores de 1 a 7 imprima os dias úteis da semana, considerando domingo como dia 1.
 *
 */
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 3;
        
        switch (dia) {
            case 1:
            case 7:
                System.out.println(" Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(" dias úteis");
                break;
            default:
                break;
        }
    }
}
