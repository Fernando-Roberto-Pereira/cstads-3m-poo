package AP03.Ex01.src;
public class Lapis extends AbstractInstrumentoDeEscrita {
	public Lapis(String cor) {
		super(cor);
	}

	@Override
	public void escrever(String texto) {
		super.escrever(String.format("LAPIS -> Cor: %s | Texto: %s", this.cor, texto));
	}
}