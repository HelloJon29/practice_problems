import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public boolean isPalindrome(int x) {
        List<Integer> digitList = new ArrayList<Integer>();
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            digitList.add(x % 10);
            x /= 10;
        }
        List<Integer> reversedList = new ArrayList<>(digitList);
        Collections.reverse(reversedList);
        if (!digitList.equals(reversedList)) {
            return false;
        }
        return true;
    }
}

/*
 * Given an integer X return true if X is a palindrome, false otherwise
 * Read input forward and backward
 * Won't know input so use while loop
 * need to split each number given into single digits and add to a datastructure
 * ignore negatives as they will never count as palindrome
 * Reverse the datastructure and put into new variable to compare to original
 * datastructure
 * return false if it is not a palindrome otherwise return true
 */
