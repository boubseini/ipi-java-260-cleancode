import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class BowlingGameTest {

    BowlingGame game = new BowlingGame();

    @Test
    public void queDesGoutieresDonne0Points() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void uneSeuleQuille(){
        game.roll(1);
        rollMany(19, 0);
        assertEquals(1, game.score());
    }

    @Test
    public void bonusDuSpare(){
        game.roll(6);
        game.roll(4);
        game.roll(5);
        rollMany(17, 0);
        assertEquals(20, game.score());
    }
    
    @Test
    public void bonusDuStrike()  {
        game.roll(10);
        game.roll(3);
        game.roll(5);
        rollMany(16, 0);
        assertEquals(26, game.score());
    }
    
    
    private void rollMany(int numberRolls, int numberPins) {
    	
        for (int i = 0; i < numberRolls; i++) {
        
            game.roll(numberPins);
        }
    }
    
    public void queDesStriks(){
        rollMany(12,10);
        assertEquals(300, game.score());
      }

  
    
}
