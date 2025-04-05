package musica_compositor;

public class Musica {
	private String nome;
	private int ano;
	private String tipo;
	private Compositor comp;

	public Musica(String nome, int ano, String tipo, Compositor comp) {
		this.nome = nome;
		this.ano = ano;
		this.tipo = tipo;
		this.comp = comp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Musica [nome=" + nome + ", ano=" + ano + ", tipo=" + tipo + ", comp=" + comp + "]";
	}

}
