import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		/*
		 * String[] arr= {"cvc","dk","vv","khsuhsid", "vv", "dbttd", "abc","abc"};
		 * //find the list of string which contains vowel //find the smallest string
		 * fronm array list; //count the frequency of each string List<String> list=new
		 * ArrayList<>(); int count=0; for(int j=0;j<arr.length;j++) { count=1; for(int
		 * i=j+1;i<arr.length;i++) { if(arr[i].equals(arr[j])){
		 * 
		 * list.add(arr[j]); count++; arr[i]="";
		 * 
		 * }
		 * 
		 * 
		 * } if(arr[j]!="") { System.out.println(arr[j]+" | "+count); } }
		 */

	
		


/*Example 1:

Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.
Example 2:

Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
Example 3:

Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.
 * 
 * 
 * 
 * 
 * */
		
		String[] words= {"leetcoder","leetcode","od","hamlet","am"};
		//["as","hero"]
		List<String> list=new ArrayList<>();

        for(int i=0;i<words.length;i++){

            for(int j=i+1;j<words.length;j++){

                if(words[i].contains(words[j])){
                	if(!list.contains(words[j])){
                    
                    	
                    	  list.add(words[j]);
                    }


                }
                if(words[j].contains(words[i])){
                    if(!list.contains(words[i])){
                       
                   
                    	
                    	  list.add(words[i]);
                    }

                }
            }
        }

     
       System.out.println(list);
		
	
		
	}
	
	
}

