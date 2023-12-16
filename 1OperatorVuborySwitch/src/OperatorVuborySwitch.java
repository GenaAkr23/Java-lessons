import java.util.Scanner;

public class OperatorVuborySwitch {

	public static void main(String[] args) {
		
		System.out.println("Введіть літеру");
		String litera = "";
		Scanner skan = new Scanner(System.in);
		litera = skan.nextLine();
		// 5 способ 
		switch (litera.toLowerCase())
		{
		case "а":
		case "е":
		case "є":
		case "и":
		case "і":
		case "ї":
		case "о":
		case "у":
		case "ю":
		case "я":
			System.out.println("це голосна");
			break;
		case "б":
		case "в":
		case "г":
		case "ґ":
		case "д":
		case "ж":
		case "з":
		case "й":
		case "к":
		case "л":
		case "м":
		case "н":
		case "п":
		case "р":
		case "с":
		case "т":
		case "ф":
		case "х":
		case "ц":
		case "ч":
		case "ш":
		case "щ":
		case "ь":
			System.out.println("це приголосна");
			break;
		default:
			System.out.println("Я не знаю що це за буква");
			break;
		}
		
		
		
		
		// 4  System.out.println("Введіть першу літеру своєї області");
		// String litera = "";
		//  Scanner skan = new Scanner(System.in);
		// litera = skan.nextLine();
		
		// switch (litera.toLowerCase())
		// {
		// case "в":
		// 	System.out.println("Вінницька або Волинська");
			// break;
		// case "д":
			// System.out.println("Дніпропетровська або Донецька");
			// break;
		
		
		// 3  int a = 0;
		// switch(a)
		// {
		// case 0:
		// 	System.out.println("0");
			// break;
		// case 1:
			// System.out.println("1");
			// break;
		// default:  // можно не писать
			// break; // можно не писать
		
		
		// 2 switch (litera)
		//{
		//case "в":
			//  System.out.println("Вінницька або Волинська");
			//break;
		//case "д":
			// System.out.println("Дніпропетровська або Донецька");
			// break;
		// case "ж":
			// System.out.println("Житомирська");
			// break;
		// case "з":
			// System.out.println("Закарпатська або Запорізська");
			// break;
		// case "і":
			// System.out.println("Івано-Франківська");
			// break;
		// case "к":
			// System.out.println("Київська або Кіровоградська або Крим");
			// break;
		// case "л":
			// System.out.println("Луганська або Львівська");
			// break;
		// case "м":
			// System.out.println("Миколаївська");
			// break;
		// case "о":
			// System.out.println("Одеська");
			// break;
		// case "р":
			// System.out.println("Рівненська");
			// break;
		// case "с":
			// System.out.println("Сумська");
			// break;	
		// case "т":
			// System.out.println("Тернопільська");
			// break;
		// case "х":
			// System.out.println("Харьківська або Херсонська або Хмельницька");
			// break;
		// case "ч":
			// System.out.println("Черкаська або Чернівецька або Чернігівська");
			// break;
		// default:
			// System.out.println("Області на таку літеру не знайдено");
			// break;
		// }
	
		
		// 1 if (litera.equals("в"))
		// {
		//	System.out.println("Вінницька або Волиньска");
		// }
		// else if (litera.equals("д"))
		// {
		//	System.out.println("Дніпропетровська або Донецька");
		// }
		// else if (..)
		// {
			
		}
		
	}


