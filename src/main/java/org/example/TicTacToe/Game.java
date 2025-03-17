package org.example.TicTacToe;

import com.sun.tools.javac.util.Pair;
import org.example.TicTacToe.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque<Player> players;
    Board gameboard;

    Game(){
        initializeGame();
    }

    public void initializeGame(){
        players=new LinkedList<>();
        PlayingPieceX crossPiece=new PlayingPieceX();
        Player player1=new Player("Player1",crossPiece);

        PlayingPieceO noughtsPiece=new PlayingPieceO();
        Player player2=new Player("Player2",noughtsPiece);

        players.add(player1);
        players.add(player2);

//        intialize the board
        gameboard=new Board(3);
    }

    public String startGame(){
        boolean noWinner=true;

        while(noWinner){
//            take out the player whose turn is
            Player playerTurn=players.removeFirst();

//            get the free space from the board
            gameboard.printBoard();
            List<Pair<Integer,Integer>> freeSpaces=gameboard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner=false;
                continue;
            }

//            read the user input
            System.out.println("Player: "+playerTurn.name+" Enter row and column: ");
            Scanner inputScanner=new Scanner(System.in);
            String s=inputScanner.nextLine();
            String[] values=s.split(",");
            int inputRow=Integer.valueOf(values[0]);
            int inputcol=Integer.valueOf(values[1]);

//            place the pieces
            boolean pieceAddedSuccessfully=gameboard.addPiece(inputRow,inputcol,playerTurn.playingPiece);
            if(!pieceAddedSuccessfully){
                System.out.println("incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner=isThereWinner(inputRow,inputcol,playerTurn.getPlayingPiece().getPlayingPieceType());
            if(winner){
                return playerTurn.name;
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int row, int col, PlayingPieceType pieceType){
        boolean rowMatch=true;
        boolean colMatch=true;
        boolean diagonalMatch=true;
        boolean antiDiagonalMatch=true;

        for(int i=0;i< gameboard.size;i++){
            if(gameboard.board[row][i]==null || gameboard.board[row][i].getPlayingPieceType()!=pieceType){
                rowMatch=false;
            }
        }

        for(int i=0;i< gameboard.size;i++){
            if(gameboard.board[i][col]==null || gameboard.board[i][col].getPlayingPieceType()!=pieceType){
                colMatch=false;
            }
        }

        for(int i=0,j=0;i<gameboard.size;i++,j++){
            if(gameboard.board[i][j]==null || gameboard.board[i][j].getPlayingPieceType()!=pieceType){
                diagonalMatch=false;
            }
        }

        for(int i=0,j=gameboard.size-1;i<gameboard.size;i++,j--){
            if(gameboard.board[i][j]==null || gameboard.board[i][j].getPlayingPieceType()!=pieceType){
                diagonalMatch=false;
            }
        }

        return rowMatch || colMatch ||diagonalMatch || antiDiagonalMatch;
    }
}
