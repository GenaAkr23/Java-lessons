
public class Drakon extends Tvaryna{

/*8*/public Drakon(String i) {// додается автоматично конструктор
/*9*/	super(i);// це означає - викликати підходящий метод батькивського класу

	}
/*15*/@Override
/*14*/public String SkazatyPryvit(){//створимо метод
	return String.format("Дракон %s з вогнем кричить Пшшшшивіт", super.getImya());

}
}
