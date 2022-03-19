package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password="Cydeo1990.";

        boolean isStrongPassword=isStrongPassword(password);

        System.out.println("isStrongPassword = " + isStrongPassword);

    }

    public static boolean isStrongPassword(String password){

        boolean r1=password.length()>=8&&!password.contains(" ");
        boolean r2=false;   // has upper case
        boolean r3=false;   //has lower case
        boolean r4=false;   //has special char
        boolean r5=false;   //has digit

        char[] ch=password.toCharArray();

        for (char each : ch) {
            if (Character.isUpperCase(each)){
                r2=true;
            }else if (Character.isLowerCase(each)) {
                r3=true;
            }else  if (!Character.isLetterOrDigit(each)){
                r4=true;
            }else if (Character.isDigit(each)) {
                r5=true;
            }

            if (r2 && r3 && r4 && r5){
                break;
            }
        }

       return r1&&r2&&r3&&r4&&r5;

    }

}
/* Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit



 */