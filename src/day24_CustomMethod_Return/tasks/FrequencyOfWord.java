package day24_CustomMethod_Return.tasks;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word = "java";

        System.out.println(frequencyOfWord(sentence,word));


    }

    public static int frequencyOfWord(String sentence,String word){

        String[] arr=sentence.split(" ");
        int count=0;
        for (String each : arr) {
            if (each.toLowerCase().equals(word.toLowerCase())){
                count++;
            }
        }
        return count;
    }
}
/*create a method named frequencyOfWord that passes two parameters: string sentence and String word,
then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3


 */