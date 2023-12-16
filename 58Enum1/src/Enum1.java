import java.time.LocalDateTime; // клас який показує реальний час на комп'юторі
public class Enum1 {

	public static void main(String[] args) {
	
		switch (getPoraRoku())
		{
		//1 case "зима":
		//2 case PoryRoku.ZYMA:	
		case ZYMA:	
			System.out.println("Вдягайтесь дуже тепло");
			break;
		//1 case "весна":
		//2 case PoryRoku.VESNA:
		case VESNA:	
			System.out.println("Вдягайтесь по-весняному");
			break;
		//1 case "літо":
		//2 case PoryRoku.LITO:	
		case LITO:
			System.out.println("Вдягайтесь легко");
			break;
		//1 case "осінь":
		//2 case PoryRoku.OSIN:
		case OSIN:	
			System.out.println("Вдягайтесь по-осінньому");
			break;
		default:
			System.out.println("Вдягайтесь як хочете, я не знаю яка зараз пора року");
			break;
		}

	}
	
	// 1 public static String getPoraRoku()
	public static PoryRoku getPoraRoku()
	{
		LocalDateTime now = LocalDateTime.now();// отримає від системи яка зараз дата: рік, місяць, день, години. метод поверне значення в той момент коли ми его викличемо
		int m = now.getMonthValue();// метод повертає номер місяца
		switch(m){
		case 1:
		case 2:
		case 12:
			return PoryRoku.ZYMA;
			//return "зима";
		case 3:
		case 4:
		case 5:
			return PoryRoku.VESNA;
			//return "весна";
		case 6:
		case 7:
		case 8:
			return PoryRoku.LITO;
			//return "літо";
		case 9:
		case 10:
		case 11:
			return PoryRoku.OSIN;
			//return "осінь";
		default:
			return PoryRoku.NEVIDOMA;
		}
		
	}
}
