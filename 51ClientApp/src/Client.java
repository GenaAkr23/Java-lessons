
public class Client {
	private String firstName;
	private String lastName;
	
	static int kilkist = 0; // змінна є статичною
	static boolean ChyMozhnaStvoryty(String fn, String ln){ // метод можно викликати не створювачи об'єкт класу
		return ln.length()<10; // якщо призвіще меньше 10 букв,  
	}
	
	public Client(String fn, String ln){ // конструктор 
		this.firstName = fn; // створюємо новий
		this.lastName = ln; //  об'єкт класу Client
		kilkist++; // можем додати ще рядок коду знизу
		System.out.println("об'єкт "+fn+" створено");
	}
	
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	} 
}
