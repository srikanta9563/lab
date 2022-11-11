//Write a Java program to find the longest word in a text file
import java.util.Scanner;
import java.io.*;
public class FileLab2 {
    public static void main(String [ ] args) throws FileNotFoundException
        {
            new FileLab2().findLongestWords(); //calling longest method
        }

        public String findLongestWords() throws FileNotFoundException //method for long word
        {
            String longest_word="";//string type variable to Store the longest word
            String current; // string type variable to store the current word for the comparing
            Scanner sc = new Scanner(new File("D:test.txt")); //typing input of a file path

            while (sc.hasNext()) //chechking condition
            {
                current = sc.next();
                if (current.length() > longest_word.length()) //logic if current word is bigger than the previous worfd then current word
                {
                    longest_word = current;
                }

            }
            System.out.println("Longest WOrd- " +longest_word); //printing result
            return longest_word;
        }
    }

