package algorithm;

public class Bubsort {
    public static void main(String[] args) {
        int[] arr={35,12,49,890,430};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
