package br.com.entra21.orientacao.objeto.principal.aula01.classes;

public class Professor {
	
	private String nome;
	private byte idade;
	private byte quantidadedeAlunos;
	
	public Professor() {
		//construtor vazio nao inicializa os atributos
	}
	
	public Professor(String novoNome, byte idade) {
		this.nome=novoNome;
		this.nome=idade;
		//construtor com parametros
		//pode inicializar alguns ou todos os atributos
	}

}
