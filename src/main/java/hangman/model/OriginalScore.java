package hangman.model;

public class OriginalScore implements GameScore{
    
    /**
     * @pre Inicia con 100 puntos
     * @pos se acaba cuando el puntaje llega a 0
     * @param correctCount = Puntaje cuando se acierta una letra
     * @param incorrectCount = Puntaje cuando no se acierta una letra
     * @throws
     */
    public int calculateScore(int correctCount, int incorrectCount){

        if(correctCount >= 0 && incorrectCount >= 0) {
            return 100 - (10 * incorrectCount);
        }
        else {
            return 0;
        }
    }
}
