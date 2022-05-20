//contrato autenticavel
	//quem assinar esse contrato, precisa implementar
		//metodo set senha
		//metodo autentica
		//agora essa classe não pode ser extends, e sim apenas implements


public abstract interface Autenticavel {

	public abstract void setSenha (int senha);
	
	public abstract boolean autentica (int senha); 
		

}
