package ReinoAnimal;
/** 
 * Classe responsavel por gerar um Animal Aquatico
 * 
 * @author josé Felipe
 * 
 * */
public class Aquatico extends Animal{

	private String tipoDEAgua;
	private boolean Escamas;
	
	
	/** 
	 * 
	 * Construtor que cria um animal Aquatico
	 * @param especie, sexo,nascimento, tipo de agua e escamas sao parametros do metodo
	 * */
	public Aquatico(String especie, String sexo, double nascimento, String tipoDEAgua,
			boolean escamas) {
		super(especie, sexo, nascimento);
		this.tipoDEAgua = tipoDEAgua;
		this.Escamas = escamas;
	
	}
	/** 
	 * 
	 * Método que imprimi que o animal está nadando
	 * */
	public void nadar() {
		System.out.println("O animal está nadando");
	}
	/** 
	 * 
	 * Método que imprimi que o animal aquatico está se alimentando 
	 * */
	@Override
	public void comer() {
		System.out.println("O Animal aquatico está comendo");
	}

	/** 
	 * 
	 * Método que imprimi informações do Animal Aquatico
	 * */
	@Override
	public void perfil() {
	
		System.out.println("Especie do Animal" + getEspecie());
		System.out.println("Sexo do Animal" + getSexo());
		System.out.println("Nascimento do Animal" + getNascimento());
		System.out.println("O animal Aquatico é do tipo de agua" + tipoDEAgua);
		System.out.println("o animal Aquantico" + Escamas + "escamas");
	}

	/** 
	 * 
	 * Métodos getter e setter que imprimem e salvam as informações do animal Aquatico
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

	public String getTipoDEAgua() {
		return tipoDEAgua;
	}

	public void setTipoDEAgua(String tipoDEAgua) {
		this.tipoDEAgua = tipoDEAgua;
	}

	public boolean isEscamas() {
		return Escamas;
	}

	public void setEscamas(boolean escamas) {
		Escamas = escamas;
	}

	
}