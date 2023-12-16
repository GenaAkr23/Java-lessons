
public class Varenyk {
	
	private String nachynka; // начинка вареника - картопля, чорниці чи сало
	
//всі поля, які мають модифікатор final - 
//пишуться ВИКЛЮЧНО ВЕЛИКИМИ БУКВАМИ
//значення змінній FINAL можна присвоїти ЛИШЕ ОДИН РАЗ
	public final double VAGA_VARENYKA = 1;// = 100;// Перший варіант ініціалізації
	
	public Varenyk(String n){ 
	//this.VAGA_VARENYKA = 55;
		this.nachynka = n;
	}
	
	public double vagaTarilkyVarenykiv(int kilkistVarenykiv){
		//this.VAGA_VARENYKA = 1;
		return VAGA_VARENYKA*kilkistVarenykiv;
	}
}
