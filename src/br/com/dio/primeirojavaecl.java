package br.com.dio;

import br.com.dio.model.Gatineo;

public class primeirojavaecl {

		public static void main(String[] args) {
			
			Gatineo gato = new Gatineo(null, null, null);
			
			Livros livros = new Livros();
			
			System.out.println(gato);
			System.out.println(livros);

		}

}


class Livros {
	private String nome;
	private String npag;
}
