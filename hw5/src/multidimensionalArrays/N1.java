package multidimensionalArrays;

/**
 * Создать программу для раскраски шахматной доски с помощью цикла.  Создать двумерный массив String'ов 8х8.
 * С помощью циклов задать элементам циклам значения B(Black) или W(White).
 * Результат работы программы:   W  B  W  B  W  B  W  B    B  W  B  W  B  W  B  W    W  B  W  B  W  B  W  B    B  W  B  W  B  W  B  W    W  B  W  B  W  B  W  B    B  W  B  W  B  W  B  W    W  B  W  B  W  B  W  B    B  W  B  W  B  W  B  W
 */
public class N1 {
    public static void main(String[] args) {
        String[][] board = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = i % 2 == j % 2 ? "W " : "B ";
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
