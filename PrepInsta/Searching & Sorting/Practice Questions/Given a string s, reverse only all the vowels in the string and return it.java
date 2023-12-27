/*    Given a string s, reverse only all the vowels in the string and return it.
      The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

      Example 1:
      
          Input: s = "hello"
          Output: "holle"
      
      Example 2:
          
          Input: s = "leetcode"
          Output: "leotcede"
      
      Constraints:
      
          1 <= s.length <= 3 * 105
          
          s consist of printable ASCII characters. */

// SOLUTION
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int l = 0;
        int r = ch.length-1;
        while(l<r){
            if(isVowel(ch[l]) && isVowel(ch[r])){
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
            else if(isVowel(ch[l])){
                r--;
            }
            else if(isVowel(ch[r])){
                l++;
            }else{
                l++;
                r--;
            }
        }
        System.out.println(String.valueOf(ch));
    }
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
