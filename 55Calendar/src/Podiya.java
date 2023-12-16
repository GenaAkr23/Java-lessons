
public class Podiya {
	private int den;
	private int misyats;
	private int rik;
	private String podiya;
	
	public Podiya(int d, int m, int r, String p)// переданные значеня
	{    // полям объекта класса этого класса
		this.den = d;
		this.misyats = m;
		this.rik = r;
		this.podiya = p;
	}
	
	public String toString(){ // ми створили свій властний метод який каже java
		//яки саме поля виводити і в якому форматі, і якій послідовнасті
		//цей метод потрибен коли треба вивести текстовий рядок
		return String.format("%d/%d/%d - %s", den, misyats, rik, podiya);
	}
}
