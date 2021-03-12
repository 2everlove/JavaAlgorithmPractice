package p0311;

public class StuScoreBean {
	
	static int s_count = 1;
	{
		//1씩 자동으로 숫자가 증가해서 stu_num에 저장하는 로직
		//sm77798765으로 들어간다 가정
		//Integer.parseInt(String.format("%s03d", s_count));
		this.stu_num = s_count;
		s_count++;
	}//초기화 블럭
	
	public StuScoreBean(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3;
		this.rank = rank;
	}
	// StuScoreBean s = new StuScoreBean(stu, nam,....)
	private int stu_num;
	public StuScoreBean(int stu_num, String name, int kor, int eng, int math, int rank) {
		this.stu_num = stu_num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.total = total/3;
		this.rank = rank;
	}

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	public int getStu_num() {
		return stu_num;
	}
	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
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
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	
}
