package spring0611;

public class MyCalculation {

	Calculation cal ;
	int f;
	int s;
	
	public void add() {
		cal.add(f, s);
	}
	public void sub() {
		cal.sub(f, s);
	}
	public void mul() {
		cal.mul(f, s);	
	}
	public void div() {
		cal.div(f, s);
	}
	public Calculation getCal() {
		return cal;
	}
	public void setCal(Calculation cal) {
		this.cal = cal;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}


}
