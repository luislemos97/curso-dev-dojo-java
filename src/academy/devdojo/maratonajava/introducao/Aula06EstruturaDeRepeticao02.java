package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao02 {
    /**
     * imprima todos os números pares de 0 até 10000
     *
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
            System.out.println(i);
            }
        }
    }
}
