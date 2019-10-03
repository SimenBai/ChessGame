package no.simenbai.Chess.Game.Enum;

public enum Pieces {
    KING {
        public String toString(){
            return "K";
        }
    },
    QUEEN{
        public String toString(){
            return "Q";
        }
    },
    ROOK{
        public String toString(){
            return "R";
        }
    },
    KNIGHT{
        public String toString(){
            return "N";
        }
    },
    BISHOP{
        public String toString(){
            return "B";
        }
    },
    PAWN{
        public String toString(){
            return "P";
        }
    },
    EMPTY{
        public String toString(){
            return "";
        }
    }
}
