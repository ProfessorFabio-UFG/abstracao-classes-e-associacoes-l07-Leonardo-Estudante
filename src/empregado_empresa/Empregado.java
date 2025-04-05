package empregado_empresa;

//Importei a classe Endereço do package cliente_endereco
import cliente_endereco.Endereco;

public class Empregado {
	private String nome;
	private int matricula;
	private Empresa empresa;
	private Endereco endereco;

	public Empregado(String nome, int matricula, Empresa empresa, Endereco endereco) {
		this.nome = nome;
		this.matricula = matricula;
		this.empresa = empresa;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", matricula=" + matricula + ", empresa=" + empresa
				+ ", endereco do Cliente=" + endereco + "]";
	}
}
