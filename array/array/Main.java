////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5,0};
//
//
//
////        //insertion in a position
////        int position=0;
////        int value=67;
////        for(int i=arr.length-1;i>position;i--){
////            arr[i]=arr[i-1];
////
////        }
////        arr[position]=value;
//
//
//
//
////        deletion in a array
////        int position=0;
////        for(int i=position;i< arr.length-1;i++){
////            arr[i]=arr[i+1];
////        }
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }
//
//    }
//}
//
//import java.util.Arrays;
//
//public class ArrayRotation {
//
//    static void reverse(int[] arr, int l, int r) {
//        while (l < r) {
//            int temp = arr[l];
//            arr[l++] = arr[r];
//            arr[r--] = temp;
//        }
//    }
//
//    static void leftRotate(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//        if (k == 0) return;
//        reverse(arr, 0, k - 1);
//        reverse(arr, k, n - 1);
//        reverse(arr, 0, n - 1);
//    }
//
//    static void rightRotate(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//        if (k == 0) return;
//        reverse(arr, 0, n - 1);
//        reverse(arr, 0, k - 1);
//        reverse(arr, k, n - 1);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//
//        System.out.println("Original:     " + Arrays.toString(arr));
//
//        int[] left = arr.clone();
//        leftRotate(left, 2);
//        System.out.println("Left  by 2:   " + Arrays.toString(left));
//
//        int[] right = arr.clone();
//        rightRotate(right, 2);
//        System.out.println("Right by 2:   " + Arrays.toString(right));
//    }
//}
//        **Output:**
//        ```
//Original:     [1, 2, 3, 4, 5]
//Left  by 2:   [3, 4, 5, 1, 2]
//Right by 2:   [4, 5, 1, 2, 3]

li