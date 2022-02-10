package day09_IfStatements;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection=1;


        if (selection==5){
            System.out.println("Hello, thank for your call");
        }else if (selection==2){
            System.out.println("Hola, gracias para llamar");
        }else if (selection==3){
            System.out.println("Merhaba, aradığınız için teşekkürler");
        }else if (selection==4){
            System.out.println("Privet, spasibo za vash zvonok");
        }else{
            System.out.println("Merci, pour votre appel");
        }
    }
}
