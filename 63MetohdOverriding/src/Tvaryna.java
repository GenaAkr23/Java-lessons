
public class Tvaryna {
	
/*1*/ private String imya;// створимо нове поле
/*2*/ public Tvaryna(String i){// створюмо конструктор для ношого класу
		this.imya = i;
	}
/*3*/ public String SkazatyPryvit(){//створимо метод
		return String.format("Тварина %s каже привіт", this.imya);

	}
/*12*/public String getImya(){return this.imya;}// метод повертає і'мя
}
