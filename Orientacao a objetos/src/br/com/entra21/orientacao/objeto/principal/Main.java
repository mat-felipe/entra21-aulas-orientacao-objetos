package br.com.entra21.orientacao.objeto.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objeto.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objeto.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objeto.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objeto.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objeto.principal.aula02.heranca.Pessoa;
import br.com.entra21.orientacao.objeto.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacao.objeto.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacao.objeto.principal.aula03.polimorfismo.Velocista;
import br.com.entra21.orientacao.objeto.principal.aula04.conceitospoo.Ponto;
import br.com.entra21.orientacao.objeto.principal.aula04.conceitospoo.Reta;
import br.com.entra21.orientacao.objeto.principal.aula04.interfaces.Aviao;
import br.com.entra21.orientacao.objeto.principal.aula04.interfaces.Capivara;
import br.com.entra21.orientacao.objeto.principal.aula04.interfaces.Gato;
import br.com.entra21.orientacao.objeto.principal.aula04.interfaces.Humano;
import br.com.entra21.orientacao.objeto.principal.aula04.interfaces.Veiculo;

public class Main {

	private static final String String = null;
	// o objeto da classe Scanner esta na variavel de entrada, ent�o � um obj
	// porem o System.in � uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;
		System.out.println("aprendendo sobre orienta��o a objetos");

		do {
			System.out.println("Escolha uma op��o");
			System.out.println("0 - Sair");
			System.out.println("1 - Classes e objetos");
			System.out.println("2 - Heran�a");
			System.out.println("3 - Polimorfismo");
			System.out.println("4 - Aprender conceitos POO");
			System.out.println("5 - Aprender polimorfismo com interface");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:

				break;
			case 1:
				aprenderClasses();
				break;
			case 2:
				aprenderHeranca();
				break;

			case 3:
				aprenderClassesPolimorfismo();
				break;

			case 4:
				aprenderConceitosPOO();
				break;

			case 5:
				aprenderPolimorfismoInterface();
				break;

			default:
				System.out.println("Presta aten��o");
				break;
			}

		} while (opcao != 0);

	}

	public static void aprenderClassesPolimorfismo() {

		// padr�o de polimorfismo para comportamentos(m�todos) � herdar.
		// segunda forma do polimorfismo � fazer completamente os
		// comportamentos(m�todos) do meu jeito.
		// terceira forma do polimorfismo � aproveitar a minha heran�a e fazer um
		// diferencial.
		Atleta cr7 = new Atleta();
		cr7.setName("Cristiano Ronaldo");
		cr7.comemorarVitoria();
		System.out.println("----------------------------");
		Nadador michaelPhelps = new Nadador();
		michaelPhelps.setName("Michael Phelps");
		Nadador sergioMichael = new Nadador("S�rgio Michael", (byte) 39, 23, 40, "Pisc�na", "Sunga e Touca");
		System.out.println("Quer escrever uma frase?");
		String frase = entrada.nextLine();
		sergioMichael.comemorarVitoria(frase); // procura primeiro na minha classe Nadador, se n�o tiver busca na
												// heran�a.
		michaelPhelps.comemorarVitoria();
		System.out.println("----------------------------");
		Velocista usainBolt = new Velocista();
		usainBolt.setName("Usain Bolt");

		usainBolt.comemorarVitoria();
		System.out.println("----------------------------");

	}

	private static void aprenderClasses() {

		// instanciando um objeto da classe Professor na variavel professorJava
		Professor professorJava = new Professor();

		// instanciando um objeto da classe Professor na variavel professoraIngles
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		// Acessando os atributos com encapsulamento
		System.out.println("Nome dela = " + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("agora o nome  dela = " + professoraIngles.getNome());
		System.out.println("A idade dela � " + professoraIngles.getIdade());

		// Criando varios objetos da classe Aluno nas variaveis
		// cada variavel � independente e possui seus atributos e metodos
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();

		// as altera��es aqui s� afetam esse objeto
		alunoObjeto.idade = 18;

		// as altera��es aqui s� afetam esse objeto
		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		// as altera��es aqui s� afetam esse objeto
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		// Executando varias vezes o metodo desse objeto
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		// Interagindo com o usuario para preencher os atributos do Aluno que ainda n�o
		// tem encapsulamento
		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = entrada.next();

		System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		alunoNovato.idade = entrada.nextByte();

		System.out.println("Bem vindo " + alunoNovato.nome);

	}

	private static void aprenderHeranca() {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte) 25);
		funcionario1.setNome("Mateus");
		funcionario1.setCargoAtual("CEO");
		funcionario1.setSalario(8500f);

		System.out.println(
				"Oi meu nome � " + funcionario1.getNome() + " e tenho " + funcionario1.getIdade() + " anos de idade ");

		Funcionario funcionario2 = new Funcionario("Mateus", (byte) 29, "CEO", 15000);

		Diretor diretor1 = new Diretor();
		diretor1.realizarApresentacao();
		Diretor diretor2 = new Diretor();
		diretor2.realizarApresentacao();
		Diretor diretor3 = new Diretor();
		diretor3.realizarApresentacao();

	}

	private static void aprenderPolimorfismoInterface() {

		Humano pessoa = new Humano();
		pessoa.setNome("Fulano");
		pessoa.alimentar("macarr�o");
		pessoa.alimentar("arroz");
		pessoa.comunicar("Boa noite, interface � muito f�cil");
		pessoa.locomover();

		Gato vezu = new Gato();
		vezu.alimentar("peixe");
		vezu.alimentar("ra��o");
		vezu.comunicar("Ser� que existem gatos programadores?");
		vezu.locomover();

		Capivara patolino = new Capivara();
		patolino.alimentar("peixe");
		patolino.comunicar("Ser� que existem gatos programadores?");
		patolino.locomover();
		Aviao comercial = new Aviao();
		comercial.setModelo("Boeing 737");
		System.out.println(comercial.freiar());
		comercial.acelerar(870.5f);
		System.out.println(comercial.getVelocidadeAtual());
	}

	private static void aprenderConceitosPOO() {
		// Coes�o
		// Coes�o est� ligado ao princ�pio da responsabilidade �nica, onde uma classe
		// deve ter apenas uma �nica responsabilidade e realiz�-la de maneira
		// satisfat�ria, ou seja, uma classe n�o deve assumir responsabilidades que n�o
		// s�o suas .
		// Uma vez sendo ignorado este princ�pio, passamos a ter problemas, como
		// dificuldades de manuten��o e de reuso.

		Ponto pontoAlto = new Ponto(30, 1000);
		Ponto esquerdaBaixo = new Ponto(-20, -100);

		// A classe reta, � agregada por pontos que podem n�o estar inicializada
		// A associa��o de reta e ponto e de um para muitos respectivamente
		Reta torta = new Reta();
		Reta retaDiagonal = new Reta(pontoAlto, esquerdaBaixo);

	}

}