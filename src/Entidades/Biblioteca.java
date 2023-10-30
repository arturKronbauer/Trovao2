package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<ItemDeMidia> itens = new ArrayList<>();
	
	public Biblioteca() {
		
	}

    public void adicionarItem(ItemDeMidia item) {
        itens.add(item);
    }

    public void removerItem(ItemDeMidia item) {
        itens.remove(item);
    }

    public String pesquisarItensPorTitulo(String termo) {
        for (ItemDeMidia item : itens) {
            if (item instanceof Pesquisavel) {
                Pesquisavel pesquisavel = (Pesquisavel) item;
                if (pesquisavel.pesquisar(termo)) {
                    return ("Título: " + item.getTitulo());
                }
            }
        }
        return "Título não Encontrado";
    }
    
    @Override
    public String toString() {
    	String dados="";
    	for (ItemDeMidia item : itens) {
    		if (item instanceof Pesquisavel) {
    			dados += item.toString();
    		}
    		dados +="----------\n"; 
    	}
    	return dados;
    }
}
