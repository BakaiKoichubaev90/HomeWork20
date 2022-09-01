import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Car car = new Car();
       try{
           car.drive();
           throw new IOException();
       }catch (Exception e){

           car.close();
       }
    }
}
