
package hera_Inter;

import java.time.LocalDate;

public class Gerente extends CargoDeConfiança{

    public Gerente() {
    }

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataAdmissao);
    }

    @Override
    public String toString() {
        return "Gerente{" + '}';
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * super.bonificacao.getValor();
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }

    
    
}
