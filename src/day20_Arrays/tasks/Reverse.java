package day20_Arrays.tasks;

public class Reverse {
    public static void main(String[] args) {

        String[] classmates={"Ali Tercan","Turan Kişi","Erol Kafa","Yasin Kırlı","Ömer Sarar","Fatih Bey","Ekrem " +
                "Meral"};

        for (int i = 0; i < classmates.length; i++) {

            String reversed="";
            for (int j = classmates[i].length()- 1; j >= 0; j--) {
                reversed+=classmates[i].charAt(j);
            }
            System.out.println(reversed);
        }

        }
    }


/*create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */