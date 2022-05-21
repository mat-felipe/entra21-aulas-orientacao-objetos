package br.com.entra21.orientacao.objeto.principal;

import br.com.entra21.orientacao.objeto.principal.aula01.classes.Aluno;

import java.util.Scanner;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();
		alunoObjeto.idade = 18;

		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";
		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = entrada.next();
		System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		alunoNovato.idade = entrada.nextByte();
		System.out.println("Bem vindo " + alunoNovato.nome);

	}

}