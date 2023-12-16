
public class FirstOopClass {

	public static void main(String[] args) {
		// Scanner s = new Scanner(...);
		// Random r = new Random(); 
		// створити новий об'єкт класу/типу "Box" - в памяті комп'ютора
		Box myBox = new Box(); // Оператор new - вказує що треба зробить Об'єкт myBox
		myBox.width = 2; // "dot operator" - (крапка)
		myBox.height = 3;
		myBox.length = 4;
		
		double obyem = myBox.Obyem(); // myBox.height*myBox.length*myBox.width;
		System.out.println(obyem);
		
		
		Box myBox2 = new Box();
		myBox2.width = 1;
		myBox2.height = 2;
		myBox2.length = 3;
		System.out.println(myBox2.Obyem());
		
		
	}

}
