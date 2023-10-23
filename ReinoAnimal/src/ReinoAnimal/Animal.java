package ReinoAnimal;

public class Animal {

	public String especie;
	public String sexo;
	public String nascimento;
	public double contador;
	
	
	public Animal(String especie, String sexo, String nascimento, double contador) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.contador = contador;
		contarPri();
	}
	
	public void comer() {
		System.out.println("O animal está comendo");
	}
	public void perfil() {
		System.out.println("Especie do Animal");
		System.out.println("Sexodo Animal");
		System.out.println("Nascimento do Animal");
		System.out.println("quantidade de Animais");
	}
	private void contarPri() {
		contador++;
	}
	public void RevelarContador() {
		System.out.println("A quantidade de Animais é:" + contador);
	}
	
}
