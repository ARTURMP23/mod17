package arturmatos;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

        ISedan sedan = new ImplementaSedan("Toyota", "Corolla", 2020, 500);
        IHatchback hatchback = new ImplementaHatchback("Honda", "Civic", 2019, 4);

        List<ICarro> listaCarros = new ArrayList<>();
        listaCarros.add(sedan);
        listaCarros.add(hatchback);
        
        GerenciadorDeCarros.imprimirDetalhesCarros(listaCarros);
    }
}
