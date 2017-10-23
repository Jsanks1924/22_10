/*
Write a program that finds the num- ber of prime numbers that are less than or
equal to 10, 100, 1,000, 10,000, 100,000, 1,000,000, 10,000,000, 100,000,000, 1,000,000,000,
and 10,000,000,000. Your program should read the data from PrimeNumbers.dat.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main( String Args[]){
    Long test = 10000l;
    loadPrime();
    System.out.println(output(test));

    }




        public static void loadPrime() {
            try {
                Coll.setPrimeList((ArrayList<Long>) IO.rPrime());
            } catch (IOException e) {
                System.out.print("Fail to open/read PrimeNumbers.dat file.");
            } catch (ClassNotFoundException e) {
            }
        }

        public static boolean isPrime(long n, ArrayList<Long> dbList) {
            boolean prime = true;
            if (!(dbList.isEmpty()&&(int)n==2)) {
                for (Long primeNumber : dbList) {
                    if (n % primeNumber == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            return prime;
        }



        public static ArrayList<Long> output(Long i) {
            int count = 0;
            ArrayList<Long> output = new ArrayList();

            for (Long o:Coll.getPrimeList()) {
                count++;
            }
            System.out.println("The count of prime numbers is " + count);
            return Coll.getPrimeList();
        }}









