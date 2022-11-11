//PROBLEM-1
//Write a Java program to read first 3 lines from a file
import java.io.*;
public class FileLaB {
    public static void main(String a[]){ //main method
    BufferedReader br = null;
    String A = null; //string variable
    try
    {
        //creating busffer reader object
        LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("D:test.txt")));
        while (((A = reader.readLine()) != null) && reader.getLineNumber() <= 3) //while loop for condition
                {
                    System.out.println(A); //pointing data
                }
                reader.close(); //closing
            }
            catch (FileNotFoundException e)
            {
                System.err.println("File not found");
            }
            catch (IOException e)
            {
                System.err.println("Unable to read the file.");
            }
        }
    }

