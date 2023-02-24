import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MergeTwoSortedLinkedLists {

    static class SinglyLinkedListNode {
		
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
		
    }

    static class SinglyLinkedList {
		
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
			
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if(this.head == null) {
                this.head = node;
            }else {
                this.tail.next = node;
            }

            this.tail = node;
			
        }
    }
	
    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while(node != null) {
			
            bufferedWriter.write(String.valueOf(node.data));
			
            node = node.next;
			
            if(node != null) {
                bufferedWriter.write(sep);
            }
			
        }
		
    }
	
	static SinglyLinkedListNode mergeLists(SinglyLinkedListNode fst_head, SinglyLinkedListNode snd_head) {
        
        SinglyLinkedList merged_list;
        SinglyLinkedListNode fst_comparison_node, snd_comparison_node, to_insert;
        
        merged_list = new SinglyLinkedList();
        fst_comparison_node = fst_head;
        snd_comparison_node = snd_head;
        
        while(fst_comparison_node != null && snd_comparison_node != null) {
            
            if(fst_comparison_node.data < snd_comparison_node.data){
				
                merged_list.insertNode(fst_comparison_node.data);
                fst_comparison_node = fst_comparison_node.next;
				
            }else {
				
                merged_list.insertNode(snd_comparison_node.data);
                snd_comparison_node = snd_comparison_node.next;
				
            }
            
        }
        
        if(fst_comparison_node == null) {
            while(snd_comparison_node != null) {
				
                merged_list.insertNode(snd_comparison_node.data);
                snd_comparison_node = snd_comparison_node.next;
				
            }
        }
        
        if(snd_comparison_node == null) {
            while(fst_comparison_node != null) {
				
                merged_list.insertNode(fst_comparison_node.data);
                fst_comparison_node = fst_comparison_node.next;
				
            }
        }
        
        return merged_list.head;
		
    }
	
    private static final Scanner scanner = new Scanner(System.in);
	
    public static void main(String[] args) throws IOException {
		
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
        for (int testsItr = 0; testsItr < tests; testsItr++) {
			
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }
          
            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printSinglyLinkedList(llist3, " ", bufferedWriter);
            bufferedWriter.newLine();
			
        }
		
        bufferedWriter.close();
		
        scanner.close();
		
    }
	
}