package pokemon;

import ataque.Ataque;

public class Pokemon {

	//Dados Pokemon
	protected String nome;
	
	protected int hp;
	
	protected int cp;
	
	protected Ataque ataque;

	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getHp() {
		return hp;
	}




	public void setHp(int hp) {
		this.hp = hp;
	}




	public int getCp() {
		return cp;
	}




	public void setCp(int cp) {
		this.cp = cp;
	}




	public void atacar(){
		ataque.executar();
	}
	
	public Pokemon(String nomePokemon, int hpPokemon, int cpPokemon, Ataque ataquePokemon){
		this.nome = nomePokemon;
		this.hp = hpPokemon;
		this.cp = cpPokemon;
		this.ataque = ataquePokemon;
	}
}

