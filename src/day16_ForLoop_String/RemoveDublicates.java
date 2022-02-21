package day16_ForLoop_String;

public class RemoveDublicates {
    public static void main(String[] args) {
        String word="AABBCCBC";
        String result="";

        for (int i = 0; i < word.length(); i++) {       //i<=7  == i<8


            if (!result.contains(""+word.charAt(i))){
                result+=word.charAt(i);             // ""+ yapmazsak compiler error verir. çünkü contains String i
                                                    //    kullanır. böylece char String e dönüşür.
            }

        }

        System.out.println(result);
    }
}
/*
Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding

 */