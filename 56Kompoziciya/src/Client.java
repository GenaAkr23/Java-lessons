
public class Client {
	private String imya;//1.  Ім'я паціента
	private Data dataNarodzhennya;//2.  Дата народження (рік, число, місяць)
	private Data dataReyestratsiyi;
//	private int denNar;
//	private int misyatsNar;
//	private int rikNar;
	public Client (String i, Data dn)
//	public Client (String i, int d, int m, int r)
	{
		this.imya = i; this.dataNarodzhennya = dn;
//		this.imya = i; this.denNar = d; this.misyatsNar = m; this.rikNar = r;
		
	}
	public String toString(){
		return String.format("Ім'я: %s%nДата народження:%s", imya, dataNarodzhennya);
	}
}
