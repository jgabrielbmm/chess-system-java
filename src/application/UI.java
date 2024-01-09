package application;

import chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces){
        for(int row = 0; row < pieces.length; row++){
            System.out.print((8-row) + " ");
            for (int collumn = 0; collumn < pieces.length; collumn++){
                printPiece(pieces[row][collumn]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece piece){
        if(piece == null){
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
