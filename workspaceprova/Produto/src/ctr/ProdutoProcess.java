package ctr;

import java.util.ArrayList;

import vo.Produto;
import dao.ProdutoDAO;

public class ProdutoProcess {
	public static ArrayList<Produto> produtos;
	public static ProdutoDAO ld = new ProdutoDAO();
	
	public static void testes() {
		produtos = new ArrayList<>();
			produtos.add(new Produto(1,"sabonete","sabonete de lavar as mãos", (float) 5.98, 20));
			produtos.add(new Produto(2,"pasta de dentes","pasta para escovar os dentes", (float) 7.50, 50));
			produtos.add(new Produto(3,"doritos","salgadinho", (float) 11.99, 45));
			produtos.add(new Produto(4,"ovos","cartela de 30 ovos", (float) 15.50, 60));
	}
	public static void abrir() {
		produtos = ld.arrumar();
	}
	
	public static void salvar() {
		ld.arrumar(produtos);
	}
}
