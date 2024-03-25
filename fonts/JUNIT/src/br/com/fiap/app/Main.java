package br.com.fiap.app;

import br.com.fiap.entidades.Elevador;

public class Main {

	public static void main(String[] args) {
		
	
		
		Elevador elevador = new Elevador(1, 200);
		
		System.out.println(elevador.getCargaMax());
		
		
		System.out.println(elevador.entrarNoElevador(250));
		
		
		

	}

}
