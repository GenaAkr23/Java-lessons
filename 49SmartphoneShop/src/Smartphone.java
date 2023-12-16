
public class Smartphone {
	private String brendName; // з початку робимо поле private
	private boolean isNew; // true = тел. новий, false = тел. б/у 
	private double tsina;
	
	// 1. Назва метода-конструктора обов'язково повинна співпадати
	//    з назвою вашего класу
	// 2. Метод -конструктор не повинен мати ніяких модифікаторів,
	//    типу public, private, static чи типів даних
	// 3. Метод -конструктор буде запущений і виконаний Джавою автоматично
	//    під час створення нового об'єкта цього класу
	
	// 1 Smartphone() { // метод Конструктор
	//	this.brendName = "-не вказано-"; 
	//	this.isNew = true;
	//}
	
	// конструктор №1
	Smartphone (){}
	// конструктор №2
	Smartphone(String newBrandName, boolean isNew) { // метод Конструктор
		this.brendName = newBrandName; 
		this.isNew = isNew;
	}
	// конструктор №3
	Smartphone(String newBrandName, boolean isNew, double newTsina) { // метод Конструктор
		this.brendName = newBrandName; 
		this.isNew = isNew;
		this.tsina = newTsina;
	}
	
	
	
	
	
	
	String getBrendName(){ // метод getter
		return brendName; // повертає поле brendName - змінну типу String
	}
	void setBrendName(String newBrendName){ // метод setter, встановити значення цього поля і приймає параметр String
		this.brendName = newBrendName; // запишимо заначення в це поля
		// зробили інкапсуляцію для поля brendName, це поле private 
		
		// для інкапсуляції других полей:
		// 1. Виделяем поле
		// 2. Кликаєм правой кнопки миши
		// 3. Кликаєм Refactor
		// 4. Кликаєм Encapsulate Field
		// 5. Откривается поле, кликаемо "Ок"
	}
	boolean isNew() {
		return isNew;
	}
	void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	double getTsina() {
		return tsina;
	}
	void setTsina(double tsina) {
		if(tsina<0)
		{
			this.tsina = 0;
		} 
		else {
		this.tsina = tsina;
	} }
}
