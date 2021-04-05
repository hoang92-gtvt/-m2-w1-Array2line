public class Array2line {
    public static void main(String[] args) {
        int [][] arr1= {
                {1,8,3},
                {4,5,6},
        };
        int k= getMax(arr1);
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
}
