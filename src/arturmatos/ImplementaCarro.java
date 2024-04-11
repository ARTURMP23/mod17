package arturmatos;

public class ImplementaCarro implements ICarro{
	String marca;
    String modelo;
    int ano;

    public ImplementaCarro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getAno() {
        return ano;
    }

}
