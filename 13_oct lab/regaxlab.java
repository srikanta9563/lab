//Write a class called MyRegex which will contain a string pattern. You need to write a regular
//expression and assign it to the pattern such that it can be used to validate an IP address.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class regaxlab{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ip address: ");
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));

        }}}
class MyRegex {
    String str = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";//creating regular expression
    String pattern = str + "." +  str + "." +  str + "." + str;
}
