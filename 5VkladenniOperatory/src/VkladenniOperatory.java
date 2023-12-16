
public class VkladenniOperatory {

	public static void main(String[] args) {
		int vik = 17;
		if (vik < 18)
		{
			System.out.println("Ви неповнолітній/-а");
			switch (vik)
			{
			case 17:
				System.out.println("Скоро повноліття");
				break;
			default:
				System.out.println("Повноліття не скоро");
				break;
			}
			if (vik <= 10)
			{
				System.out.println("Ви дуже юний/-а");
			}
			else
			{
				System.out.println("Вам лишилось кілька років до повноліття");
			}
		}
		else
		{
			System.out.println("Ви повнолітній/-я");
			if (vik < 60)
			{
				System.out.println("Вам менше ніж 60");
			}
			else
			{
				System.out.println("Вам за 60");
			}
		}

	}

}
