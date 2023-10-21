import java.util.ArrayList;

public class MoveAllZerosTUF {

    public static int[] moverZeros(int n,int[] arr){

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0 ; i<n;i++){
            if(arr[i] !=0)
                temp.add(arr[i]);

        }
        int nz = temp.size();

        for(int i =0 ; i< nz;i++){
            arr[i] = temp.get(i);

        }
        for(int i = nz;i<n;i++){
            arr[i] = 0;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,1,50,1,0,15,04,10,0,4,0,0};
        int n = arr.length;
        int[] ans = moverZeros(n,arr);
        for(int i = 0 ; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
}
