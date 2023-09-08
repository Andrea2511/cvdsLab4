package hangman.model;

public class OriginalScore implements GameScore{
    
    /**
     * @pre Inicia con 100 puntos
     * @pos se acaba cuando el puntaje llega a 0
     * @param correctCount = Puntaje cuando se acierta una letra
     * @param IncorrectCount = Puntaje cuando no se acierta una letra
     * @throws CORRECT_COUNT_WITH_BONNIFICATION, INCORRECT_COUNT_WITHOUT_BONNIFICATION
     */
    public int calculateScore(int correctCount, int incorrectCount){
        return 100 - (10 * incorrectCount);
    }
}
