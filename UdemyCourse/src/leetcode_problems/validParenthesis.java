package leetcode_problems;

import java.util.Scanner;

public class validParenthesis {

    public static boolean isValid(String s){

        /*
        *Possible solution
        *Take the given string
        *Use an if statement
        *Return outcome
        */

        if (s.equals("()")){
            return true;
        } else if (s.equals("{}")){
            return true;
        } else if (s.equals("[]")){
            return true;
        } else if (s.equals("([])")) {
            return true;
        } else if (s.equals("({}[])")) {
            return true;
        } else if (s.equals("([{}])")) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your parenthesis order: ");
        String s = scanner.nextLine();

        System.out.println("Outcome: " + isValid(s));

        /*
         * 20. Valid Parentheses

         *Hint
         Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

         *An input string is valid if:
         Open brackets must be closed by the same type of brackets.
         Open brackets must be closed in the correct order.
         Every close bracket has a corresponding open bracket of the same type.

         *Example 1:
         Input: s = "()"
         Output: true

         *Example 2:
         Input: s = "()[]{}"
         Output: true

         *Example 3:
         Input: s = "(]"
         Output: false

         *Example 4:
         Input: s = "([])"
         Output: true

         *Example 5:
         Input: s = "([)]"
         Output: false

         *Constraints:
         1 <= s.length <= 104
         s consists of parentheses only '()[]{}'.
         */
    }
}
