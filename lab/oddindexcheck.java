//we need to print the elements of the array which are present array in odd position
public class oddindexcheck {
    public static void main(String[] args) {
        String a = "ABCDEFG";
        char[] b = a.toCharArray();
        int i;
        for (i = 0; i < b.length; i++) {
        if (i % 2 == 0) {
            System.out.println(" " + b[i]);
        }
    }}}
