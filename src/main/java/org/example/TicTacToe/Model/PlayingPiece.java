package org.example.TicTacToe.Model;

public class PlayingPiece {
    PlayingPieceType playingPieceType;
    public PlayingPiece(PlayingPieceType playingPieceType){
        this.playingPieceType=playingPieceType;
    }
    public PlayingPieceType getPlayingPieceType(){
        return playingPieceType;
    }
}
