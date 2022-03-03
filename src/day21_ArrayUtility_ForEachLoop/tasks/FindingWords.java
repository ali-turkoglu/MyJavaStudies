package day21_ArrayUtility_ForEachLoop.tasks;

public class FindingWords {

    public static void main(String[] args) {

        String[] str={ "Write","a program","that"," can","return","the number of","appearances of","java","python",
                "anywhere","in the sentence"};

        int count=0;
        for (String each : str) {
            if (each.equals("java")||each.equals("python")){
                count++;
            }
        }

        System.out.println(count);
    }
}
/*    Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
        (similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

	*/