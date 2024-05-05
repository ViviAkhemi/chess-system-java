package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
    // para percorrer as linhas
        for (int i = 0; i < pieces.length; i++) {
            //para imprimir os números
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces[i].length; j++) {
                printPiece(pieces[i][j]);
            }
            //imprimir próxima linha
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
    //para imprimir as linhas
    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("- ");
        }
        else {
            System.out.print(piece);
        }
    }
}

