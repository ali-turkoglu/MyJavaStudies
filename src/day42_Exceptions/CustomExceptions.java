package day42_Exceptions;

class FadyException extends RuntimeException{ // Custom unchecked exception

    public FadyException(){
        super("It is time for short break");
    }
    public FadyException(String message){
        super(message);
    }
}

class NoBreakException extends Exception{ // Custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args) {

        throw new FadyException();

        // throw new NoBreakException();  --> It is checked exception

    }


}
