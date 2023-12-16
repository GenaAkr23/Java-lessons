
public class Person {
	// поля (або "властивості") класу Person
	private String imya; // ім'я
	private String prizv; // прізвище
	private int vik; // вік
	private double zrist; // зріст
	private String profesiya; //
	
	// щоб зробити інкапсуляцію, потрібно:
	// 1. додати модифікатор private до нашего поля, і
	// 2. створити 2 методи - getter & setter 
	
	// get (англ. "дістати")
	
	String getImya(){
		return imya;
	}
	// set (англ. "встановити")
	void setImya(String newImya){
/*якщо*/if (newImya.length()>50)
/*то*/  {
		this.imya = newImya.substring(0, 50);
		}
		else
		{
		this.imya = newImya; // this - означає цей клас
		}
	}
	
	String getFullName() // отримати полне им'я
	{
		return imya + " " + getPrizv(); // повернути
	}
	String getFullInfo(){
		return getFullName() + " (вік: " + getVik() + "; зріст: " + getZrist() + " )"; 
	}
	String getPrizv() {
		return prizv;
	}
	void setPrizv(String prizv) {
		this.prizv = prizv;
	}
	int getVik() {
		return vik;
	}
	void setVik(int vik){
		if (vik>80)
		{
			this.vik = 80;
		}
		else 
		{	
		this.vik = vik;
		}
	}
	double getZrist() {
		return zrist;
	}
	void setZrist(double zrist) {
		this.zrist = zrist;
	}
	String getProfesiya() {
		return profesiya;
	}
	void setProfesiya(String profesiya) {
		this.profesiya = profesiya;
	}
}
