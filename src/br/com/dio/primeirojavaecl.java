package br.com.dio;

import br.com.dio.model.Gatineo;

public class primeirojavaecl {
	//tenho que mudar algo para tentar commitar novamente pois
	//primeira tentativa deu erro :b

		public static void main(String[] args) {
			
			Gatineo gato = new Gatineo(null, null, null);
			
			Livros livros = new Livros();
			
			System.out.println(gato);
			System.out.println(livros);
			
			/*int a = 6;
			int b = 12;
			System.out.println("Olá mundo, novamente! " + (a+b));*/
		}

}


class Livros {
	private String nome;
	private String npag;
}
