import java.util.Scanner;

public class Upper_Lower {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.next();
        System.out.println(Upper_Lower(s));
    }
   public static String Upper_Lower(String s) {
   String d="";
    int a;
    for (int i = 0; i < s.length(); i++) {
     a = s.charAt(i);
     if(a>=65 && a<91){
        a=a+32;
       d+= (char)a;}
else if(a>=97&& a<123){
     a=a-32;
       d+= (char)a;

}
else{
    d+=(char)a;
}61956
    }
   return d;
}

}
