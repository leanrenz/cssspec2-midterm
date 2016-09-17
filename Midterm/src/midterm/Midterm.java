package midterm;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileReader;
public class Midterm {

 
    public static void main(String[] args) throws FileNotFoundException {
      Scanner sc = new Scanner(new FileReader("input.txt"));
      while(sc.hasNext()){
          System.out.println(sc.nextLine());
      }
    }
    
}
