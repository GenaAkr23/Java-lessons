
public class ClientApp {

	public static void main(String[] args) {
		
		System.out.println(Client.kilkist);
		
		String fn = "Тарас", ln = "Бульбааааааааааааа";
		if(Client.ChyMozhnaStvoryty(fn, ln)){
		Client c2 = new Client(fn, ln);
		} else { // якщо не прошли перевірку
			System.out.println("Згідно правил, не можна створити користувача з такими даними");
		}
		System.out.println(Client.kilkist);
		
		///  Client c1 = new Client("Джеймс", "Бонд");
		
		/// СПОСИБ ВИКЛИКУ СТАТИЧНОГО ПОЛЯ
		/// c1.kilkist = 1; -- неправильно
		/// Client.kilkist = 1; // правильно. Статично поле класу Client
		// 1 System.out.println(Client.kilkist);
		// Client c1 = new Client("Джеймс", "Бонд");
		// Client c2 = new Client("Тарас", "Бульба");
		// Client c3 = new Client("Олекса", "Довбуш");
		// AddMoreClients(); // викликаем метод тут
		// System.out.println(Client.kilkist);
	//} 
	// public static void AddMoreClients(){ // можем додати ще один метод static
		// Client c4 = new Client("Дмитро", "Донцов");
		// Client c5 = new Client("Elvis", "Presley");
	}
}
 