package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Autor {
    private String nome;
    private Date dataNascimento;

    public Autor(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Nome = " + getNome() + " Nascimento = " + sdf.format(getDataNascimento());
	}
}
