import java.util.*;

public class Main {
    public static void main(String[] args) {
      String s="a";
      int vowels=0;
      int con=0;
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
          vowels++;
        }
        else{
          con++;
        }
      }
      System.out.println("Vowels:"+vowels);
      System.out.println("Consonants:"+con);
        }
        }
      
