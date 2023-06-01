package NewClassAdded;

public class Transpose2DArray {
    static void transpose(int matrix[][], int n)
    {
        // code herefor
        for (int i=0; i<n; i++)
        {
            for(int j= i+1; j<n; j++)
            {
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
    }
    public static void main(String args[]){
        int mat[][] = {
                {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };
        int n=mat.length;
        System.out.print(n);
        transpose(mat,n);
    }
}
