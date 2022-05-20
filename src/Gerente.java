
public class Gerente extends Funcionario implements Autenticavel{ 
																	// e assina o contrato autenticavel
	
	private AutenticadorUtilitario autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticadorUtilitario();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do GERENTE");
		return super.getSalario();
				
				
						
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
		
}


