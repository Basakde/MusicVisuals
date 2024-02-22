package d22124576;

import ie.tudublin.Visual;

public class CircleVisual extends Visual {
    boolean twocubes = false;

    public void settings()
    {
        size(800, 800, P3D);
        println("CWD: " + System.getProperty("user.dir"));
        //fullScreen(P3D, SPAN);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }
        if (key == '1')
        {
            twocubes = ! twocubes;

        }
    }

    
}
