package ReinoAnimal;
/** 
 * Classe responsavel por gerar um Animal Terrestre
 * 
 * @author josé Felipe
 * 
 * */
public class Terrestre extends Animal {

	public String habitat;
	public boolean pelagem;
	/** 
	 * 
	 * Construtor que cria um animal Terrestre
	 * @param especie, sexo,nascimento, habitatt e pelagemm sao parametros do metodo
	 * */
	public Terrestre(String especie, String sexo, double nascimento, String habitatt, boolean pelagemm) {
		super(especie, sexo, nascimento);
		this.habitat= habitatt;
		this.pelagem = pelagemm;
		
	}
	/** 
	 * 
	 * Método que imprimi que o animal está se movendo
	 * */
	public void mover() {
		System.out.println("O animal está se movendo");
	}
	/** 
	 * 
	 * Método que imprimi que o animal terrestre está se alimentando 
	 * */
	@Override
	public void comer() {
		System.out.println("O animal está terrestre está comendo");
	}
	/** 
	 * 
	 * Método que imprimi informações do Animal Terrestre
	 * */
	@Override
	public void perfil() {
		System.out.println("Especie do Animal" + especie);
		System.out.println("Sexo do Animal" + sexo);
		System.out.println("Nascimento do Animal" + nascimento);
		System.out.println("Habitat do animal terrestre" + habitat);
		System.out.println("é"+ pelagem + "que o animal tem pelagem");
	}
	/** 
	 * 
	 * Métodos getter e setter que imprimem e salvam as informações do animal Terrestre
	 * */
	
	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return super.getEspecie();
	}
	@Override
	public void setEspecie(String especie) {
		// TODO Auto-generated method stub
		super.setEspecie(especie);
	}
	@Override
	public String getSexo() {
		// TODO Auto-generated method stub
		return super.getSexo();
	}
	@Override
	public void setSexo(String sexo) {
		// TODO Auto-generated method stub
		super.setSexo(sexo);
	}
	@Override
	public double getNascimento() {
		// TODO Auto-generated method stub
		return super.getNascimento();
	}
	@Override
	public void setNascimento(double nascimento) {
		// TODO Auto-generated method stub
		super.setNascimento(nascimento);
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public boolean isPelagem() {
		return pelagem;
	}
	public void setPelagem(boolean pelagem) {
		this.pelagem = pelagem;
	}
	
	
}