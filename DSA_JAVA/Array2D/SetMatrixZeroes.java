package Array2D;
// If found zero =>make its corresponding row and column whole with zeroes
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };
    // N*M
        int x = 1; // Tracks if 1st row needs to be zeroed
        int y = 1; // Tracks if 1st col needs to be zeroed
        int n = a.length;
        int m = a[0].length;

        // 1. Check if 1st row has any zeros
        for(int j = 0; j < m; j++){
            if(a[0][j] == 0){
                x = 0;
                break;
            }
        }

        // 2. Check if 1st column has any zeros
        for(int i = 0; i < n; i++){
            if(a[i][0] == 0){
                y = 0;
                break;
            }
        }

        // 3. Use 1st row and 1st col to mark zeros for inner matrix
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(a[i][j] == 0){
                    a[i][0] = 0;
                    a[0][j] = 0;
                }
            }
        }

        // 4. Update columns based on 1st row flags
        for(int j = 1; j < m; j++){
            if(a[0][j] == 0){
                for(int i = 1; i < n; i++){
                    a[i][j] = 0;
                }
            }
        }

        // 5. Update rows based on 1st col flags
        for(int i = 1; i < n; i++){
            if(a[i][0] == 0){
                for(int j = 1; j < m; j++){
                    a[i][j] = 0;
                }
            }
        }

        // 6. Update 1st row if needed
        if(x == 0){
            for(int j = 0; j < m; j++){
                a[0][j] = 0;
            }
        }

        // 7. Update 1st column if needed
        if(y == 0){
            for(int i = 0; i < n; i++){
                a[i][0] = 0;
            }
        }

        // Print Matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
