package AP03.Ex01.src;
public class Caneta extends AbstractInstrumentoDeEscrita {
	public Caneta(String cor) {
		super(cor);
	}
	@Override
	public void escrever(String texto) {
		super.escrever(String.format("CANETA -> Cor: %s | Texto: %s", this.cor, texto));
	}
}
