package hangman.model;

public class GameScoreException extends Exception{
    public static final String NEGATIVE_PARAMETERS = "Los parametros son negativos";

    public GameScoreException(String mensaje){
        super(mensaje);
    }

}
