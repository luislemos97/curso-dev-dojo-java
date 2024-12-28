package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
    /**
     * idade < 15 categoria infantil
    * idade >= 15 categoria juvenil
    * idade >= 18 categoria adulto
    */
    
    int idade = 18;
    String categoria;

    if (idade >=15 && idade < 18) {
        categoria = " categoria juvenil";
    } else if (idade >= 18 && idade < 21 ) {
        categoria = " categoria adulto";
    } else {
        categoria = " categoria infantil";        
    }
    System.out.println(categoria);
    
    }
}
