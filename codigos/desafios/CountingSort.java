import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CountingSortResult {

    public static List<Integer> countingSort(List<Integer> arr) {
        
        int i;
        List<Integer> counting_array = new ArrayList<>();
        
        for(i = 0; i < 100; i++)  counting_array.add(0);
        
        for(i = 0; i < arr.size(); i++) counting_array.set(arr.get(i),counting_array.get(arr.get(i)) + 1);
        
        return counting_array;
		
    }

    public static int getBiggest(List<Integer> arr) {
		
        int i, biggest = arr.get(0);
		
        for(i = 0; i < arr.size(); i++) {
			
            if(arr.get(i) > biggest){
                biggest = arr.get(i);
            }
			
        }
		
        return biggest;
		
    }

}

public class CountingSort {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
        int n = Integer.parseInt(bufferedReader.readLine().trim());
		
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
			
        List<Integer> result = CountingSortResult.countingSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
		
    }
	
}