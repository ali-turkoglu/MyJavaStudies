package day21_ArrayUtility_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String [] words={"java programming","Cydeo School","Wooden Spoon","Early Birds","Angry Birds"};

        for (String each : words) {
            System.out.println(""+each.charAt(0)+each.charAt(each.length()-1)); //first and last char of elements
        }

    }
}
