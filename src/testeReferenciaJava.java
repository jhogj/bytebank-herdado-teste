
public class testeReferenciaJava {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();       //pode definir como funcionario
		g1.setNome("Marcos");			     // pois todo gerente é um 
		g1.setSalario(5000.0);			     //não funciona chamar a senha
		
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Funcionario d = new Design();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}

}
