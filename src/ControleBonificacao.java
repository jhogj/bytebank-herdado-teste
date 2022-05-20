
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	
	}
	
	public double getSoma() {
		return soma;
	}

}



//NÃO PRECISA CRIAR UM METODO PARA CADA FUNCIONARIO, BASTA COLOCAR O GENÉRICO
//(METODO MAE) PARA QUE O POLIMORFISMO FUNCIONE