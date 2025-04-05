package empregado_empresa;

//Importei a classe Endereço do package cliente_endereco
import cliente_endereco.Endereco;

public class Empresa {
	private String cnpj;
	private String razao;
	private Endereco endereco;

	public Empresa(String cnpj, String razao, Endereco endereco) {
		this.cnpj = cnpj;
		this.razao = razao;
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", razao=" + razao + ", endereco da Empresa=" + endereco + "]";
	}
}
