package br.com.fiap.entidades;

public class Elevador {

	private int id;
	private double cargaMax;
	private double cargaAtual = 0;
	private boolean sinalAlerta;

	Calculadora calculadora = new Calculadora();

	public Elevador() {
	}

	public Elevador(int id, double cargaMax) {
		this.id = id;
		this.cargaMax = cargaMax;
		this.sinalAlerta = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(double cargarMax) {
		this.cargaMax = cargarMax;
	}

	public double getCargaAtual() {
		return cargaAtual;
	}

	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}

	public boolean isSinalAlerta() {
		return sinalAlerta;
	}

	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}

	public double entrarNoElevador(double peso) {

		this.cargaAtual = calculadora.somar(peso, this.cargaAtual);
		return this.cargaAtual;
	}

	public double sairDoElevador(double peso) {

		this.cargaAtual = calculadora.subtrair(this.cargaAtual, peso);
		return this.cargaAtual;
	}

	public boolean avaliarPeso() {
		if (this.cargaAtual > this.cargaMax) {
			return true;
			// Nao pode entrar no elevador
		}
		return false;
		// Pode entrar
	}

}
