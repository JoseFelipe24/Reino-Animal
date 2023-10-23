package ReinoAnimal;

/** 
 * Classe responsavel por gerar um Animal
 * 
 * @author josé Felipe
 * 
 * */

public class Animal {

	public String especie;
	public String sexo;
	public String nascimento;
	public double contador;
	
	/** 
	 * 
	 * Construtor que cria um animal
	 * @param especie, sexo,nascimento e contador sao parametros do metodo
	 * */
	public Animal(String especie, String sexo, String nascimento, double contador) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.contador = contador;
		contarPri();
	}
	/** 
	 * 
	 * Método que imprimi que o animal está se alimentando 
	 * */
	public void comer() {
		System.out.println("O animal está comendo");
	}
	/** 
	 * 
	 * Método que imprimi informações do Animal 
	 * */
	public void perfil() {
		System.out.println("Especie do Animal" + especie);
		System.out.println("Sexo do Animal" + sexo);
		System.out.println("Nascimento do Animal" + nascimento);
		System.out.println("quantidade de Animais" + contador);
	}
	/** 
	 * 
	 * Método que adiciona +1 ao contador
	 * */
	private void contarPri() {
		contador++;
	}
	/** 
	 * 
	 * Método que imprimi a quantidade de animais
	 * */
	public void RevelarContador() {
		System.out.println("A quantidade de Animais é:" + contador);
	}
	
}
