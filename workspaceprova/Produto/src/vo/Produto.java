package vo;

import java.util.Objects;

public class Produto {
	
	private int id;
	private String nome;
	private String descricao;
	private float valor;
	 private int quantidade;
	
	 public Produto(int id, String nome, String descricao, float valor, int quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Produto(String[] split) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, nome, quantidade, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(descricao, other.descricao) && id == other.id && Objects.equals(nome, other.nome)
				&& quantidade == other.quantidade && Float.floatToIntBits(valor) == Float.floatToIntBits(other.valor);
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}
	 
	public String tocsv() {
		return  id + ";" + nome +  ";" + descricao  + ";" + valor + ";" + quantidade + "\r\n";
	}
	
	public String tohtml() {
		return "<td>" + id + "</td><td>" + nome + "</td><td>" + descricao + "</td><td>" + valor + "</td><td>" + quantidade + "</td>";
	}
	 
}
