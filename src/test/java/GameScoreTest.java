

import org.junit.Test;

import hangman.model.GameScore;
import hangman.model.OriginalScore;

import org.junit.Assert;

public class GameScoreTest {

    
    @Test
    public void originalScore00(){
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(0, 0);
        Assert.assertEquals(resultado, 100);

        resultado = game.calculateScore(100, 0);
        Assert.assertEquals(resultado, 100);
    }

    
    /**
     * Original Score Test
     * El score no puede ser negativo 
     * El score tiene que iniciar con 100 puntos
     * Si se falla una letra deberia restar 10
     * Si se acierta una letra deberia permanecer el score igual
     * Deberia fallar si se añade puntos cuando se acierta una letra
     * Deberia fallar si no se resta puntos cuando se falla una letra
     */

    @Test
    public void siFallaSeResta10Puntos(){



    }

     /**
     * Bonus Score Test
     * El score no puede ser negativo 
     * El score tiene que iniciar con 0 puntos
     * Si se falla una letra deberia restar 5
     * Si se acierta una letra deberia sumar 10
     * Deberia fallar si no se añade puntos cuando se acierta una letra
     * Deberia fallar si no se resta puntos cuando se falla una letra
     */

     /**
     * Power Score Test
     * El score no puede ser negativo 
     * El score tiene que iniciar con 0 puntos
     * Si se falla una letra deberia restar 8
     * Si se acierta una letra deberia sumar 5^(i)
     * El valor de i no puede ser 0 o menor a 0
     * si sobrepasa los 500 puntos, deberia qudarse en 500 puntos
     * Deberia fallar si no se añade puntos cuando se acierta una letra
     * Deberia fallar si no se resta puntos cuando se falla una letra
     */
}
