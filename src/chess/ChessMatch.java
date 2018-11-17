package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch(){
		board = new Board (8,8);
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

}
