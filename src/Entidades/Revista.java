package Entidades;

public class Revista extends ItemDeMidia{
	private Integer numeroEdicao;

    public Revista(String titulo, int anoPublicacao, Integer numeroEdicao) {
        super(titulo, anoPublicacao);
        this.numeroEdicao = numeroEdicao;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}

	@Override
	public boolean pesquisar(String termo) {
		return getTitulo().toLowerCase().contains(termo.toLowerCase());
	}
	
	@Override
	public String toString() {
		String dados = super.toString();
		return dados + "\nNúmero da Edição = "+getNumeroEdicao()+"\n";
	}
}