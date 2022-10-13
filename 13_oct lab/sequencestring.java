//Write a Java program to find sequences of lowercase letters joined with a underscore


public class sequencestring {
    public static void main(String[] args) {

            System.out.println(validate("srikanta_biswas"));
            System.out.println(validate("SRI_kanta"));
        }
        public static String validate(String text) {
            if (text.matches("^[a-z]+_[a-z]+"))
                return " match!";
            else
                return "Not matched!";
        }
}
