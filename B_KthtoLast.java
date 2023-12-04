

import java.util.LinkedList;

public class B_KthtoLast {



	    public static int findKthToLast(LinkedList<Integer> linkedList, int k) {
	        if (linkedList == null || k < 1 || k > linkedList.size()) {
	            throw new IllegalArgumentException("Invalid input");
	        }

	        int pointer1 = 0;
	        int pointer2 = k - 1;

	        while (pointer2 < linkedList.size() - 1) {
	            pointer1++;
	            pointer2++;
	        }

	        return linkedList.get(pointer1);
	    }

	    public static void main(String[] args) {
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        linkedList.add(1);
	        linkedList.add(2);
	        linkedList.add(3);
	        linkedList.add(4);
	        linkedList.add(5);

	        int k = 2; // Change this to the desired value of k

	        try {
	            int result = findKthToLast(linkedList, k);
	            System.out.println("The " + k + "th to the last element is: " + result);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	

}
