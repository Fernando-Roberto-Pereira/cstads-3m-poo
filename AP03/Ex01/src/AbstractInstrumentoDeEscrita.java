package AP03.Ex01.src;
public abstract class AbstractInstrumentoDeEscrita implements InstrumentoDeEscrita {
    protected String cor;
    public AbstractInstrumentoDeEscrita(String cor) {
        this.cor = cor;
    }
    @Override
	public void escrever(String texto) {
		System.out.println(texto);
	}
}
