
package hera_Inter;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Diretor diretor1 = new Diretor(Bonificacao.DIRETOR, "Cosme", "000.000.000-00", "000.000-00", Genero.MASCULINO, 2800000, LocalDate.of(2000, Month.MARCH, 20));
        Gerente gerente1 = new Gerente(Bonificacao.GERENTE, "Fátima", "000.000.000-00", "000.000-00", Genero.FEMININA, 6000, LocalDate.of(2000, Month.MARCH, 19));
        Motoboy Motoboy1 = new Motoboy("HZE3N00", "IH", "000.000.000-00", "000.000-00", Genero.MASCULINO, 1900, LocalDate.of(1997, Month.MARCH, 19));
        
        System.out.println(Motoboy1);
        
        System.out.println(gerente1);
        
        System.out.println(diretor1);
        
    }
}
