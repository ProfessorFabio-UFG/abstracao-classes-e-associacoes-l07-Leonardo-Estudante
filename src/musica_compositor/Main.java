package musica_compositor;

public class Main {
	public static void main(String[] args) {
		Compositor c = new Compositor("Chico Buarque", "Brasileiro");
		Musica music = new Musica("João e Maria", 1991, "MPB", c);

		System.out.println(music);
	}
}
