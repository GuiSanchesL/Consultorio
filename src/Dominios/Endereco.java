package Dominios;

public class Endereco {
    private String rua;
    private int numero;

    public Endereco(int numero, String rua) {
        this.numero = numero;
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
