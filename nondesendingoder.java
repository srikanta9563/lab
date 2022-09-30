//find common elements
import java.util.ArrayList;

public class nondesendingoder {
    public static void main(String[] args) {
        ArrayList<Integer>common=new ArrayList<Integer>();
        int a1[]={2,3,4};
        int a2[]={2,4,8};
        int x=0,y=0;
        while (x<a1.length&&y<a2.length){
            if (a1[x]==a2[y]) {
                common.add(a1[x]);
                x++;
                y++;

            }
            else if (a1[x]<a2[y])
                x++;
            else
                y++;}
        System.out.println("common elements are- "+common);
    }
}
