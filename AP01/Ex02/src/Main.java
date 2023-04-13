package AP01.Ex02.src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("João");
		Pessoa p2 = new Pessoa("José");
		Pessoa p3 = new Pessoa("Maria");

		Time t1 = new Time("São Paulo", p1);
		t1.setPessoa(p2);
		t1.exibeParticipantes();
		t1 = null;

		Time t2 = new Time("Santos", p3);
		t2.exibeParticipantes();
		t2 = null;
	}
}
