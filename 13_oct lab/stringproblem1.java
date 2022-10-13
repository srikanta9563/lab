import java.util.StringTokenizer;

public class stringproblem1 {
    public static void main(String[] args) {
        String obj="Welcome to Java World";
        System.out.println("5th position index is- " +obj.charAt(5));//getting 5 th position character
       String obj2="welcome";
       System.out.println(obj.compareToIgnoreCase(obj2));//ignoring case
        System.out.println(obj.concat("let us known"));//Concatenates “- Let us learn” to the above string and display it.
        System.out.println(obj.indexOf("a"));//Returns the position of the first occurrence of character ‘a’ and display it.
        System.out.println(obj.replace('a','e'));
        System.out.println(obj.substring(4,10));//Returns string between 4 th position and 10 th position and display it
        System.out.println(obj2.toLowerCase());

        StringBuffer a= new StringBuffer("This is string buffer ");//initialization of string buffer
        System.out.println(a.append("This is a simple program")); //adding string
        System.out.println(a.insert(21," object")); //inserting
        System.out.println(a.replace(14,20," Builder"));//replace
        System.out.println(a.reverse());//reverse the string

        StringTokenizer t=new StringTokenizer("C:\\IBM||DB2||program\\db2copy1.exe");
        System.out.println("Drive : "+t.nextToken("\\"));
        System.out.println("Folders - "+t.nextToken("\\"));
        System.out.println("File - "+ t.nextToken("\\"));
}}
