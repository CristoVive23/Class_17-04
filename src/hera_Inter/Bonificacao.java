
package hera_Inter;

public enum Bonificacao {
    MOTOBOY(0.1),
    GERENTE(0.2),
    DIRETOR(0.4);
    
    private double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }


    
}
