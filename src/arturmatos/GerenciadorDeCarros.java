package arturmatos;

import java.util.List;

public class GerenciadorDeCarros {
	
	 public static void imprimirDetalhesCarros(List<? extends ICarro> listaCarros) {
	        for (ICarro carro : listaCarros) {
	            System.out.println("Marca: " + carro.getMarca() + ", Modelo: " + carro.getModelo() + ", Ano: " + carro.getAno());
	            if (carro instanceof ISedan) {
	                ISedan sedan = (ISedan) carro;
	                System.out.println("Tamanho do porta-malas: " + sedan.getTamanhoPortaMalas());
	            } else if (carro instanceof IHatchback) {
	                IHatchback hatchback = (IHatchback) carro;
	                System.out.println("Número de portas: " + hatchback.getNumeroPortas());
	            }
	        }
	    }

}
