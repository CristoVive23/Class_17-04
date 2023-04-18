
package hera_Inter;

public enum Genero {
    MASCULINO('M', "masculino"),
    FEMININA('F', "feminino");
    
    private char Valor;
    private String texto;

    private Genero() {
    }

    private Genero(char Valor, String texto) {
        this.Valor = Valor;
        this.texto = texto;
    }

    public void setValor(char Valor) {
        this.Valor = Valor;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}
