package J04;

/**
 * @author sora
 * @create 2021-04-12 21:56
 */
public class J04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        for(int i = 0;i < matrix.length; i++ ){
            for(int j = 0;j < matrix[i].length; j++){
                if(target == matrix[i][j]) return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        J04 j04 = new J04();
        int b = 20;
        int[][] a = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(j04.findNumberIn2DArray(a,20));
    }
}
