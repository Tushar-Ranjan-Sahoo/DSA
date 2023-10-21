import java.util.*;


public class LongestSubarraywithgivenSumK {
    public static int getLongestSubarray(int[] a, long k){
        int n = a.length;
        Map<Long,Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0 ;
        for(int i = 0 ;i<n;i++){
            sum += a[i];

            if(sum == k ){
                maxLen = Math.max(maxLen,i+1);

            }
             long rem = sum -k;
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);

            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);

            }
        }
        return maxLen;

    }

    public static void main(String[] args) {
        int[] a = {1,45,64,57,2,448,81,78465,4894168,818741,46514};
        long k = 818742;
        int len = getLongestSubarray(a,k);
        System.out.println("the length of Longest subarray is: "+len);
    }
}
