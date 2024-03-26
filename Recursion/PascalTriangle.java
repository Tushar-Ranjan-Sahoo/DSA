import java.util.ArrayList;

public class PascalTriangle {

    static final int MOD = 1000000007;
     
    ArrayList<Long> nThRowPascal(int n){
        n--;

        if (n == 0) {
            ArrayList<Long> base = new ArrayList<>();
            base.add(1L);
            return base;
        }

        ArrayList<Long> prev = nThRowPascal(n);
        ArrayList<Long> curr = new ArrayList<>();
        
        curr.add(1L);
        for (int i = 0; i < prev.size() - 1; i++) {
            curr.add((prev.get(i) + prev.get(i + 1)) % MOD);
        }
        curr.add(1L); 
        
        return curr;

    }

}
