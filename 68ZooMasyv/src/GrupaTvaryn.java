
public class GrupaTvaryn {
	private Tvaryna[] grupa;
	public GrupaTvaryn(int kilkist){
		 grupa = new Tvaryna[kilkist];
	}
	public void Dodaty(Tvaryna t){
		//перевіримо чи група має вільні місця,
		//і якщо має - то додамо туди тварину
		for(int i=0; i<grupa.length; i++){
			if (grupa[i]==null){
				grupa[i]=t;
				System.out.println("Тварина " + t.getClass().getName()
				+" "+ t.getImya() 
				+ " додано до групи. Його порядковий номер: " + (i+1));
				break;
			}
		}
	}
}
