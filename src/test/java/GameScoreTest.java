

import hangman.model.BonusScore;
import hangman.model.PowerScore;
import org.junit.Test;

import hangman.model.GameScore;
import hangman.model.OriginalScore;

import org.junit.Assert;

public class GameScoreTest {

    /**
     * Original Score Test
     */

    @Test
    public void siFallaSeResta10Puntos(){
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(0, 1);
        Assert.assertEquals(resultado, 90);

    }

    @Test
    public void siSeAciertaSeQuedaIgualElScore(){
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(100, 0);
        Assert.assertEquals(resultado, 100);

    }

    @Test
    public void elScoreTieneQueIniciarEn100(){
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(0, 0);
        Assert.assertEquals(resultado, 100);

    }

    @Test
    public void deberiaFallarSiSeAñadePuntosCuandoSeAciertaUnaLetra(){
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(1, 0);
        Assert.assertNotEquals(resultado, 110);

    }

    @Test
    public void deberiaFallarSiNoSeResta10PuntosCuandoSeFallaUnaLetra(){
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(0, 1);
        Assert.assertNotEquals(resultado, 100);

    }

    /**
    * Bonus Score Test
    */

    @Test
    public void elScoreTieneQueIniciarCon0Puntos(){
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(0, 0);
        Assert.assertEquals(resultado, 0);

    }

    @Test
    public void siSeAciertaUnaLetraDeberiaSumar10(){
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(1, 0);
        Assert.assertEquals(resultado, 10);

    }

    @Test
    public void siSeFallaUnaLetraDeberiaRestar5(){
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(1, 1);
        Assert.assertEquals(resultado, 5);

    }

    @Test
    public void elPuntajeNoDeberiaSerNegativo(){
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(0, 1);
        Assert.assertEquals(resultado, 0);

    }

    @Test
    public void siElPuntajeDeAciertoEsMenorAlIncorrectoDeberiaSer0ElPuntaje(){
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(1, 3);
        Assert.assertEquals(resultado, 0);

    }

    @Test
    public void deberiaFallarSiNoSeAñade10PuntosCuandoSeAciertaUnaLetra(){
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(1, 0);
        Assert.assertNotEquals(resultado, 0);

    }

    @Test
    public void deberiaFallarSiNoSeResta5PuntosCuandoSeFallaUnaLetra(){
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(1, 1);
        Assert.assertNotEquals(resultado, 10);

    }
     /**
     * Power Score Test<
     */

     @Test
     public void deberiaFallarSiNoSeResta8PuntosCuandoSeFallaUnaLetra(){
         GameScore game = new PowerScore();
         int resultado = game.calculateScore(2, 1);
         Assert.assertNotEquals(resultado, 25);

     }

    @Test
    public void deberiaFallarSiNoSeAñadePuntosCuandoSeAciertaUnaLetra(){
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(1, 0);
        Assert.assertNotEquals(resultado, 0);

    }

    @Test
    public void siSobrepasaLos500PuntosDeberiaQuedarseEn500Puntos(){
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(4, 0);
        Assert.assertEquals(resultado, 500);

    }

    @Test
    public void siSeAciertaUnaLetraDeberiaSumar5(){
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(3, 0);
        Assert.assertEquals(resultado, 125);

    }

    @Test
    public void elScoreNoPuedeSerNegativo(){
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(1, 2);
        Assert.assertEquals(resultado, 0);

    }

    @Test
    public void elScoreIniciaCon0Puntos(){
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(0, 0);
        Assert.assertEquals(resultado, 0);

    }

    @Test
    public void siSeFallaUnaLetraDeberiaRestar8(){
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(3, 1);
        Assert.assertEquals(resultado, 117);

    }
}
