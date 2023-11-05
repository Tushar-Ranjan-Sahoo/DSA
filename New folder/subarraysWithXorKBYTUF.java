import java.util.HashMap;
import java.util.Map;

public class subarraysWithXorKBYTUF {
    public static int subarraysWithXorK(int[] arr,int k ){
        int n = arr.length;
        int xr = 0 ;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(xr,1);
        int count = 0;
        for(int i = 0 ; i<n;i++){
            xr=xr^arr[i];
            int x= xr^k;

            if(map.containsKey(x)){
                count += map.get(x);

            }
            if(map.containsKey(xr)){
                map.put(xr,map.get(xr)+1);

            }
            else{
                map.put(xr,1);

            }

        }
        return count;

    }

    public static void main(String[] args) {
       int[] arr= {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK( arr,k);
        System.out.println("the number of subarrays eith xor k is : "+ans);
    }
}
