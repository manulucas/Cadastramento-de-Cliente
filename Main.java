package monitoria_12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FilaDePessoas fp = new FilaDePessoas();
		
		char selecione;
		do {
		System.out.println("Bem vindo ao cadastramento!");
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Digite seu gênero: ");
		String genero = sc.next();
		
		System.out.println("Você tem alguma prioridade?");
		char escolha = sc.next().charAt(0);
		
		if (escolha == 's') {
			System.out.println("1 - Pessoa Gestante");
			System.out.println("2 - Pessoa Idosa");
			System.out.println("3 - Pessoa PCD");
			
			int numero = sc.nextInt();
			
			switch (numero) {
		
		case 1: Pessoa pg = new PessoaGestante(nome, idade, genero, true);
		fp.cadastrar(pg);
		break;
		
		case 2:	Pessoa pi = new PessoaIdosa(nome, idade, genero, true);
		fp.cadastrar(pi);
		break;
		
		case 3: Pessoa pcd = new PessoaPCD(nome, idade, genero, true);
		fp.cadastrar(pcd);
		break;
		
		default:
			System.out.println("Número inválido");
		}
			
		}
		else {
			
			Pessoa c = new PessoaComum(nome, idade, genero, false);
			fp.cadastrar(c);
		}
		
		System.out.println("Quer cadastrar outro usuário? sim/não");
		selecione = sc.next().charAt(0);
		
		
	}
		while(selecione == 's');
		for (Pessoa p: fp.filaprioridade()) {
			System.out.println(p);
			System.out.println(fp.filacomum());
		}
		
}


}
