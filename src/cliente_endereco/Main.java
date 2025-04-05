package cliente_endereco;

public class Main {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua 3", 20, "Bueno", "Apt 502", "Goiânia", "GO");
		Cliente cliente = new Cliente("Leonardo", "410326678-01", endereco);

		System.out.println(cliente);
	}
}
