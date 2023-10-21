import java.util.HashMap;
import java.util.Map;

public class MajorElement {

    public static int majorElement(int []arr){
        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ;i<n;i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value +1);

        }
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue()>(n/2)){
                return it.getKey();

            }
        }
        return -1;

    }
    public static void main(String args[]){
        int[] arr = {1,1,5,1,5,2,5,2,4,4,7,44,3,41,3,1};
        int ans = majorElement(arr);
        System.out.println("the major element is: " + ans);
    }
}
