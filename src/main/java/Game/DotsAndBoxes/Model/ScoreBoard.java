package Game.DotsAndBoxes.Model;


import java.util.Timer;
import java.util.TimerTask;

class Helper extends TimerTask
{
    //timer
    public static int i = 0;
    public void run()
    {
        System.out.println("Timer ran " + ++i);
        if(i == 4)
        {

        }
    }

}


public class ScoreBoard{
//    protected static Test obj;
    private int score;
    private Player player1;
    private Player player2;
    Timer timer = new Timer();
    TimerTask task = new Helper();
}
