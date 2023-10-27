package ReinoAnimal;
/** 
 * Classe responsavel por gerar um Animal Aerio
 * 
 * @author josé Felipe
 * 
 * */
public class Aerio extends Animal {


public double altitude;
/** 
 * 
 * Construtor que cria um animal Aerio
 * @param especie, sexo,nascimento e altitudee  sao parametros do metodo
 * */
public Aerio(String especie, String sexo, double nascimento, double altitudee) {
	super(especie, sexo, nascimento);
	this.altitude=altitudee;
	
}

/** 
 * 
 * Método que imprimi que o animal está voando
 * */

public void voar() {
	System.out.println("O animal está voando");
}

/** 
 * 
 * Método que imprimi que o animal Aerio está se alimentando 
 * */

@Override
public void comer() {
	System.out.println("O animal aerio está comendo");
}

/** 
 * 
 * Método que imprimi informações do Animal aerio
 * */

@Override
public void perfil() {
	System.out.println("Especie do Animal" + especie);
	System.out.println("Sexo do Animal" + sexo);
	System.out.println("Nascimento do Animal" + nascimento);
	System.out.println("esse animal aerio concegui voar até" + altitude);

}

/** 
 * 
 * Métodos getter e setter que imprimem e salvam as informações do animal Aerio
 * */

public double getAltitude() {
	return altitude;
}

public void setAltitude(double altitude) {
	this.altitude = altitude;
}

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


}