import java.util.List;
import java.util.Collections;

class MedianaESort {
	
    public static int findMedian(List<Integer> arr) {
		
        Collections.sort(arr);
		
        if(arr.size()%2 != 0) {
			
            return arr.get(arr.size()/2);
			
        }else {
			
            return arr.get(arr.size() / 2)+arr.get((arr.size() / 2) - 1);
			
        }
		
    }
	
}