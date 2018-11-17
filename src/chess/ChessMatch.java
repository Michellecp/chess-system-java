package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch(){
		board = new Board (8,8);
		initialSetup();
	}
	
	public chessPiece[][] gePieces(){
		chessPiece[][]  mat = new chessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++){
			for(int j=0; j<board.getColumns(); j++){
				mat[i][j] = (chessPiece) board.pieces(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup(){
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
	}

}
