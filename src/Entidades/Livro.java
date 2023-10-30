package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Livro extends ItemDeMidia {
    private String isbn;
    private List<Autor> autores = new ArrayList<>();

    public Livro(String titulo, int anoPublicacao, String isbn) {
        super(titulo, anoPublicacao);
        this.isbn = isbn;
    }
    
    public void addAutor(Autor autor) {
    	autores.add(autor);
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
    
    public List<Autor> getAutores() {
		return autores;
	}

	@Override
	public boolean pesquisar(String termo) {
		return getTitulo().toLowerCase().contains(termo.toLowerCase());
	}
	
	@Override
	public String toString() {
		String dados = super.toString();
		String lista = "\nAutores: \n";
		for (Autor l : autores) {
			lista +=l.getNome()+" \n";
		}
		return dados+lista;
	}
}
