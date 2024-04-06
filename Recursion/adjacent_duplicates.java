import java.util.*;

public class adjacent_duplicates {
    public static String rremove(String s){
     if(s.length() <= 1) return s;
 
     int i = 0 ; 
      while(i<s.length() -1 && s.charAt(i) == s.charAt(i+1)) i++;
 
      if(i>0){
         return i+2 <= s.length() ? rremove(s.substring(i+2)) : "";
      }else{
         return s.charAt(0) + rremove(s.substring(1));
      }
     
     
 }
 public static void main(String[] args){
     String s = rremove("aaabababagbbabb");
     System.out.println(s);
  }
 }
 