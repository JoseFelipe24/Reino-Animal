package ReinoAnimalTeste;

import ReinoAnimal.Aerio;
import ReinoAnimal.Aquatico;
import ReinoAnimal.Terrestre;
import ReinoAnimal.Animal;
/** 
 * Classe responsavel por testar as classes do pacote Reino Animal
 * 
 * @author josé Felipe
 * 
 * */
public class Principal {
public static void main(String[] args) {
	
    Animal an1 = new Animal("louquinho", "machao", 5);
    
	Aquatico aqua1= new Aquatico("Carcharias taurus", "Femea", 7, "Salgada", false);
	Aquatico aqua2= new Aquatico("Pygocentrus natterer", "Macho", 3, "água doce", true);
	
	Terrestre terr1 = new Terrestre("Felis catus", "Fêmea", 2, "Ásia", true);
	Terrestre terr2 = new Terrestre("Hydrochoerus hydrochaeris", "Macho", 8, "América do Sul", true);
	
	Aerio ar1= new Aerio("Coragyps atratus", "Macho", 3, 54.5);
	Aerio ar2= new Aerio("Amazona aestiva", "fêmea", 7, 37.9);
ar2.comer();
ar1.perfil();

an1.RevelarContador();
}
}