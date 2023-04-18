
package hera_Inter;

import java.time.LocalDate;

public class Diretor extends CargoDeConfiança{
    
    private final double PARTICIPACAO_LUCRO = 0.1;

    public Diretor() {
    }

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataAdmissao);
    }

    
    @Override
    public String toString() {
        return "Diretor{" + '}';
    }
    
    @Override
    public double getSalarioFinal(){
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * PARTICIPACAO_LUCRO; 
        salarioFinal += super.salarioBase * super.bonificacao.getValor();
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }
    
}
