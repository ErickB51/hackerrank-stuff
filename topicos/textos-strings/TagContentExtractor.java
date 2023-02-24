import java.io.*;
import java.util.*;

public class TagContentExtractor {
	
    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
		
        ArrayList<String> valids = new ArrayList<>();
        
        int n, i, count_valid_per_line;
        boolean read_tag, read_end_tag, read_content;
        
        String input, tag, content, end_tag;
        
        n = in.nextInt();
        in.nextLine();
        
        read_tag = false;
        read_end_tag = false;
        read_content = false;
        
        while(--n >= 0) {
        
            input = in.nextLine();
			
            count_valid_per_line = 0;
            tag = ""; 
            content = "";
            end_tag = "";
            
            
            for(i = 0; i < input.length(); i++) {
                
                if(input.charAt(i) == '<') {
					
                    if(i + 1 < input.length() && input.charAt(i + 1) == '/') {
						
                        end_tag = "";
                        read_end_tag = true;
                        read_tag = false;
                        read_content = false;
						
                    }else {
						
                        tag = "";
                        content = "";
                        read_end_tag = false;
                        read_tag = true;
                        read_content = false;
						
                    }
					
                }else {
					
                    if(input.charAt(i) == '>') {
						
                        if(read_tag) {
							
                            read_tag = false;
                            read_content = true;
							
                        }
						
                        if(read_end_tag) {
							
                            read_tag = false;
                            read_end_tag = false;
                            read_content = false;
							
                            if(tag.equals(end_tag) && !tag.equals("")) {
                                //System.out.println("VALID");
                                //System.out.println("TAG: "+tag);
                                //System.out.println("CONTENT: "+content);
                                //System.out.println("END_TAG: "+end_tag);
								
                                if(!content.equals("")) {
									
                                    valids.add(content);
                                    count_valid_per_line++;
									
                                }
								
                            }
							
                            tag = "";
                            end_tag = "";
							
                        }
						
                    }else {
                        if(read_tag) {
							
                            tag += input.charAt(i);
							
                        }
                        if(read_end_tag) {
							
                            if(input.charAt(i) != '/') {
								
                                end_tag += input.charAt(i); 
								
                            }
							
                        }
						
                        if(read_content) {
							
                            content += input.charAt(i);
							
                        }
						
                    }
					
                }
				 
            }
            
            //System.out.println();
            
            if(count_valid_per_line == 0) {
				
                valids.add("None");
				
            }
			
        }
		
        for(String s : valids) {
			
            System.out.println(s);
			
        }
		
    }
	
}