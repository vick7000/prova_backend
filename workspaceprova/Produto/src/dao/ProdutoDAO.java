package dao;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import vo.Produto;

public class ProdutoDAO {

	private BufferedWriter bw;
	private BufferedReader br;
	private String arquivo = "c:\\dbs\\produtos.csv";
	private ArrayList<Produto> produtos;
	private Produto produto;
	
	public void arrumar(ArrayList<Produto> produtos) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo, false));
			for(Produto p : produtos) {
				bw.write(p.tocsv());
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Erro ao salvar: " + e);
		}
	}
	
	public ArrayList<Produto> arrumar() {
		produtos = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(arquivo));
			String linha = "";
			while((br.readLine()) != null) {
				produto = new Produto(linha.split(";"));
				produtos.add(produto);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + e);
		} catch (IOException e) {
			System.out.println("Erro ao abrir: " + e);
		}
		return produtos;
	}
}
