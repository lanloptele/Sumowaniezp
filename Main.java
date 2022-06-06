import java.io.*;
import java.util.*;

public class Main {

public static void main(String args[]){
    try{
        File f = new File("file.txt");
        Scanner wczytaj = new Scanner(f);
        int suma = 0;
         while (wczytaj.hasNext()){
            int num = 0;
            try{
                num = Integer.parseInt(wczytaj.nextLine());
              }catch(NumberFormatException ne){
            }
            suma += num;
        }
        System.out.println("Suma: " + suma); 
    }catch(Exception err){ }
wczytaj.close();
}
}