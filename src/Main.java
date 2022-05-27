import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Primera parte
        int result  = sum(505, 60, 5);
        System.out.println(result);

        //Segunda parte
        Car camaro = new Car();
        camaro.addDoors();
        camaro.addDoors();
        System.out.println(camaro.doors);

    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

}

class Car{

    public int doors = 2 ;

    public void  addDoors(){
        this.doors++;
    }
}