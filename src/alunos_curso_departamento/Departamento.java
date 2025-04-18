package alunos_curso_departamento;

public class Departamento {
	private String nome;
	private String sigla;

	public Departamento(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "{ nome='" + nome + "', sigla='" + sigla + "' }";
	}

}
