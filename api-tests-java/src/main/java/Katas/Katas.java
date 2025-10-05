package Katas;
import java.util.*;
public class Katas {
  public static String reverse(String s){ return new StringBuilder(s).reverse().toString(); }
  public static boolean isPalindrome(String s){
    String t = s.replaceAll("\\s+","").toLowerCase();
    return new StringBuilder(t).reverse().toString().equals(t);
  }
  public static long countVowels(String s){
    return s.toLowerCase().chars().filter("aeiouáéíóú".chars()::anyMatch).count();
  }
  public static <T> List<T> unique(List<T> in){ return new ArrayList<>(new LinkedHashSet<>(in)); }
  public static Map<String,Long> frequencies(List<String> in){
    Map<String,Long> m=new LinkedHashMap<>(); for(String s:in) m.put(s,m.getOrDefault(s,0L)+1); return m;
  }
}
