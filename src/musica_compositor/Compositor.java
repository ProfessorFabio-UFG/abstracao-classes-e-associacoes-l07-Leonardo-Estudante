package musica_compositor;

public class Compositor {
	private String nome;
	private String nacionalidade;

	public Compositor(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	@Override
	public String toString() {
		return "Compositor [nome=" + nome + ", nacionalidade=" + nacionalidade + "]";
	}

}
