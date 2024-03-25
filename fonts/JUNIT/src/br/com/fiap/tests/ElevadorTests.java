package br.com.fiap.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.fiap.entidades.Elevador;
import br.com.fiap.entidades.Pessoa;

public class ElevadorTests {

	Pessoa p1 = new Pessoa("Joao", 80);
	Pessoa p2 = new Pessoa("Roberto", 80);
	Pessoa p3 = new Pessoa("Matheus", 80);

	
	Elevador elevador = new Elevador(1, 200);

	@Test
	public void testEntrarAcimaCargaMax() {

		elevador.entrarNoElevador(p1.getPeso());
		elevador.entrarNoElevador(p2.getPeso());
		elevador.entrarNoElevador(p3.getPeso());

		assertTrue(elevador.avaliarPeso());

	}

	@Test
	public void testSair() {
		
		elevador.entrarNoElevador(p1.getPeso());
		elevador.sairDoElevador(p1.getPeso());
		assertEquals(0, elevador.getCargaAtual(), 0.1);

	}
	
	@Test
	public void testeEntrar() {
		elevador.entrarNoElevador(p1.getPeso());
		assertEquals(80, elevador.getCargaAtual(), 0);
	}

}
