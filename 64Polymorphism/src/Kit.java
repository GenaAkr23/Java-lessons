
public class Kit extends Tvaryna{
	
	public void Murknuty(){
		System.out.println("Мур-мур");
	}
	// тепер клас class Kit є поліморфізмом для класу Tvaryna
	@Override // цей атрибут показує що є метод заміщення
	public void SkazatyPryvit(){
		System.out.println("Кіт каже ПРИВІТ");
	}
}
