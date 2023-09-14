package hangman.model;
import java.lang.Math.*;

public class PowerScore implements GameScore{
    
     /**
     * @pre Inicia con 0 puntos
     * @pos se acaba cuando el puntaje llega a 0, el puntaje maximo es 500 
     * @param correctCount = Puntaje cuando se acierta una letra (la i-esima letra correcta bonifica 5 ^ (i))
     * @param incorrectCount = Puntaje cuando no se acierta una letra (- 8 puntos)
     * @throws "NEGATIVE_PARAMETERS" = Los parametros son negativos
     */
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{

        int result = 0;
        if(correctCount > 0 && incorrectCount >= 0) {
            if (((int) Math.pow(5, correctCount) - (8 * incorrectCount)) > 500) {

                result = 500;

            } else if ((int) Math.pow(5, correctCount) > 8 * incorrectCount) {

                result = (int) Math.pow(5, correctCount) - 8 * incorrectCount;

            }
        }
        else{

            throw new GameScoreException(GameScoreException.NEGATIVE_PARAMETERS);
        }

        return result;
    }
}
