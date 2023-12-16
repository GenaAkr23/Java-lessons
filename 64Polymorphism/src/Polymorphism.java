
public class Polymorphism {

	public static void main(String[] args) {
	//3	Tvaryna t = new Tvaryna();
	//3	Tvaryna tk = new Kit();// ок, оскільки Kit наслідує Тварину
	//3	Tvaryna td = new Drakon();// ок, оскільки Дракон наслідує Тварину
		
		Tvaryna [] tm = new Tvaryna[3];
		tm[0] = new Tvaryna();
		tm[1] = new Kit();
		tm[2] = new Drakon();
		
		for (Tvaryna t: tm){
			t.SkazatyPryvit();
		}
	//2	Tvaryna t = new Tvaryna();
	//2	Kit k = new Kit();
	//2	Drakon d = new Drakon();
	//1	t.Pojisty();
	//1	k.Pojisty();
	//2	t.SkazatyPryvit();// перевантажанний метод
	//2	k.SkazatyPryvit();// перевантажанний метод
	//2	d.SkazatyPryvit();// перевантажанний метод 

	}

}
