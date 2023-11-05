public class LongestCommonPrifixGFG {
    public static void main(String[] args) {
        LongestCommonPrifixGFG gg= new LongestCommonPrifixGFG();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.print("The longest common Prifix is : " + gg.longestCommonPrefix(input));
    }

    private String longestCommonPrefix(String[] arr) {
        int n = arr.length;
        String result = arr[0];
        for(int i = 1;i<n; i++){
            while(arr[i].indexOf(result) != 0){
                result = result.substring(0,result.length()-1);

                if(result.isEmpty()){
                    return "-1";
                }
            }
        }
        return result;
    }


}
