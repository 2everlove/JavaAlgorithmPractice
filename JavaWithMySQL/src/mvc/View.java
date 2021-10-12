package mvc;

import java.util.ArrayList;

public class View {
	public void printView(ArrayList<Model> modelArr) {
		for (Model model : modelArr) {
			System.out.print("no : " + model.getNo());
			System.out.print("| math : " + model.getMath());
			System.out.print("| eng : " + model.getEng());
			System.out.print("| avg : " + model.getAvg());
			System.out.print("| name : " + model.getName());
			System.out.print("| classes : " + model.getClasses());
			System.out.println();
		}
	}
}
