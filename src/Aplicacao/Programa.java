package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.Autor;
import Entidades.Biblioteca;
import Entidades.Livro;
import Entidades.Revista;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		int tipo, anoPublicacao, nautores, numeroEdicao;  
		String titulo, isbn, nomeAutor;
		Date dataNascimento;
		Biblioteca biblioteca = new Biblioteca();
		
		System.out.print("Informe o número de mídias: ");
		int midias = sc.nextInt();
		
		for (int i=1; i <= midias; i++) {
			System.out.println("*** Dados da Mídia "+i+" ***");
			System.out.print("Qual o tipo (1)Livro (2)Revista: ");
			tipo = sc.nextInt();
			System.out.print("Informe o título: ");
			sc.nextLine();
			titulo = sc.nextLine();
			System.out.print("Informe o ano de publicação: ");
			anoPublicacao = sc.nextInt();
			if (tipo == 1) {
				System.out.print("Informe o ISBN: ");
				isbn = sc.next();
				Livro livro = new Livro(titulo,anoPublicacao,isbn);
				System.out.print("Informe o número de autores: ");
				nautores = sc.nextInt();
				for (int j=0; j < nautores; j++) {
					System.out.print("Informe o nome do Autor "+(j+1)+": ");
					sc.nextLine();
					nomeAutor = sc.nextLine();
					System.out.print("Informe a data de nascimento: ");
					dataNascimento = sdf.parse(sc.next());
					Autor autor = new Autor(nomeAutor,dataNascimento);
					livro.addAutor(autor);
				}
				biblioteca.adicionarItem(livro);
			}
			else {
				System.out.print("Qual o número de edição da revista: ");
				numeroEdicao = sc.nextInt();
				Revista revista = new Revista(titulo,anoPublicacao,numeroEdicao);
				biblioteca.adicionarItem(revista);
			}
			
		}
		System.out.println("\n *** Acervo da Biblioteca ***\n");
		System.out.println(biblioteca.toString());
		
		System.out.print("Qual o título a ser pesquisado: ");
		sc.nextLine();
		String termo = sc.nextLine();
		System.out.println(biblioteca.pesquisarItensPorTitulo(termo));
		sc.close();
	}
}
