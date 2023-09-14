package hangman.model;

public class BonusScore implements GameScore{
    
     /**
     * @pre Inicia con 0 puntos
     * @pos se acaba cuando el puntaje llega a 0
     * @param correctCount = Puntaje cuando se acierta una letra (+ 10 puntos)
     * @param incorrectCount = Puntaje cuando no se acierta una letra  (- 5 puntos)
     * @throws "NEGATIVE_PARAMETERS" = Los parametros son negativos
     */
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {

        int result = 0;
        if(correctCount >= 0 && incorrectCount >= 0) {
            if ((correctCount * 10) >= (incorrectCount * 5)) {

                result = (correctCount * 10) - (incorrectCount * 5);
            }
        }
        else{
            throw new GameScoreException(GameScoreException.NEGATIVE_PARAMETERS);
        }
        return result;
    }
}
