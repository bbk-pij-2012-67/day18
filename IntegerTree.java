import java.util.LinkedList;
import java.util.Math;

public class IntegerList{

	private LinkedList<Integer> list = new LinkedList<>();



	public static void main(String[] args){
		for(int c = 1;c<=Integer.parseInt(args[0]);c++){
			int newNum = Math.abs(Math.random()*1000);
			list.add(newNum);
		}
		int input = Integer.parseInt(System.console().readLine());
		while(input <= 1000){
			ListSearch(input,list);
		}
	}
}


