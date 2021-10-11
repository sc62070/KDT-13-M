package mc.sn.jdbc.day15;

public class StdData {
	//name, addr 필드로 하는 데이터 클래스를 만드시오 
	private String name;
	private String addr;
	
	public StdData(String name,String addr) {
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return name+","+addr;
	}
}
