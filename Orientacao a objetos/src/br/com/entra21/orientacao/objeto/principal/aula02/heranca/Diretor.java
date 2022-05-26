package br.com.entra21.orientacao.objeto.principal.aula02.heranca;

public class Diretor {
	private String nome;
	private byte idade;
	private String cursoAtual;
	private byte quantidadeProfessores;

	public Diretor() {

	}

	public Diretor(String nome, byte idade) {
		this.nome = nome;

		this.idade = idade;
	}

	public Diretor(String nome, String cursoAtual) {
		super();
		this.nome = nome;
		this.cursoAtual = cursoAtual;
	}

	public Diretor(String nome, byte idade, String cursoAtual, byte quantidadeProfessores) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cursoAtual = cursoAtual;
		this.quantidadeProfessores = quantidadeProfessores;
	}

	public void realizarApresentacao() {
		System.out.println("Oi meu nome é " + this.nome + " e tenho " + this.idade);
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

	public String getCursoAtual() {
		return cursoAtual;
	}

	public void setCursoAtual(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}

	public byte getQuantidadeProfessores() {
		return quantidadeProfessores;
	}

	public void setQuantidadeProfessores(byte quantidadeProfessores) {
		this.quantidadeProfessores = quantidadeProfessores;
	}
	
	
}
