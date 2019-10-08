package no.simenbai.Chess.Game.Datatypes;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Piece {
    public enum PieceColor {
        BLACK ("black"),
        WHITE ("white"),
        EMPTY ("empty");

        public final String color;

        PieceColor(String color){
            this.color = color;
        }

        @Override
        public String toString() {
            return color;
        }
    }

    public enum PieceType {
        KING("K", "king.png"),

        QUEEN("Q", "queen.png"),

        ROOK("R", "rook.png"),

        KNIGHT("N", "knight.png"),

        BISHOP("B", "bishop.png"),

        PAWN("P", "pawn.png"),

        EMPTY("", "");

        private final String characterRepresentation;
        private final String imageLocation;

        PieceType(String characterRepresentation, String imageLocation) {
            this.characterRepresentation = characterRepresentation;
            this.imageLocation = imageLocation;
        }

        @Override
        public String toString() {
            return this.characterRepresentation;
        }

        public String getImageLocation() {
            return this.imageLocation;
        }
    }

    private PieceType pieceType;
    private PieceColor pieceColor;

    public Piece(PieceType pieceType, PieceColor pieceColor) {
        this.pieceType = pieceType;
        this.pieceColor = pieceColor;
    }

    public BufferedImage getImage() {
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(
                    new File("D:\\Projects\\Chess\\ChessGame\\resources\\" +
                            this.pieceColor.toString().toLowerCase() + "-" +
                            this.pieceType.getImageLocation()
                    )
            );
        } catch (IOException ignored) {
        }
        return myPicture;
    }

    public String getCharacter(){
        return this.pieceType.toString();
    }


}
