
public class Data {
	private int den;
	private int misyats;
	private int rik; 
	
	public Data(int d, int m, int r)
	{
		this.den = d; this.misyats = m; this.rik = r;
	}
	public String toString(){
		return String.format("%s,%s,%s", den, misyats, rik);
	}
}
