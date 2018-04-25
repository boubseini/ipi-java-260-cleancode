public class BowlingGame {

    private int score;
    private int rolls[] = new int[21]; //le nombre de  lancer
    private int currentRoll = 0;// partie courante



   
     public int score() {
          int score = 0;
    	  int frameIndex = 0;
    	   for (int frame = 0; frame < 10; frame++) {
    	       if (Strike(frameIndex)) {
    	        score += 10 + bonusStrike(frameIndex);
    	        frameIndex++;
    	    }  else if (Spare(frameIndex)) {
    	        score += 10 + bonusSpare(frameIndex);
    	        frameIndex += 2;
    	      } else {
    	        score += sumOfBallsInFrame(frameIndex);
    	        frameIndex += 2;
    	      }
    	    }
    	    return score;
    	  }
    	  
    	  private int sumOfBallsInFrame(int frameIndex) {
      	    return rolls[frameIndex] + rolls[frameIndex+1];
      	  }


    	  private boolean Strike(int frameIndex) {
    	    return rolls[frameIndex] == 10;
    	  }
    	  
    	
    	  private int bonusStrike(int frameIndex) {
    	    return rolls[frameIndex+1] + rolls[frameIndex+2];
    	  }

    	 
    	  private boolean Spare(int Indexframe) {
    	        return rolls[Indexframe] +
    	               rolls[Indexframe + 1] == 10;
    	      }
    	  private int bonusSpare(int frameIndex) {
      	    return rolls[frameIndex+2];
      	  }


       public void roll(int numberPins) {
        score += numberPins;
        rolls[currentRoll++] = numberPins;

       }
    
    



}
