package day27_WrapperClasses.tasks;

public class Upper_LowerEqual {

    public static void main(String[] args) {

        String str="JAVA javaa";
        int upperCaseNum=0;
        int lowerCaseNum=0;
        boolean equals=false;

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);


            if (Character.isUpperCase(each)){
                upperCaseNum++;
            }else if (Character.isLowerCase(each)){
                lowerCaseNum++;
            }

        }
        if (upperCaseNum==lowerCaseNum){
            equals=true;
        }
        System.out.println("Are lowerCase and UpperCase equals="+equals);
    }


}
