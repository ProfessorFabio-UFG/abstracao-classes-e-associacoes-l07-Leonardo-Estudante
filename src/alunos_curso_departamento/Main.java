package alunos_curso_departamento;

public class Main {
	public static void main(String[] args) {
		Departamento dept = new Departamento("Instituto de Informática", "INF");
		Curso curso = new Curso("Ciência da Computação", "BCC", dept);
		Aluno aluno = new Aluno("Leonardo", 2025010, 2025, curso);

		System.out.println(aluno);
	}
}
