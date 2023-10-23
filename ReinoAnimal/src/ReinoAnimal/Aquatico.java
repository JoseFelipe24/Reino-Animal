package ReinoAnimal;

public class Aquatico extends Animal{

	public String tipoDEAgua;
	public boolean Escamas;
	
	
	public Aquatico(String especie, String sexo, String nascimento, double contador, String tipoDEAgua,
			boolean escamas) {
		super(especie, sexo, nascimento, contador);
		this.tipoDEAgua = tipoDEAgua;
		Escamas = escamas;
		contarPri();
	}

	public void nadar() {
		System.out.println("O animal está nadando");
	}

	@Override
	public void comer() {
		super.comer();
	}

	@Override
	public void perfil() {
	
		System.out.println("Especie do Animal" + especie);
		System.out.println("Sexo do Animal" + sexo);
		System.out.println("Nascimento do Animal" + nascimento);
		System.out.println("quantidade de Animais" + contador);
		System.out.println("O animal Aquatico é do tipo de agua" + tipoDEAgua);
		System.out.println("o animal Aquantico" + Escamas + "escamas");
	}

	
}
