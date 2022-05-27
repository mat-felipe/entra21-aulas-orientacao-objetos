package br.com.entra21.orientacao.objeto.principal.aula04.interfaces;

public class Veiculo implements Individuo {

	private String abastecer;

	public Veiculo(String abastecer) {
		super();
		this.abastecer = abastecer;
	}

	public String getAbastecer() {
		return abastecer;
	}

	public void setAbastecer(String abastecer) {
		this.abastecer = abastecer;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.abastecer + " : Preciso de mais para andar");

	}

	@Override
	public void locomover() {
		System.out.println("Eu ando sozinho, sou autonomo");

	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("Parece um V8");

	}

}
