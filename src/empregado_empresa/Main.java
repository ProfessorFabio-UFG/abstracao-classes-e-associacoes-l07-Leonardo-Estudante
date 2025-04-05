package empregado_empresa;

import cliente_endereco.Endereco;

public class Main {

	public static void main(String[] args) {
		// Instancias de endereco
		Endereco enderecoEmpresa = new Endereco("Rua 2", 21, "Marista", "Edificio Bonito", "Goiânia", "GO");
		Endereco enderecoCliente = new Endereco("Rua 3", 21, "Bueno", "Edificio Elegante", "Goiânia", "GO");

		// Instancia de Empresa e Empregado
		Empresa empresa = new Empresa("12345678", "12", enderecoEmpresa);
		Empregado empregado = new Empregado("Leonardo", 2025010, empresa, enderecoCliente);

		System.out.println(empresa);
		System.out.println(empregado);
	}

}
