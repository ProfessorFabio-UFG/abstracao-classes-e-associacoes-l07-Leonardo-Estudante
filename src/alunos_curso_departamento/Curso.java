package alunos_curso_departamento;

public class Curso {
	private String nome;
	private String sigla;
	private Departamento dept;

	public Curso(String nome, String sigla, Departamento dept) {
		this.nome = nome;
		this.sigla = sigla;
		this.dept = dept;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "{ nome='" + nome + "', sigla='" + sigla + "', departamento=" + dept + " }";
	}

}
