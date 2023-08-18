/*REVERSE EACH WORD IN STRING */
public class ReverseWord {
    public static void main(String[] args) {
    	String a = "HOWW UH DOING";

    String[] words = a.split(" ");

    for (int i = 0; i < words.length; i++) {
        String word = words[i];
        String rev = "";

        for (int j = word.length() - 1; j >= 0; j--) {

            rev =rev+ word.charAt(j);
        }

        System.out.print(rev + " ");
    }


        

    }
}
