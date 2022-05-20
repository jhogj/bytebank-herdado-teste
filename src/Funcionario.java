
public abstract class Funcionario { //abstract ta relacionado a herança
									//o funcionário é pois é a mãe das profissões
									//definidas aqui
								//não se pode instanciar uma classe abstrata
	
	private String nome;
	private String cpf;
	private double salario; //pode se usar protected ao inves
							// de private ou public
							//protected = publico para os filhos
	
	
	//quando vc coloca abstract na classe mãe, vc obriga os filhos a implementarem 
	//esse método
	public abstract double getBonificacao(); 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
