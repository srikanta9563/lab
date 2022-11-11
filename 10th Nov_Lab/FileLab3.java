//PROBLEM-3
//WAJP to store text file content line by line into an array
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;
public class FileLab3 { //main class
    public static void main(String []args)throws Exception{
    ArrayList<String>a=new ArrayList<>(); //taking a new string type array
    BufferedReader b=new BufferedReader(new FileReader("D:test.txt")); //creating a object String builder
    String x= b.readLine(); //storing line
    int i=0;
            while ((x!=null)&&(i<10)){a.add(x); //checking whether any line left
                x= b.readLine();
                i++;}

        System.out.println(a); //printing array
            b.close();


}}






