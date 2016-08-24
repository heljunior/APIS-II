package ataque;

public abstract class Ataque {

	protected String nome;
	
	public void executar(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	};
	
	public Ataque(String nomeAtaque){
		this.nome = nomeAtaque;
	}
}
