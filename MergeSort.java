public class MergeSort{
	
	public static LinkedList<Integer> sort(LinkedList<Integer> list){
		if(list.size()==1 || list.size()==0){
			return list;
		}else{
			LinkedList<Integer> leftList = new LinkedList<>(list.subList(0,(int)(list.size()/2)));
			LinkedList<Integer> rightList = new LinkedList<>(list.subList((int)(list.size()/2)+1,0));
			
			LinkedList<Integer> returnedLeft MergeSort.sort(leftList);
			LinkedList<Integer> returnedRight MergeSort.sort(rightList);
			LinkedList<Integer> newList = new LinkedList<>();
			
			newList.a
