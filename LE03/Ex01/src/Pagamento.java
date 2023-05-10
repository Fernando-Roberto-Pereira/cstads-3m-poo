package LE03.Ex01.src;

public class Pagamento {
	private String forma;
	private int qtdsParcelas;

	public Pagamento(String forma, int qtdsParcelas) {
		this.forma = forma;
		this.qtdsParcelas = qtdsParcelas;
	}
	
	public int getQtdsParcelas() {
		return qtdsParcelas;
	}

	public void setQtdsParcelas(int qtdsParcelas) {
		this.qtdsParcelas = qtdsParcelas;
	}
}
