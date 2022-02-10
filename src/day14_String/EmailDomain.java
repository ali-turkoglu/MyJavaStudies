package day14_String;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "Cydeo.School@gmail.com";
        System.out.println("email = " + email);

        String domain=email.substring(email.indexOf("@")+1 ,email.lastIndexOf(".") );
        System.out.println("domain = " + domain);




        System.out.println("------------------------------");


        String str1 = "Java is fun, Java is cool, I love Java\n";
        System.out.println("str1 = " + str1);

        String str2=str1.substring(0,str1.indexOf(","));
        System.out.println("str2 = " + str2);

        String str3=str1.substring(str1.indexOf(", ")+2,str1.lastIndexOf(", "));
        System.out.println("str3 = " + str3);

        String str4=str1.substring(str1.lastIndexOf("I"));
        System.out.println("str4 = " + str4);


/*

        //             0123456789
        //
        String s1 = str1.substring(0, 10+1) ;  // Java is fun

        int beg = str1.indexOf(" J") + 1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg, end );  //Java is cool


        String s3 = str1.substring(  str1.lastIndexOf("I")  );

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

*/

    }
}
