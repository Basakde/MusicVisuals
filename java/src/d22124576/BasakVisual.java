package d22124576;

import example.AudioBandsVisual;
import example.WaveForm;
import ie.tudublin.*;

public class BasakVisual extends Visual { 
    waveForm wf;
    AudioBandsVisu abv;
    CircleVisual cvs;

    
    public void settings() {
            size(1200, 700,P3D);
            
    
            // Use this to make fullscreen
            // fullScreen();
    
            // Use this to make fullscreen and use P3D for 3D graphics
           //fullScreen(P3D, SPAN);
    }
    
    public void setup() {
            startMinim();
            colorMode(HSB);
            noCursor();

            //setFrameSize(256);
    
            // Call loadAudio to load an audio file to process
            loadAudio("heroplanet.mp3");
           // loadAudio("LittleFluffyClouds.mp3");
    
            // Call this instead to read audio from the microphone
            //startListening();
    
            //wf=new waveForm(this);
            //abv = new AudioBandsVisu(this);
        }
    
        public void keyPressed() {
            if (key == ' ') {
                getAudioPlayer().cue(0);
                getAudioPlayer().play();
            }
        }
        
        float smoothedBoxSize = 0;
        float cameraX = 0; 
        float angle = 0;
        float value=500;
        public void draw()
        {
            calculateAverageAmplitude();
            background(0);
            noFill();
            lights();

            for(int i=0;i<10;i++){
                stroke(map(getSmoothedAmplitude(), 0, 1, 0, 90)*i, 255, 255);
                camera(cameraX*i, i*800, value, // Position of the camera
         (i*10)/2, (i*10)/2, 0, // Point the camera towards the center of the sketch
         0, 1, 0);
               cameraX += i;
               
               if (cameraX > width) {
                cameraX = -width;
            }


             // Upward direction
            
            //cameraX += 1; // Adjust the speed of movement by changing the increment value
  
         // Reset the camera position when it moves out of the screen
           /*if (cameraX > width) {
            cameraX = -width; // Move the camera back to the left side of the screen
           }*/
 
           translate(0, 0, -250);
           float boxSize = 50 + (getAmplitude() * 100);
                
         //map(average, 0, 1, 100, 400); 
           smoothedBoxSize = lerp(smoothedBoxSize, boxSize, 0.2f);        
         
           rotateY(angle*10);
           rotateX(angle*5);
             //strokeWeight(1);
           sphere(smoothedBoxSize/2);            
           strokeWeight(5);
             
         //box(smoothedBoxSize);
         
         
            angle += 0.01f;
        
       
            camera(0, 0, 0, 0, 0, -1, 0, 1, 0);

    
  
        // Draw a box or any other 3D objects
        // Replace this with your 3D scene drawing code
        //box(100);
        
  
       // Increase or decrease the camera's x-coordinate
       
    }
    
}
} 
    
    