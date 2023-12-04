


//The provided code is a simple implementation of a string compression algorithm. 
//It counts the consecutive repetitions of each character in a string and prints the character followed by its count.
//The memory usage of this code is relatively low as it does not use any additional data structures, but it could be further optimized.
//One improvement you can make is to use a StringBuilder to construct the compressed string. 
//Concatenating strings in a loop using the `+` operator can be inefficient because it creates a new string object each time. 
//Here's an updated version of the compress method using StringBuilder

public class A_StringCompression {
	public static String compress(String s) {
	    int num = s.length(); // calculating length of the string
	    StringBuilder compressed = new StringBuilder();
	    
	    int i = 0;
	    while (i < num) {
	        int repetition = 1;
	        while (i < num - 1 && s.charAt(i) == s.charAt(i + 1)) {
	            repetition++;
	            i++;
	        }
	        compressed.append(s.charAt(i)).append(repetition);
	        i++;
	    }

	    return compressed.toString();
	}
	
	 public static String deCompression(String s) {
	        StringBuilder compressedStr = new StringBuilder();

	        for (int i = 0; i < s.length(); i += 2) { char c = s.charAt(i); int count = Character.getNumericValue(s.charAt(i + 1)); while (count > 0) {
	                compressedStr.append(c);
	                count--;
	            }
	        }

	        return compressedStr.toString();
	    }
	 
	 

	public static void main(String[] args) {
	    String str = "aaaabbcddddd";
	    String compressedStr = compress(str);
	    String decompressStr=deCompression(compressedStr);
	    System.out.println(compressedStr);
	    System.out.println("Decompress String: "+decompressStr);
	}


}




