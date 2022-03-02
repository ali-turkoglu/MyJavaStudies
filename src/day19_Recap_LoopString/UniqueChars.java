package day19_Recap_LoopString;

public class UniqueChars {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";//bdf

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0; //represents the frequency of the ch

            for (int j = 0; j < str.length(); j++) { //compares the characters thot outer loop picked,with each
                // character
                char each = str.charAt(j);
                if (ch == each) {
                    count++;

                }

            }

            if (count == 1) { //if the frequency of the chars is 1, then its unique
                result += ch;
            }
            // if(count !=1){
            //continue;
            //}
        }
        System.out.println(result);
    }
}
/*Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf



 */