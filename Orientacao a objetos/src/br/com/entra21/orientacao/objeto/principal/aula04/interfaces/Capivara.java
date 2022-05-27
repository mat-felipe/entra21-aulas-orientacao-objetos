package br.com.entra21.orientacao.objeto.principal.aula04.interfaces;

public class Capivara implements Individuo {

	@Override
	public void alimentar(String alimento) {
		System.out.println("A Capivara come mato e "+alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("A Capivara anda, corre e nada ");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("......");
		
	}

	
	
	
}
