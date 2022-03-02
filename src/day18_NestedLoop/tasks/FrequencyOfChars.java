package day18_NestedLoop.tasks;

public class FrequencyOfChars {

    public static void main(String[] args) {

        String str = "aabcccd";
        String str2 = "";
        char ch;

        for (int i = 0; i < str.length(); i++) { //string deki her karakter için

            ch = str.charAt(i);
            int count=0;

            for (int j = 0; j < str.length(); j++) {  // her karakterin sıklığını bulmak için

                char each=str.charAt(j);
                if(ch==each) {
                    count++;
                }
            }

            if (str2.contains(""+ch)) {
                continue;
            }
            str2+=ch;
            str2+=count;
        }
        System.out.println(str2);

    }
}
/*Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters


 */