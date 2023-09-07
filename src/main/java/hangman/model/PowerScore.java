package hangman.model;

public class PowerScore implements GameScore{
    
     /**
     * @pre Inicia con 0 puntos
     * @pos se acaba cuando el puntaje llega a 0, el puntaje maximo es 500 
     * @param correctCount = Puntaje cuando se acierta una letra (la i-esima letra correcta bonifica 5 ^ (i))
     * @param IncorrectCount = Puntaje cuando no se acierta una letra (- 8 puntos)
     * @throws 
     */
    public int calculateScore(int correctCount, int incorrectCount){
        return 0;
    }
}
