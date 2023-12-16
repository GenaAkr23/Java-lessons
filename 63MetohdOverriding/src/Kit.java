
public class Kit extends Tvaryna{// class Kit - наслідує class Tvaryna

	public Kit(String i) {// додается автоматично конструктор
/*7*/	super(i);// це означає - викликати підходящий метод батькивського класу
			}
/*13*/ @Override// додати помітку над вашим методом яку ви заміщуваєте
	   // @Заміщення атрибут в Java 5 необов'язковий, але зручний і корисний для програміста
	   // тобто такий же метод є у батьковському класі
/*11*/ public String SkazatyPryvit(){//вставили метод из класу Tvaryna
/*12*/	// return String.format("Тварина %s каже привіт, мяу", super.getImya());// меняемо this.imya на  
/*16*/ return super.SkazatyPryvit()+ ", мяу";// так можемо застосувати скрочення
	}
}
