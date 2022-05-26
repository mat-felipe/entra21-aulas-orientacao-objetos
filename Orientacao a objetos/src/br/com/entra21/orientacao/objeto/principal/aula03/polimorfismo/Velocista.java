package br.com.entra21.orientacao.objeto.principal.aula03.polimorfismo;

public class Velocista extends Atleta { // minha classe Velocista pegando atributos da minha super-Classe Atleta

	String tipoPista;
	String marcaCalcado;

	public Velocista() { // construtor vazio

	}

	public Velocista(String tipoPista, String marcaCalcado) { // construtor com meus atributos da classe Velocista
		super();
		this.tipoPista = tipoPista;
		this.marcaCalcado = marcaCalcado;
	}

	public Velocista(String nome, byte age, int qtdLoss, int qtdWin, String tipoPista, String marcaCalcado) {
		super(nome, age, qtdLoss, qtdWin);
		this.tipoPista = tipoPista; // construtor com meus atributos da classe Velocista tamb�m atributos da minha
		// super-Classe Atleta
		this.marcaCalcado = marcaCalcado;
	}

	public String getTipoPista() {
		return tipoPista;
	}

	public void setTipoPista(String tipoPista) {
		this.tipoPista = tipoPista;
	}

	public String getMarcaCalcado() {
		return marcaCalcado;
	}

	public void setMarcaCalcado(String marcaCalcado) {
		this.marcaCalcado = marcaCalcado;
	}

	@Override
	// Protege em rela��o a altera��es de sintaxe, como visibilidade, tipo de
	// retorno, nome do m�todo e par�metros.
	// o m�todo � meu, mas eu aproveito a implementa��o da super-Classe
	// por�m eu posso fazer um diferencial
	public void comemorarVitoria() {
		super.comemorarVitoria();
		System.out.println(getName() + " Estou cansado, mas corri para vit�ria!");
	}
}