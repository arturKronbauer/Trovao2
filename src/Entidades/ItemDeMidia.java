package Entidades;

public abstract class ItemDeMidia implements Pesquisavel{
    private String titulo;
    private int anoPublicacao;

    public ItemDeMidia(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	@Override
	public String toString() {
		return "Título = "+getTitulo()+ "\nAno Publicação = "+getAnoPublicacao();
	}
}
