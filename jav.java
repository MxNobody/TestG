
import javax.crypto.KEM;

class A{
    private int x=1;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
        
    }


    public static void main(String[] args) {    

        A a = new A();
        System.out.println(a.getX());
        a.setX(6);
        System.out.println(a.getX());
        

    }

}

