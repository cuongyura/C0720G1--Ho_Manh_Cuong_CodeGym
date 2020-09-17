package __8_cleancode_and_refactoring.bai_tap._refactoring;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int myScore1 , int myScore2) {
        String strScore = "";
        int tempScore = 0;
        if (myScore1 == myScore2)
        {
            switch (myScore1)
            {
                case 0:
                    strScore = "Love-All";
                    break;
                case 1:
                    strScore = "Fifteen-All";
                    break;
                case 2:
                    strScore = "Thirty-All";
                    break;
                case 3:
                    strScore = "Forty-All";
                    break;
                default:
                    strScore = "Deuce";
                    break;

            }
        }
        else {
            boolean isCheck = myScore1 >= 4 || myScore2 >= 4;
            if (isCheck)
            {
                int minusResult = myScore1 - myScore2;
                strScore = getString(minusResult);
            }
            else
            {
                for (int index = 1; index <3; index ++)
                {
                    if (index ==1) tempScore = myScore1;
                    else { strScore+="-"; tempScore = myScore2;}
                    switch(tempScore)
                    {
                        case 0:
                            strScore+="Love";
                            break;
                        case 1:
                            strScore+="Fifteen";
                            break;
                        case 2:
                            strScore+="Thirty";
                            break;
                        case 3:
                            strScore+="Forty";
                            break;
                    }
                }
            }
        }
        return strScore;
    }

    private static String getString(int minusResult) {
        String strScore;
        if (minusResult == 1) strScore ="Advantage player1";
        else if (minusResult ==-1) strScore ="Advantage player2";
        else if (minusResult>=2) strScore = "Win for player1";
        else strScore ="Win for player2";
        return strScore;
    }
}
