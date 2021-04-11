package chap02;

import java.util.Scanner;

public class PhysicalExamination {
	
	static final int VMAX = 21; //시력 분포(0.0~2.0 까지 0.1씩 증가)
	
	static class PhyscData{
		String name;//이름
		int height;//키
		double vision;//시력
		
		
		//생성자
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}//con
	
	//키의 평균값
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		for(int i=0; i<dat.length; i++)
			sum += dat[i].height;
		
		return sum/dat.length;
	}//method
	
	//시력 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		dist[i] = 0;
		for(i=0; i<dat.length; i++)
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX/10.0)
				dist[(int)(dat[i].vision*10)]++;
	}
	
	//사람 수에 맞춰서 * 반복
	static String star(int vdist) {
		String star = "*";
		String result ="";
		if(vdist == 0)
			result = "-";
		else
		for(int i=0; i<vdist; i++) {
			result += star;
		}
		return result;
	}
	
	public static void main(String[] args) {
		//Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.5),
				new PhyscData("박용규", 169, 0.8),
		};
		int[] vdist = new int[VMAX]; //시력 분포
		
		System.out.println("신체검사 리스트");
		System.out.println("이름	키	시력");
		System.out.println("---------------");
		for(int i=0; i<x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		// %-8s 8칸만큼 왼쪽정렬 출력, %3d 3자리의 정수, %5.1f 전체 5자리 중 소수점 1자리의 실수 출력
		
		System.out.printf("\n평균키:%5.1fcm\n",aveHeight(x));
		//%5.1f 전체 5자리 중 소수점 1자리의 실수 출력
		
		distVision(x, vdist);
		
		System.out.println("\n시력 분포");
		for(int i=0; i<VMAX; i++)
			System.out.printf("%3.1f~:%s\n",i/10.0, star(vdist[i]));
			//%3.1f 전체 3자리 중 소수점 1자리의 실수 출력, %2d 2자리의 정수 출력
		
		//stdIn.close();
	}

}
