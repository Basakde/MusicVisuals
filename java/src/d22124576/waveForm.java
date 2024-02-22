package d22124576;


import processing.core.PApplet;

public class waveForm {
    BasakVisual mv;
    float cy = 0;

    public waveForm(BasakVisual myVisual)
    {
        this.mv = myVisual;
        cy = this.mv.height / 2;
    }

    /*public WaveForm(BasakVisual basakVisual) {
        //TODO Auto-generated constructor stub
    }*/

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(
                PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            mv.line(i, cy, i, cy + cy * mv.getAudioBuffer().get(i));
        }
    }
    
}
