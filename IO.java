import java.io.*;
import java.util.ArrayList;
public class IO {

        public static Object rPrime() throws IOException, ClassNotFoundException{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("PrimeNumbers.dat"));
            return input.readObject();
        }
    }

