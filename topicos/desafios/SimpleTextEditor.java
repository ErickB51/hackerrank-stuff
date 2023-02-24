import java.io.*;
import java.util.*;

class TextEditor {
	
    private String text = "";
    private List<String> backups = new ArrayList<>();
	
    public void append(String append) {
		
        backups.add(text);
        text += append;
		
    }
	
    public void delete(int n) {
		
        backups.add(text);
        text = text.substring(0, text.length() - n);
		
    }
	
    public void print(int index) {
		
        if(index > 0 && index <= text.length()) {
			
            System.out.println(text.charAt(index - 1));
			
        }
		
    }
	
    public void undo(){
		
        if(backups.size() > 0) {
			
            text = backups.get(backups.size() - 1);
            backups.remove(backups.size() - 1);
			
        }
		
    }
	
}

public class SimpleTextEditor {

    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        
        TextEditor text_editor = new TextEditor();
		
        while(n-- > 0) {
            
            String[] tokens = input.readLine().split(" ");
			
            switch(Integer.parseInt(tokens[0])) {
                
                case 1:
				
                    text_editor.append(tokens[1]);
                    break;
					
                case 2:
				
                    text_editor.delete(Integer.parseInt(tokens[1]));
                    break;
					
                case 3:
				
                    text_editor.print(Integer.parseInt(tokens[1]));
                    break;
					
                case 4:
				
                    text_editor.undo();
                    break;
					
            }
            
        }
		
        input.close();
		
    }
	
}