package hangman.model;

public class BonusScore implements GameScore{
    
     /**
     * @pre Inicia con 0 puntos
     * @pos se acaba cuando el puntaje llega a 0
     * @param correctCount = Puntaje cuando se acierta una letra (+ 10 puntos)
     * @param incorrectCount = Puntaje cuando no se acierta una letra  (- 5 puntos)
     */
    public int calculateScore(int correctCount, int incorrectCount){

        int result = 0;
        if(correctCount >= 0 && incorrectCount >= 0) {
            if ((correctCount * 10) >= (incorrectCount * 5)) {

                result = (correctCount * 10) - (incorrectCount * 5);
            }
        }
        return result;
    }
}
