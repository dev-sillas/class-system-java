package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSteup();
	
	}
	public ChessPiece[][] getPiece(){
		ChessPiece[][] mat= new ChessPiece[board.getRow()][board.getColumn()];
		for(int i=0; i<board.getRow();i++) {
			for(int j=0; j<board.getColumn();j++) {
				mat[i][j]=(ChessPiece)board.piece(i,j);
			}
		}
		return mat;
	}
	private void initialSteup() {
		board.placePiece(new Rook(board, Color.WHILE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHILE), new Position(7,4));

	}
	}

