import java.util.Scanner;
import java.util.Arrays;
public class tictactoe{
    private static String board[][] = new String[3][3];
    public static String[][] makeBoard(){
        board = new String[3][3];
        board[0][0] = "_";
        board[0][1] = "_";
        board[0][2] = "_";
        board[1][0] = "_";
        board[1][1] = "_";
        board[1][2] = "_";
        board[2][0] = "_";
        board[2][1] = "_";
        board[2][2] = "_";
        return board;
    }
    public static String[][] resetBoard(){
        board = new String[3][3];
        board[0][0] = "_";
        board[0][1] = "_";
        board[0][2] = "_";
        board[1][0] = "_";
        board[1][1] = "_";
        board[1][2] = "_";
        board[2][0] = "_";
        board[2][1] = "_";
        board[2][2] = "_"; 
        return board;
    }
    public static int checkWin(){
        boolean win1 = false;
        boolean win2 = false;
        String winningPlayer = "none";
        if(board[0][0].equals("x") && board[0][1].equals("x") && board[0][2].equals("x")){
            win1 = true;
            winningPlayer = "x";
            return 1;
        }
        if(board[0][0].equals("x") && board[1][1].equals("x") && board[2][2].equals("x")){
            win1 = true;
            winningPlayer = "x";
            return 1;
        }
        if(board[1][0].equals("x") && board[1][1].equals("x") && board[1][2].equals("x")){
            win1 = true;
            winningPlayer = "x";
            return 1;
        }
        if(board[2][0].equals("x") && board[2][1].equals("x") && board[2][2].equals("x")){
            win1 = true;
            winningPlayer = "x";
            return 1;
        }
        if(board[2][0].equals("x") && board[1][1].equals("x") && board[0][2].equals("x")){
            win1 = true;
            winningPlayer = "x";
            return 1;
        }
        if(board[0][0].equals("x") && board[1][0].equals("x") && board[2][0].equals("x")){
            win1 = true;
            winningPlayer = "x";
            return 1;
        }
        if(board[1][0].equals("x") && board[1][1].equals("x") && board[2][1].equals("x")){
            win1 = true;
            winningPlayer = "x";
            return 1;
        }
        if(board[2][0].equals("x") && board[2][1].equals("x") && board[2][2].equals("x")){
            win1 = true;
            winningPlayer = "x";
            return 1;
        }
        if(board[0][0].equals("o") && board[0][1].equals("o") && board[0][2].equals("o")){
            win2 = true;
            winningPlayer = "o";
            return 2;
        }
        if(board[0][0].equals("o") && board[1][1].equals("o") && board[2][2].equals("o")){
            win2 = true;
            winningPlayer = "o";
            return 2;
        }
        if(board[1][0].equals("o") && board[1][1].equals("o") && board[1][2].equals("o")){
            win2 = true;
            winningPlayer = "o";
            return 2;
        }
        if(board[2][0].equals("o") && board[2][1].equals("o") && board[2][2].equals("o")){
            win2 = true;
            winningPlayer = "o";
            return 2;
        }
        if(board[2][0].equals("o") && board[1][1].equals("o") && board[0][2].equals("o")){
            win2 = true;
            winningPlayer = "o";
            return 2;
        }
        if(board[0][0].equals("o") && board[1][0].equals("o") && board[2][0].equals("o")){
            win2 = true;
            winningPlayer = "o";
            return 2;
        }
        if(board[0][1].equals("o") && board[1][1].equals("o") && board[2][1].equals("o")){
            win2 = true;
            winningPlayer = "o";
            return 2;
        }
        if(board[0][2].equals("o") && board[1][2].equals("o") && board[2][2].equals("o")){
            win2 = true;
            winningPlayer = "o";
            return 2;
        }
        else return 0;

    }
    public static int checkTile(int r, int c){
        if(board[r][c].equals("_")){
            return 1;
        }
        if(board[r][c].equals("x") || board[r][c].equals("o")){
            return 2;
        }
        return 0;
    }
    public static int checkTie(){
        int count = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(board[i][j].equals("x") || board[i][j].equals("o")){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean win = false;
        String winningPlayer = "none";
        String input2 = " ";
        String[][] board = tictactoe.makeBoard();
        int playercheck = 0;
        System.out.println(Arrays.deepToString(board)
        .replace("],","\n").replace(",","\t| ")
        .replaceAll("[\\[\\]]", " "));
        System.out.println("This is your board");
        System.out.println("Type help for help");
        System.out.println("Type stop to stop and reset board to reset the board");
        String input3 = " ";
        String input = " ";
        String player = "x";
        int temprow = 10;
        int tempcol = 10;
        while (win == false){
            if (playercheck%2 == 0){
                player = "x";
            }
            if (playercheck%2 != 0){
                player = "o";
            } 
            System.out.println("Player " + player + ", choose a ROW to place your tile");
            input = scan.nextLine();
            if (input.equalsIgnoreCase("help")){
                System.out.println("Here is a list of commands");
                System.out.println("Choose top, middle, or bottom to choose the desired row");
                System.out.println("stop: Stops the game and ends code");
                System.out.println("reset board: Resets the board but keeps the same player");
                System.out.println("switch player: switches whos turn it is");
                System.out.println("undo: undoes the last action and gives the turn back");
                System.out.println("show board: shows the current board");
                input = scan.nextLine();
            }
            if (input.equalsIgnoreCase("undo") || input2.equalsIgnoreCase("undo")){
                if (temprow == 10 || tempcol == 10){
                    System.out.println("There are no moves to undo!");
                }
                if (temprow <10 || tempcol < 10){
                    System.out.println("Undoing action\n......");
                    board[temprow][tempcol] = "_";
                    System.out.println(Arrays.deepToString(board)
                    .replace("],","\n").replace(",","\t| ")
                    .replaceAll("[\\[\\]]", " "));
                    System.out.println("Move Undone. Back to last player turn.");
                    playercheck--;
                }
            }
            if (input.equalsIgnoreCase("show board")){
                System.out.println(Arrays.deepToString(board)
                .replace("],","\n").replace(",","\t| ")
                .replaceAll("[\\[\\]]", " "));
                System.out.println("Here is the board so far.");
            }
            if (input.equalsIgnoreCase("top")){
                System.out.println("Left, Middle, or Right column?");
                input2 = scan.nextLine();
                if (input2.equalsIgnoreCase("left")){
                    if (tictactoe.checkTile(0, 0) == 1){
                        board[0][0] = player;
                        playercheck++;
                        System.out.println(Arrays.deepToString(board)
                        .replace("],","\n").replace(",","\t| ")
                        .replaceAll("[\\[\\]]", " ")); 
                        input = " ";
                        input2 = " ";
                        temprow = 0;
                        tempcol = 0;
                    }
                    else if (tictactoe.checkTile(0, 0) == 2){
                        System.out.println("That spot is already taken!");
                        input = " ";
                        input2 = " ";
                    }
                }
                if (input2.equalsIgnoreCase("middle")){
                    if (tictactoe.checkTile(0, 1) == 1){
                        board[0][1] = player;
                        playercheck++;
                        System.out.println(Arrays.deepToString(board)
                        .replace("],","\n").replace(",","\t| ")
                        .replaceAll("[\\[\\]]", " "));
                        input = " ";
                        input2 = " ";
                        temprow = 0;
                        tempcol = 1;
                    }
                    else if (tictactoe.checkTile(0, 1) == 2){
                        System.out.println("That spot is already taken!");
                        input = " ";
                        input2 = " ";
                        temprow = 0;
                        tempcol = 2;
                    }
                }
                if (input2.equalsIgnoreCase("right")){
                    if (tictactoe.checkTile(0, 2) == 1){
                        board[0][2] = player;
                        playercheck++;
                        System.out.println(Arrays.deepToString(board)
                        .replace("],","\n").replace(",","\t| ")
                        .replaceAll("[\\[\\]]", " "));
                        input = " ";
                        input2 = " ";
                        temprow = 0;
                        tempcol = 2;
                    }
                    else if (tictactoe.checkTile(0, 2) == 2){
                        System.out.println("That spot is already taken!");
                        input = " ";
                        input2 = " ";
                    }
                }
                else if(!input2.equalsIgnoreCase("left") && !input2.equalsIgnoreCase("middle") 
                && !input2.equalsIgnoreCase("right") && !input2.equalsIgnoreCase("stop") 
                && !input2.equalsIgnoreCase("switch player") && !input2.equalsIgnoreCase("reset board") 
                && !input2.equalsIgnoreCase(" ") && !input2.equalsIgnoreCase("undo") 
                && !input2.equalsIgnoreCase("show board")){
                    System.out.println("Not a valid response. Let's try it again");
                }
            }
            if (input.equalsIgnoreCase("middle")){
                System.out.println("Left, Middle, or Right column?");
                input2 = scan.nextLine();
                if (input2.equalsIgnoreCase("left")){
                    if (tictactoe.checkTile(1, 0) == 1){
                        board[1][0] = player;
                        playercheck++;
                        System.out.println(Arrays.deepToString(board)
                        .replace("],","\n").replace(",","\t| ")
                        .replaceAll("[\\[\\]]", " "));
                        input = " ";
                        input2 = " ";
                        temprow = 1;
                        tempcol = 0;
                    }
                    else if (tictactoe.checkTile(1, 0) == 2){
                        System.out.println("That spot is already taken!");
                        input = " ";
                        input2 = " ";
                    }
                }
                else if(!input2.equalsIgnoreCase("left") || !input2.equalsIgnoreCase("middle") || !input2.equalsIgnoreCase("right") || !input2.equalsIgnoreCase("stop") || !input2.equalsIgnoreCase("switch player") || !input2.equalsIgnoreCase("reset board")){
                    System.out.println("Not a valid response");
                }
                if (input2.equalsIgnoreCase("middle")){
                    if (tictactoe.checkTile(1, 1) == 1){
                        board[1][1] = player;
                        playercheck++;
                        System.out.println(Arrays.deepToString(board)
                        .replace("],","\n").replace(",","\t| ")
                        .replaceAll("[\\[\\]]", " "));
                        input = " ";
                        input2 = " ";
                        temprow = 1;
                        tempcol = 1;
                    }
                    else if (tictactoe.checkTile(1, 1) == 2){
                        System.out.println("That spot is already taken!");
                        input = " ";
                        input2 = " ";
                    }
                }
                if (input2.equalsIgnoreCase("right")){
                    if (tictactoe.checkTile(1, 2) == 1){
                        board[1][2] = player;
                        playercheck++;
                        System.out.println(Arrays.deepToString(board)
                        .replace("],","\n").replace(",","\t| ")
                        .replaceAll("[\\[\\]]", " ")); 
                        input = " ";
                        input2 = " ";
                        temprow = 1;
                        tempcol = 2;
                    }
                    else if (tictactoe.checkTile(1, 2) == 2){
                        System.out.println("That spot is already taken!");
                        input = " ";
                        input2 = " ";
                    }
                }
                else if(!input2.equalsIgnoreCase("left") && !input2.equalsIgnoreCase("middle") 
                && !input2.equalsIgnoreCase("right") && !input2.equalsIgnoreCase("stop") 
                && !input2.equalsIgnoreCase("switch player") && !input2.equalsIgnoreCase("reset board") 
                && !input2.equalsIgnoreCase(" ") && !input2.equalsIgnoreCase("undo") 
                && !input2.equalsIgnoreCase("show board")){
                    System.out.println("Not a valid response. Let's try it again");
                }
            }
            if (input.equalsIgnoreCase("bottom")){
                System.out.println("Left, Middle, or Right column?");
                input2 = scan.nextLine();
                if (input2.equalsIgnoreCase("left")){
                    if (tictactoe.checkTile(2, 0) == 1){
                        board[2][0] = player;
                        playercheck++;
                        System.out.println(Arrays.deepToString(board)
                        .replace("],","\n").replace(",","\t| ")
                        .replaceAll("[\\[\\]]", " ")); 
                        input = " ";
                        input2 = " ";
                        temprow = 2;
                        tempcol = 0;
                    }
                    else if (tictactoe.checkTile(2, 0) == 2){
                        System.out.println("That spot is already taken!");
                        input = " ";
                        input2 = " ";
                    }
                }
                if (input2.equalsIgnoreCase("middle")){
                    if (tictactoe.checkTile(2, 1) == 1){
                        board[2][1] = player;
                        playercheck++;
                        System.out.println(Arrays.deepToString(board)
                        .replace("],","\n").replace(",","\t| ")
                        .replaceAll("[\\[\\]]", " ")); 
                        input = " ";
                        input2 = " ";
                        temprow = 2;
                        tempcol = 1;
                    }
                    else if (tictactoe.checkTile(2, 1) == 2){
                        System.out.println("That spot is already taken!");
                        input = " ";
                        input2 = " ";
                    }
                }
                if (input2.equalsIgnoreCase("right")){
                    if (tictactoe.checkTile(2, 2) == 1){
                        board[2][2] = player;
                        playercheck++;
                        System.out.println(Arrays.deepToString(board)
                        .replace("],","\n").replace(",","\t| ")
                        .replaceAll("[\\[\\]]", " ")); 
                        input = " ";
                        input2 = " ";
                        temprow = 2;
                        tempcol = 2;
                    }
                    else if (tictactoe.checkTile(2, 2) == 2){
                        System.out.println("That spot is already taken!");
                        input = " ";
                        input2 = " ";
                    }
                }
                else if(!input2.equalsIgnoreCase("left") && !input2.equalsIgnoreCase("middle") 
                && !input2.equalsIgnoreCase("right") && !input2.equalsIgnoreCase("stop") 
                && !input2.equalsIgnoreCase("switch player") && !input2.equalsIgnoreCase("reset board") 
                && !input2.equalsIgnoreCase(" ") && !input2.equalsIgnoreCase("undo") 
                && !input2.equalsIgnoreCase("show board")){
                    System.out.println("Not a valid response. Let's try it again");
                }
            }
            if (input.equalsIgnoreCase("stop") || input2.equalsIgnoreCase("stop")){
                System.out.println("Stopping....");
                break;
            }
            if (input.equalsIgnoreCase("reset board") || input2.equalsIgnoreCase("reset board")){
                System.out.println("Reset Board. This is your board");
                board = resetBoard();
                System.out.println(Arrays.deepToString(board)
                .replace("],","\n").replace(",","\t| ")
                .replaceAll("[\\[\\]]", " "));
            }
            if (input.equalsIgnoreCase("switch player") || input2.equalsIgnoreCase("switch player")){
                playercheck++;
                System.out.println("Switched player!");
            }
            if (tictactoe.checkWin() == 1){
                System.out.println("Player X Wins!");
                board = tictactoe.resetBoard();
                System.out.println("Play again?");
                input3 = scan.nextLine();
                if(input3.equalsIgnoreCase("Yes")){
                    board = tictactoe.resetBoard();
                    System.out.println(Arrays.deepToString(board)
                    .replace("],","\n").replace(",","\t| ")
                    .replaceAll("[\\[\\]]", " "));
                }
                if(input3.equalsIgnoreCase("No")){
                    System.out.println("Ok Bye.");
                    break;
                }
            }
            if (tictactoe.checkWin() == 2){
                System.out.println("Player O Wins!");
                board = tictactoe.resetBoard();
                System.out.println("Play Again?");
                input3 = scan.nextLine();
                if(input3.equalsIgnoreCase("Yes")){
                    board = tictactoe.resetBoard();
                    System.out.println(Arrays.deepToString(board)
                    .replace("],","\n").replace(",","\t| ")
                    .replaceAll("[\\[\\]]", " "));
                }
                if(input3.equalsIgnoreCase("No")){
                    System.out.println("Ok Bye.");
                    break;
                }
            }
            if (tictactoe.checkTie() == 9){
                System.out.println("The game was a tie!");
                board = tictactoe.resetBoard();
                System.out.println("Play Again?");
                input3 = scan.nextLine();
                if(input3.equalsIgnoreCase("yes")){
                    board = tictactoe.resetBoard();
                    System.out.println(Arrays.deepToString(board)
                    .replace("],","\n").replace(",","\t| ")
                    .replaceAll("[\\[\\]]", " "));
                }
                if(input3.equalsIgnoreCase("no")){
                    System.out.println("Ok Bye.");
                    break;
                }
            }
            else if(!input.equalsIgnoreCase("left") && !input.equalsIgnoreCase("middle") 
            && !input.equalsIgnoreCase("right") && !input.equalsIgnoreCase("stop") 
            && !input.equalsIgnoreCase("switch player") && !input.equalsIgnoreCase("reset board") 
            && !input.equalsIgnoreCase(" ") && !input.equalsIgnoreCase("undo") 
            && !input.equalsIgnoreCase("show board")){
                System.out.println("Please give a valid response. You can type help if you are stuck.");
            }
        }
    }
}