package week13.encapsulation;

public class Db {

    private  String data;
    private int yint;

    public void insertData(String data,int yint){
        //this.data=data;  // we use this keyword only if our instance variable has same name with local variable
        //this.yint=yint;
        setData(data);
        setYint(yint);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }


}
