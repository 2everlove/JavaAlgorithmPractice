package ch2;

import java.util.ArrayList;
import java.util.List;

public class MeaningVar {

	//1st code(origin)
	public List<int[]> getThem(){
		List<int[]> list1 = new ArrayList<int[]>();
		for(int[] x : theList)
			if(x[0] == 4)
				list1.add(x);
		return list1;
	}
	
	//2nd code
	public List<int[]> getFlaggedCells1(){
		List<int[]> flaggedCells = new ArrayList<int[]>();
		for(int[] cell : gameBoard)
			if(cell[STATUS_VALUE] == FLAGGED)
				flaggedCells.add(cell);
		return flaggedCells;
	}
	
	//3rd code
	public class Cell{
		private static final int FLAGGED = 4;
		int[] cell;
		public void add(int x) {
			if(cell.length == 0) {
				cell[0] = x;
			} else {
				cell[cell.length] = x;
			}
		}
		public boolean isFlagged() {
			if(cell[cell.length-1] == FLAGGED)
				return false;
			return true;
		}
	}
	
	public List<Cell> getFlaggedCells2(){
		List<Cell> flaggedCells = new ArrayList<Cell>();
		for(Cell cell : gameBoard) {
			if (cell.isFlagged())
				flaggedCells.add(cell);
			return flaggedCells;
		}
	}
	
	
	

}
