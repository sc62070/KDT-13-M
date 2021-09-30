package mc.sn.day8;
// Àº´Ð¼º
public class ScoreSheet {
	//
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	
	public ScoreSheet(String name, String kor, String eng, String math) {
		this.name = name;
		this.kor = Integer.parseInt(kor);
		this.eng = Integer.parseInt(eng);
		this.math = Integer.parseInt(math);
		this.calcuTotal();
	}
	
	public int getTotal() {
		return total;
	}
	private void calcuTotal() {
		this.total = this.kor +this.eng + this.math;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		this.calcuTotal();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		this.calcuTotal();
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
		this.calcuTotal();
	}
	
}
