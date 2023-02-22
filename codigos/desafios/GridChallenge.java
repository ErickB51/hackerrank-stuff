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

class GridChallengeResult {

    public static String gridChallenge(List<String> grid) {
        
        int i, j;
        char[] string;
        char[] to_compare;
        
        for(i = 0; i < grid.size(); i++) {
			
            string = grid.get(i).toCharArray();
            Arrays.sort(string);
            grid.set(i, new String(string));
			
        }
        
        for(i = 0; i < grid.size() - 1; i++) {
			
            string = grid.get(i).toCharArray();
            to_compare = grid.get(i + 1).toCharArray();
			
            for(j = 0; j < string.length; j++) {
				
                if(string[j] > to_compare[j]){
                    return "NO";
                }
				
            }
			
        }
		
        return "YES";
		
    }

}

public class GridChallenge {
	
    public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());


                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());


                String result = GridChallengeResult.gridChallenge(grid);
                
                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }catch(IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
		
    }
	
}