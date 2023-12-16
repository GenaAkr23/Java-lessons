
public class OfficeManagerApp {

	public static void main(String[] args) {
		
		Person p = new Person(); 
		// p.imya = "...5*^%&*@#$"; // Відповідно, тепер щоб зчитати
		// значення поля "imya", портібно викликати метод p.getImya();
		p.setImya("...5*^%&*@#$768578483837737278282884884848*&^%%$$#@@@#$$%&&^%");// метод
		p.setVik(2147483647); // метод
		p.setZrist(1.65739567343);// метод
		
		System.out.println(p.getVik());
		System.out.println(p.getImya());
	}

}
