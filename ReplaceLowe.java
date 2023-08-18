/*REPLACE UPPER WITH LOWER */
    public class ReplaceLowe {
        public static void main(String[] args) {
            String input = "Replace lower case letters with UPPER CASE letters";
            StringBuilder result = new StringBuilder();
    
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isLowerCase(c)) {
                    char upperCaseChar = Character.toUpperCase(c);
                    result.append(upperCaseChar);
                } else {
                    result.append(c);
                }
            }
    
            String modifiedString = result.toString();
            System.out.println(modifiedString);
        }
    }
    

