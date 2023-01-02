// Ques link : https://leetcode.com/problems/rotate-function/
package Microsoft;
public class Rotate_Function{
 public int maxRotateFunction(int[] nums) {
  
    
        int sum = 0;
        int sumfirst = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            sumfirst += i*nums[i]; 
        }
        int ans = sumfirst;
        for(int i = 1;i < nums.length;i++){
            sumfirst += nums[i-1]*nums.length - sum;
            ans = Math.max(ans,sumfirst);
        }
        return ans;
    } 
}

