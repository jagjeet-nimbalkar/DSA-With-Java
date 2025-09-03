public class spiral {
    public static void spiralPrint(int martix[][]) {
        
        int startRow = 0;
        int endRow = martix.length - 1;
        int startCol = 0;
        int endCol = martix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(martix[startCol][j] + " ");
            }
            // RightSide
            for (int i = startRow + 1; i <= endCol; i++) {
                System.out.print(martix[i][endCol] + " ");
            }
            // downSide
            for (int j = endCol - 1; j >= startRow; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(martix[endRow][j] + " ");
            }
            // leftside
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(martix[i][startCol] + " ");

            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int martix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        spiralPrint(martix);

    }
}
