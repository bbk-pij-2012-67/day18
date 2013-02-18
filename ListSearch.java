import java.util.LinkedList;
import java.util.List;
import java.lang.Math;

public class ListSearch{

	public static boolean search(int num, LinkedList<Integer> list){
		if(list.size() == 0 ){
			return false;
		}else{
			if(list.get((int)(list.size()/2))==num){
				return true;
			}else{
				
				boolean result = ListSearch.search(num,new LinkedList<Integer>((list.subList(0,Math.max(0,(int)(list.size()/2)-1)))));
				if(result){
					return true;
			        }else{
				        result = ListSearch.search(num,new LinkedList<Integer>((list.subList(Math.min(list.size(),(int)(list.size()/2)+1),list.size()))));
				        if(result){
				        	return true;
				        }
			        }
		         }
	         }
	         return false;

         }
}

