package LE03.Ex01.src;

import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
	private String data;
	private boolean status;
	private ArrayList<Item> alItem = new ArrayList<Item>();
	private ArrayList<Pagamento> alPagamento = new ArrayList<Pagamento>();
	
	public Pedido(String data, boolean status, String nomeItem, String descriacaoItem, double precoItem, Pagamento pagamento) {
		this.data = data;
		this.status = status;
		this.alItem.add(new Item(nomeItem, descriacaoItem, precoItem));
		this.alPagamento.add(pagamento);
	}
	
	public void adicionaItem(String nomeItem, String descriacaoItem, double precoItem) {
		this.alItem.add(new Item(nomeItem, descriacaoItem, precoItem));
	}
	
	public void adicionaPagamento(Pagamento pagamento) {
		this.alPagamento.add(pagamento);
	}
	
	public double calcPrecoTotal() {
		double total = 0.0;
		for (Item item : this.alItem) {
			total += item.getPreco();
		}
		return total;
	}
	
	public double calcImposto() {
		return this.calcPrecoTotal() * 0.02;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
