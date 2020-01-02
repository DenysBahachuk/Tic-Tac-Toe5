# Tic-Tac-Toe5
This is Tic-Tac-Toe, also known as noughts and crosses or Xs and Os. The game is designed for two players to play with each other.
# Introduction
Tic-tac-toe is a game played by two players on a 3x3 field. One of the players plays as 'X', and the other player is 'O'. 'X' plays first, then the 'O' side plays, and so on. 
The players write 'X' and 'O' on a 3x3 field.
The first player that writes 3 'X' or 3 'O' in a straight line (including diagonals) wins.
# Description
Suppose the bottom left cell has the coordinates (1, 1) and the top right cell has the coordinates (3, 3) like in this table:

(1, 3) (2, 3) (3, 3)

(1, 2) (2, 2) (3, 2)

(1, 1) (2, 1) (3, 1)

One of players moves as X, and then the other one moves as O. The game starts with empty cells and ends when someone wins or there is a draw.
The program works in the following way:

1. Outputs the 3x3 field with cells before the user's move.
2. Asks the user about his next move.
3. Then the user should input 2 numbers that represent the cell on which user wants to make his X or O. (9 symbols representing the field would be on the first line and these 2 numbers would be on the second line of the user input),
4. Outputs the table including the user's most recent move.
5. Prints the result:

    - "Draw" - when no side has a three in a row and the field has no empty cells;
    
    - "X wins" - when the field has three X in a row;
    
    - "O wins" - when the field has three O in a row.
