import java.util.Arrays;

public class checkarray {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,7,8};
        int find=50;
      boolean check=false;
      for(int element:arr){
          if(element==find){
              check=true;
              break;
          }
      }
      if(check){
          System.out.println(find+ " is true");
      }
      else {
          System.out.println(find + " is false");
      }
    }
}
