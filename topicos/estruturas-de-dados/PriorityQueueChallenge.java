import java.io.*;
import java.util.*;

class StudentPriorityQueue {
	
    private int id;
    private String name;
    private double cgpa;
	
    public StudentPriorityQueue(int id, String name, double cgpa) {
		
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
		
    }
	
    public int getID() {
        return this.id;
    }
	
    public String getName() {
        return this.name;
    }
	
    public double getCGPA() {
        return this.cgpa;
    }
	
}

class StudentPriorityQueueOrdenator implements Comparator<StudentPriorityQueue> {
	
    @Override
    public int compare(StudentPriorityQueue a, StudentPriorityQueue b) {
		
        if(a.getCGPA() > b.getCGPA()) {
			
            return -1;
			
        }else {
			
            if(a.getCGPA() < b.getCGPA()) {
				
                return 1;
				
            }else {
				
                if(a.getName().compareTo(b.getName()) != 0) {
					
                    return a.getName().compareTo(b.getName());
					
                }else {
					
                    return a.getID()-b.getID();
					
                }
				
            }
			
        }
		
    }
	
}

class Priorities {
	
    public Priorities() {
		
    }
	
    List<StudentPriorityQueue> getStudentPriorityQueues(List<String> events) {
		
        Scanner in;
        Queue<StudentPriorityQueue> queue = new PriorityQueue<>(1, new StudentPriorityQueueOrdenator());
		
        for(int i = 0; i < events.size(); i++) {
			
            in = new Scanner(events.get(i));
			
            String query_type = in.next();
            switch(query_type) {
				
                case "ENTER":
				
                    String name = in.next();
                    double cgpa = in.nextDouble();
                    int id = in.nextInt();
					
                    queue.add(new StudentPriorityQueue(id,name,cgpa));
                    break;
					
                case "SERVED":
				
                    if(!queue.isEmpty()) {
						
                        queue.remove();
						
                    }
                    break;
            }
			
        }
		
        List<StudentPriorityQueue> StudentPriorityQueues = new ArrayList<>();
		
        while(!queue.isEmpty()) {
			
            StudentPriorityQueues.add(queue.remove());
			
        }
		
        return StudentPriorityQueues;
		
    }
    
}

public class PriorityQueueChallenge {
	
    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
		
        int num_queries = in.nextInt();
        in.nextLine();
		
        List<String> queries = new ArrayList<>();
		
        while(num_queries-- > 0) {
			
            queries.add(in.nextLine());
			
		}
		
        Priorities p = new Priorities();
        List<StudentPriorityQueue> StudentPriorityQueues = p.getStudentPriorityQueues(queries);
		
        if(StudentPriorityQueues.isEmpty()) {
			
            System.out.println("EMPTY");
			
        }else {
			
            for(StudentPriorityQueue s : StudentPriorityQueues) {
				
                System.out.println(s.getName());
				
            }
			
        }
		
    }
	
}