/*public class teacher {
    String designation= "Teachher";
    String collagename="JIS";
    void work(){
        System.out.println("teaching");
    }
}
class iittecher extends teacher{
    String mainsubject="MECHINE";

    public static void main(String[] args) {
        iittecher iit=new iittecher();
        System.out.println(iit.collagename);
        System.out.println(iit.designation);
        System.out.println(iit.mainsubject);
        iit.work();
    }
}*/

 class Frodo extends Hobbit {
 public static void main(String[] args) {
        Short myGold = 7;
         System.out.println(countGold(myGold, 6));
         }}
 class Hobbit {
 static int countGold(int x, int y) { return x + y; }
 }