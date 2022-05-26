package br.com.entra21.orientacao.objeto.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objeto.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objeto.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objeto.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objeto.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objeto.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacao.objeto.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacao.objeto.principal.aula03.polimorfismo.Velocista;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, então é um obj
	// porem o System.in é uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;
		System.out.println("aprendendo sobre orientação a objetos");

		do {
			System.out.println("Escolha uma opção");
			System.out.println("0 - Sair");
			System.out.println("1 - Classes e objetos");
			System.out.println("2 - Herança");
			System.out.println("3 - Polimorfismo");
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

			default:
				break;
			}

		} while (opcao != 0);

	}

	public static void aprenderClassesPolimorfismo() {

		// padrão de polimorfismo para comportamentos(métodos) é herdar.
		// segunda forma do polimorfismo é fazer completamente os
		// comportamentos(métodos) do meu jeito.
		// terceira forma do polimorfismo é aproveitar a minha herança e fazer um
		// diferencial.
		Atleta cr7 = new Atleta();
		cr7.setName("Cristiano Ronaldo");
		cr7.comemorarVitoria();
		System.out.println("----------------------------");
		Nadador michaelPhelps = new Nadador();
		michaelPhelps.setName("Michael Phelps");
		Nadador sergioMichael = new Nadador("Sérgio Michael", (byte) 39, 23, 40, "Piscína", "Sunga e Touca");
		System.out.println("Quer escrever uma frase?");
		String frase = entrada.nextLine();
		sergioMichael.comemorarVitoria(frase); // procura primeiro na minha classe Nadador, se não tiver busca na
												// herança.
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
		System.out.println("A idade dela é " + professoraIngles.getIdade());

		// Criando varios objetos da classe Aluno nas variaveis
		// cada variavel é independente e possui seus atributos e metodos
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();

		// as alterações aqui só afetam esse objeto
		alunoObjeto.idade = 18;

		// as alterações aqui só afetam esse objeto
		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		// as alterações aqui só afetam esse objeto
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		// Executando varias vezes o metodo desse objeto
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		// Interagindo com o usuario para preencher os atributos do Aluno que ainda não
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
				"Oi meu nome é " + funcionario1.getNome() + " e tenho " + funcionario1.getIdade() + " anos de idade ");

		Funcionario funcionario2 = new Funcionario("Mateus", (byte) 29, "CEO", 15000);

		Diretor diretor1 = new Diretor();
		diretor1.realizarApresentacao();
		Diretor diretor2 = new Diretor();
		diretor2.realizarApresentacao();
		Diretor diretor3 = new Diretor();
		diretor3.realizarApresentacao();

	}
}