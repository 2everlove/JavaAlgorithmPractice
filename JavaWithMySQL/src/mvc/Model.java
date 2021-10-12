package mvc;

public class Model {
	
	private int no;
	private int math;
	private int eng;
	private int avg;
	private String name;
	private String classes;
	
	public Model(int no, int math, int eng, int avg, String name, String classes) {
		this.no = no;
		this.math = math;
		this.eng = eng;
		this.avg = avg;
		this.name = name;
		this.classes = classes;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}
	
}
