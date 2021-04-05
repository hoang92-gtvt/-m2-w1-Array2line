public class Array2line {
    public static void main(String[] args) {
        int [][] arr1= {
                {1,8,3},
                {4,5,6},
                {8,9,0}
        };
        int k= getMax(arr1);
        System.out.println(k);
        k=getMin(arr1);
        System.out.println(k);
        k=getSum(arr1, 1);
        System.out.println(k);
        k=getSum2(arr1);
        System.out.println(k);
        k=getSum3(arr1);
        System.out.println(k);
    }

    public static int getMax(int[][]arr){
        int max = arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }

        return max;
    }
    public static int getMin(int[][]arr){
        int min = arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]< min){
                    min=arr[i][j];
                }
            }
        }

        return min;
    }
    public static int getSum(int[][] arr, int colume){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if( j== colume){
                    sum +=arr[i][j];
                }
            }
        }

        return sum;
    }
    public static int getSum2(int[][] arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if( j== i){
                    sum +=arr[i][j];
                }
            }
        }

        return sum;
    }
    public static int getSum3(int[][] arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if( j== arr.length-1-i){
                    sum +=arr[i][j];
                }
            }
        }

        return sum;
    }

}
