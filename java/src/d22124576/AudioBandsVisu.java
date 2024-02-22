package d22124576;

import processing.core.PApplet;

public class AudioBandsVisu {
    BasakVisual mv;

    public AudioBandsVisu(BasakVisual myVisual)
    {
        this.mv = myVisual; 
    }

    /*public AudioBandsVisual(BasakVisual basakVisual) {
        //TODO Auto-generated constructor stub
    }*/

    public void render()
    {
        float gap = mv.width / (float) mv.getBands().length;
        mv.noStroke();
        for(int i = 0 ; i < mv.getBands().length ; i ++)
        {
            mv.fill(PApplet.map(i, 0, mv.getBands().length, 255, 0), 255, 255);
            mv.rect(i * gap, mv.height, gap,-mv.getSmoothedBands()[i] * 0.2f); 
        }
    }

}
