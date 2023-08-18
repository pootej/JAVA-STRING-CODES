/*reverse  sentence */
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str =s.nextLine();
        String []str1=str.split(" ");
        for(int i=str1.length-1;i>=0;i--){
            System.out.println(str1[i]);
        }
    }
}
