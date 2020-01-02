package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lines = 3;
        int columns = 3;
        char[][] gameField = new char[lines][columns];

        System.out.println("---------");
        for (int i = 0; i < lines; i++){
            System.out.print("|" + " ");
            for (int j = 0; j < columns; j++){
                gameField[i][j] = ' ';
                System.out.print (gameField[i][j] + " ");
            }
            System.out.print ("|" + "\n");
        }
        System.out.println("---------");

        Scanner scanner = new Scanner(System.in);

        String result = "";

        int counter = 1;
        int coordinate1 = 0;
        int coordinate2 = 0;
        int countEmpty = 0;

        boolean is1DiagonalX = false;
        boolean is2DiagonalX = false;
        boolean is1DiagonalO = false;
        boolean is2DiagonalO = false;
        boolean isRowX = false;
        boolean isRowO = false;
        boolean isColumnX = false;
        boolean isColumnO = false;

        while (result.equals("")) {
            System.out.print("Enter the coordinates: ");

            try {
                String s1 = scanner.next();
                coordinate1 = Integer.parseInt(s1);
                String s2 = scanner.next();
                coordinate2 = Integer.parseInt(s2);
                if (gameField[gameField.length - coordinate2][coordinate1 - 1] == 'X' || gameField[gameField.length - coordinate2][coordinate1 - 1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (counter % 2 == 0) {
                    gameField[gameField.length - coordinate2][coordinate1 - 1] = 'O';
                    counter++;
                } else {
                    gameField[gameField.length - coordinate2][coordinate1 - 1] = 'X';
                    counter++;
                }

                System.out.println("---------");
                for (int i = 0; i < lines; i++) {
                    System.out.print("|" + " ");
                    for (int j = 0; j < columns; j++) {
                        System.out.print(gameField[i][j] + " ");
                    }
                    System.out.print("|" + "\n");
                }
                System.out.println("---------");

            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
            }

            for (int i = 0; i < lines; i++) {
                if (gameField[i][0] == 'X' && gameField[i][1] == 'X' && gameField[i][2] == 'X') {
                    isRowX = true;
                } else if (gameField[i][0] == 'O' && gameField[i][1] == 'O' && gameField[i][2] == 'O') {
                    isRowO = true;
                } else if (gameField[0][i] == 'X' && gameField[1][i] == 'X' && gameField[2][i] == 'X') {
                    isColumnX = true;
                } else if (gameField[0][i] == 'O' && gameField[1][i] == 'O' && gameField[2][i] == 'O') {
                    isColumnO = true;
                }
            }

            if (gameField[0][0] == 'O' && gameField[1][1] == 'O' && gameField[2][2] == 'O') {
                is1DiagonalO = true;
            }
            else if (gameField[0][0] == 'X' && gameField[1][1] == 'X' && gameField[2][2] == 'X') {
                is1DiagonalX = true;
            }
            else if (gameField[0][2] == 'O' && gameField[1][1] == 'O' && gameField[2][0] == 'O') {
                is2DiagonalO = true;
            }
            else if (gameField[0][2] == 'X' && gameField[1][1] == 'X' && gameField[2][0] == 'X') {
                is2DiagonalX = true;
            }

            for (int i = 0; i < lines; i++){
                for (int j = 0; j < columns; j++){
                    if (gameField[i][j] == ' '){
                        countEmpty++;
                    }
                }
            }

            if (isRowX || isColumnX || is1DiagonalX || is2DiagonalX) {
                result = "X wins";
            } else if (isRowO || isColumnO || is1DiagonalO || is2DiagonalO) {
                result = "O wins";
            }
            if(result.equals("") && countEmpty == 0) {
                result = "Draw";
            }
            countEmpty = 0;
        }
        System.out.println(result);
    }
}
