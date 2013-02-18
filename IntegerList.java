import java.util.LinkedList;
import java.lang.Math;
import java.util.List;

public class IntegerList{

	private static LinkedList<Integer> list = new LinkedList<>();



	public static void main(String[] args){
		for(int c = 1;c<=Integer.parseInt(args[0]);c++){
			int newNum = (int)(Math.random()*1000);
			list.add(newNum);
		}
		int input;
		do{
			input = Integer.parseInt(System.console().readLine());
			if(input<=1000)
			System.out.println(ListSearch.search(input,list));
		}while(input <= 1000);
	}
}


