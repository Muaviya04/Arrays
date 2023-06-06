public class Array2D {
    public static void main(String[] args) {
        int[][] matrixform = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matrixform);
        matrixmethod(matrixform);
        // Array2D matrix = new Array2D();
        // matrix matrixmethod(matrixform);
    }
        public static void matrixmethod(int[][] matrixform){
        for(int i=0;i<matrixform.length;i++){
            for (int j=0;j< matrixform[i].length;j++){
                System.out.print(matrixform[i][j]  + " ");
            }
            System.out.println();
    }
    }
}
