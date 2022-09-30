//a java program to  find all pairs of elements in an array whose sum is equal to specified number
public class pairrarrays {
    public static void main(String[] args) {
        int[]arr={3,4,5,6,7,8,9};
        int n=14;
        findpairs(arr,n);

    }
    private static void findpairs(int []arr,int n){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println(arr[i]+"+"+arr[j]+"="+n);
                }
            }
        }

    }
}
