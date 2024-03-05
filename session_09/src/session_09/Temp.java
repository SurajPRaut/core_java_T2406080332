package session_09;
public class Temp {	
	private int i;

	public Temp(int i) {
		super();
		this.i = i;
	}

	@Override
	public String toString() {
		return i+"";
	}

	@Override
	public int hashCode() {
		return i;
	}
	
	
	
	

}