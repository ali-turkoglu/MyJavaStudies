package week12;

public class Value {

   int parameter=0;
   boolean calledMethod=false;
   boolean callConstructor=false;

   public Value(){}  // consturctor with no parameter

   public Value(int parameter){  // constructor with single parameter
       this.parameter=parameter;
   }

   public void setValue(int parameter){  //one parameter method and is void
       this.parameter=parameter;
       calledMethod=true;
   }

   public boolean wasModified(){
    return calledMethod;
   }

   public int getValue(){
     return this.parameter=0;
   }

    public String toString() {
        return "Value{" +
                "parameter=" + parameter +
                ", calledMethod=" + calledMethod +
                ", callConstructor=" + callConstructor +
                '}';
    }
}
/*Write a class definition of a class named 'Value' with the following:

a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows: if setVal has ever been called,
    it getVal returns the last value passed to setVal.
    Otherwise if the "single int parameter" constructor was used to create the object,
    getVal returns the value passed to that constructor. Otherwise getVal returns 0.

 */