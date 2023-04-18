
package hera_Inter;

import java.time.LocalDate;


public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy() {
    }

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

        @Override
    public String toString() {
        return "\n Nome: " + super.nome +
                "\n CPF: " + super.cpf +
                "\n RG: " + super.rg + 
                "\n Genêro: " + super.genero + 
                "\n Salário Base: " + super.salarioBase +
                "\n Data de Admissão: " + super.dataAdmissao +
                "\n Placa da Moto: " + this.placaDaMoto;
    }
    
    

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        return salarioFinal;
    }


    
}
