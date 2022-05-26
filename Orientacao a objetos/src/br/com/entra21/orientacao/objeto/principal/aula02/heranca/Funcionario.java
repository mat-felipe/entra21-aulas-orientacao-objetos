package br.com.entra21.orientacao.objeto.principal.aula02.heranca;

public class Funcionario {

	private String nome;
	private byte idade;
	private String cargoAtual;
	private float salario;

	public Funcionario() {

	}

	public Funcionario(String nome, byte idade, String cargo, float valor) {
		this.nome = nome;
		this.idade = idade;
		this.cargoAtual = cargo;
		this.salario = valor;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public String getCargoAtual() {
		return cargoAtual;
	}

	public void setCargoAtual(String cargoAtual) {
		this.cargoAtual = cargoAtual;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
