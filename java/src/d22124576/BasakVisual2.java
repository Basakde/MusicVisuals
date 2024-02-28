package d22124576;

import ie.tudublin.*;


public class BasakVisual2 extends Visual {
    CircleVisual cvs;

    
    public void settings() {
        fullScreen();
        
        //size(1200, 600);
           
    }

    public void setup() {
        startMinim();
        
        colorMode(HSB);
        background(0);
        //noCursor();

        //setFrameSize(256);

        // Call loadAudio to load an audio file to process
        loadAudio("LittleFluffyClouds.mp3");

        getAudioPlayer().cue(0);
        getAudioPlayer().play();
      
    }

    
    float smoothedcircleSize = 50;
    float lineSize=4;
    
    //float value=500;
    public void draw() {
        calculateAverageAmplitude();
        
       
        //lights();
        //stroke(map(getSmoothedAmplitude(), 0, 1, 0, 50), 100, 100);

        fill(50, 100, 700);
        //strokeWeight(3);
        
        //pushMatrix();

        
        //camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        //translate(0, 0, -250);
        
        float circleSize = 200 + (getAmplitude() * 300);
        smoothedcircleSize = lerp(smoothedcircleSize, circleSize, 0.05f);

        
        // Draw a circle in the middle of the screen
        //float circleSize = 100; // Set the size of the circle
        //fill(255, 255, 0); // Set fill color to white
        
        //lights();
        ellipse(width / 2, height / 2, circleSize,circleSize); // Draw the circle at the center of the screen
        //popMatrix();
        strokeWeight(lineSize);
       
        /*line(width/2,300-height/2, width/2, height/2-100);
        line(width/2, height/2+100, width/2, height);
        line(500-(width/2+150), height/2, width- (width/2+150), height/2);
        line(width/2, height/2+100, width/2, height);*/
        stroke(map(getSmoothedAmplitude(), 0, 60, 0, 300), 100, 300);
        line(width/2, 150, width/2, height/2-circleSize/2);
        stroke(map(getSmoothedAmplitude(), 0, 60, 0, 300), 100, 300);
        line(width/2, height/2 + circleSize/2, width/2, height-150);
        stroke(map(getSmoothedAmplitude(), 0, 60, 0, 300), 100, 300);
        line(400, height/2, (width/2-circleSize/2), height/2);
        stroke(map(getSmoothedAmplitude(), 0, 60, 0, 300), 100, 300);
        line(width/2+circleSize/2, height/2, width-400, height/2);

        
        

    
    }
    
    
}
