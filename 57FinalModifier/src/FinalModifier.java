
// змінним з модифікатором final можна присвоїти значення ЛИШЕ ОДИН РАЗ
import java.math.*;
public class FinalModifier {

	public static void main(String[] args) {
		double PI = Math.PI;
		System.out.printf("%s", PI);
		
		//Math.PI = 25;// не спрацює, тому що поле PI має модифікатор final
	}

}
//final змінній можна присвоїти значення лише 1 раз
//    - що ми вивчили в цьому уроці

//final метод не може бути заміщений (overriding) при успадкуванні


//final клас не може бути використаний для
//      успадкування (наслідування) (inheritance)

