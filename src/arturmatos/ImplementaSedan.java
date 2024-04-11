package arturmatos;

public class ImplementaSedan extends ImplementaCarro implements ISedan {
	
	int tamanhoPortaMalas;

    public ImplementaSedan(String marca, String modelo, int ano, int tamanhoPortaMalas) {
        super(marca, modelo, ano);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    @Override
    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

}
