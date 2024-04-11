package arturmatos;

public class ImplementaHatchback extends ImplementaCarro implements IHatchback {
	
	 int numeroPortas;

	    public ImplementaHatchback(String marca, String modelo, int ano, int numeroPortas) {
	        super(marca, modelo, ano);
	        this.numeroPortas = numeroPortas;
	    }

	    @Override
	    public int getNumeroPortas() {
	        return numeroPortas;
	    }
}
