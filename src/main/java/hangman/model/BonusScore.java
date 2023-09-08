package hangman.model;

public class BonusScore implements GameScore{
    
     /**
     * @pre Inicia con 0 puntos
     * @pos se acaba cuando el puntaje llega a 0
     * @param correctCount = Puntaje cuando se acierta una letra (+ 10 puntos)
     * @param IncorrectCount = Puntaje cuando no se acierta una letra  (- 5 puntos)
     * @throws 
     */
    public int calculateScore(int correctCount, int incorrectCount){
        
        if((correctCount * 10) < (incorrectCount * 5)){
            return 0;
        }
        else{
            return (correctCount * 10) - (incorrectCount * 5);
        }
        
    }
}
