package week10;

public class WrapperClassExamples {

    public static void main(String[] args) {

        int i1=100;

        Integer i2=i1; // changing primitive datatype to object class, autoboxing

     Integer n1=300;

     int n2 =n1;  // unboxing, from object to primitive

        Long i3=(long)i1;  // explicit example

        String str="1234";
        int num=Integer.parseInt(str);
        System.out.println(num+1); //124

        String price="$27.16";
        price =price.substring(1);
        double priceInDouble=Double.parseDouble(price);
        System.out.println(priceInDouble);

        // difference between Integer.parseInt() and Integer.valueOf()
        //                        int                    Integer

        double number1=Double.parseDouble(price); //primitive in p si
        Double number2=Double.valueOf(price); // object in value si

        System.out.println("---------------------------------------------------");

        char ch='a';
        boolean isDigit=Character.isDigit(ch); // false
        boolean isLetter=Character.isLetter(ch) ;// true
        boolean isSpecialChar=!Character.isLetterOrDigit(ch); // false

        System.out.println("isSpecialChar = " + isSpecialChar);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isDigit = " + isDigit);

        System.out.println("--------------------------------------------------");

        String str2="a1b2c3";
        int sumOfDigits=0;
        for (int each:str2.toCharArray()){
            if(Character.isDigit(each)){
                sumOfDigits+=Integer.parseInt(each+"");
            }
        }
        System.out.println("sumOfDigits = " + sumOfDigits);

        System.out.println("---------------------------------------------------");

        String str3="abcde1234=)'''0987AM:C";

        String letters="";
        String upperCaseLetters="";
        String lowerCaseLetters="";
        String digits="";
        String specialChars="";

        for (char each:str3.toCharArray()){     // primitive data type
            if (Character.isDigit(each)){       // auto-boxing
                digits+=each;
            }else if (Character.isLetter(each)){
                letters+=each;
                if (Character.isLowerCase(each)){
                    lowerCaseLetters+=each;
                }else {
                    upperCaseLetters+=each;
                }
            }else{
                specialChars+=each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("upperCaseLetters = " + upperCaseLetters);
        System.out.println("lowerCaseLetters = " + lowerCaseLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);


    }
}
