// Ques link: https://leetcode.com/problems/evaluate-reverse-polish-notation/

package Microsoft;
import java.util.Stack;
class Solution {
    public int answer(String s,int operand1,int operand2){
        if(s.contains("+"))
        return operand1 + operand2;
        else if(s.contains("-"))
        return operand2-operand1;
        else if(s.contains("*"))
        return operand1*operand2;
        else
        return operand2/operand1;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String operators = "+-*/";
        for(String s : tokens){
            if(operators.contains(s)){
                int operand1 = st.pop();
                int operand2 = st.pop();
                int ans = answer(s,operand1,operand2);
                st.push(ans);
            }
            else{
                st.push(Integer.valueOf(s));
            }
        }
        return st.pop();
    }
}