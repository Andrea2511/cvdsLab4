

import hangman.model.*;
import org.junit.Test;

import org.junit.Assert;

public class GameScoreTest {

    /**
     * Original Score Test
     */

    @Test
    public void siFallaSeResta10Puntos() throws GameScoreException {
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(0, 1);
        Assert.assertEquals(resultado, 90);

    }

    @Test
    public void siSeAciertaSeQuedaIgualElScore() throws GameScoreException{
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(100, 0);
        Assert.assertEquals(resultado, 100);

    }

    @Test
    public void elScoreTieneQueIniciarEn100() throws GameScoreException{
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(0, 0);
        Assert.assertEquals(resultado, 100);

    }

    @Test
    public void deberiaFallarSiSeAñadePuntosCuandoSeAciertaUnaLetra() throws GameScoreException{
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(1, 0);
        Assert.assertNotEquals(resultado, 110);

    }

    @Test
    public void deberiaFallarSiNoSeResta10PuntosCuandoSeFallaUnaLetra() throws GameScoreException{
        GameScore game = new OriginalScore();
        int resultado = game.calculateScore(0, 1);
        Assert.assertNotEquals(resultado, 100);

    }

    /**
    * Bonus Score Test
    */

    @Test
    public void elScoreTieneQueIniciarCon0Puntos() throws GameScoreException{
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(0, 0);
        Assert.assertEquals(resultado, 0);

    }

    @Test
    public void siSeAciertaUnaLetraDeberiaSumar10() throws GameScoreException{
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(1, 0);
        Assert.assertEquals(resultado, 10);

    }

    @Test
    public void siSeFallaUnaLetraDeberiaRestar5() throws GameScoreException{
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(1, 1);
        Assert.assertEquals(resultado, 5);

    }

    @Test
    public void elPuntajeNoDeberiaSerNegativo() throws GameScoreException{
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(0, 1);
        Assert.assertEquals(resultado, 0);

    }

    @Test
    public void siElPuntajeDeAciertoEsMenorAlIncorrectoDeberiaSer0ElPuntaje() throws GameScoreException{
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(1, 3);
        Assert.assertEquals(resultado, 0);

    }

    @Test
    public void deberiaFallarSiNoSeAñade10PuntosCuandoSeAciertaUnaLetra() throws GameScoreException{
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(1, 0);
        Assert.assertNotEquals(resultado, 0);

    }

    @Test
    public void deberiaFallarSiNoSeResta5PuntosCuandoSeFallaUnaLetra() throws GameScoreException{
        GameScore game = new BonusScore();
        int resultado = game.calculateScore(1, 1);
        Assert.assertNotEquals(resultado, 10);

    }

    @Test
    public void deberiaSalirUnaExcepcionPorParametrosNegativos() throws GameScoreException{

        try {
            GameScore game = new BonusScore();
            int resultado = game.calculateScore(-3, -1);
        }
        catch (GameScoreException e){

            Assert.assertEquals(e.getMessage(),GameScoreException.NEGATIVE_PARAMETERS);
        }


    }

     /**
     * Power Score Test<
     */

     @Test
     public void deberiaFallarSiNoSeResta8PuntosCuandoSeFallaUnaLetra() throws GameScoreException{
         GameScore game = new PowerScore();
         int resultado = game.calculateScore(2, 1);
         Assert.assertNotEquals(resultado, 25);

     }

    @Test
    public void deberiaFallarSiNoSeAñadePuntosCuandoSeAciertaUnaLetra() throws GameScoreException{
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(1, 0);
        Assert.assertNotEquals(resultado, 0);

    }

    @Test
    public void siSobrepasaLos500PuntosDeberiaQuedarseEn500Puntos() throws GameScoreException{
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(4, 0);
        Assert.assertEquals(resultado, 500);

    }

    @Test
    public void siSeAciertaUnaLetraDeberiaSumar5() throws GameScoreException{
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(3, 0);
        Assert.assertEquals(resultado, 125);

    }

    @Test
    public void elScoreNoPuedeSerNegativo() throws GameScoreException{
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(1, 2);
        Assert.assertEquals(resultado, 0);

    }

    @Test
    public void elScoreIniciaCon0Puntos() throws GameScoreException{
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(0, 0);
        Assert.assertEquals(resultado, 0);

    }

    @Test
    public void siSeFallaUnaLetraDeberiaRestar8() throws GameScoreException{
        GameScore game = new PowerScore();
        int resultado = game.calculateScore(3, 1);
        Assert.assertEquals(resultado, 117);

    }

    @Test
    public void deberiaSalirUnaExcepcion() throws GameScoreException{

         try {
             GameScore game = new PowerScore();
             int resultado = game.calculateScore(-3, 1);
         }
         catch (GameScoreException e){

             Assert.assertEquals(e.getMessage(),GameScoreException.NEGATIVE_PARAMETERS);
         }


    }
}
