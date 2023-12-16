// Metohd Overriding = Заміщення методу
public class MetohdOverriding {

	public static void main(String[] args) {
/*4*/Tvaryna t = new Tvaryna("Марина");// створимо об'єкт для наших трьох класів	
/*5*/Kit k = new Kit("Мурзік");// наступний об'єкт Kit
/*6*/Drakon d = new Drakon("Вогнемет");// є підкреслення - автоматично додаємо конструктор у клас

/*10*/System.out.println(t.SkazatyPryvit());// - виводимо значення на екран
	  System.out.println(k.SkazatyPryvit());
	  System.out.println(d.SkazatyPryvit());

	}

}
