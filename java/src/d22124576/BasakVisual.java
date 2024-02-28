package d22124576;

import example.AudioBandsVisual;
import example.WaveForm;
import ie.tudublin.*;

public class BasakVisual extends Visual { 
    //waveForm wf;
    //AudioBandsVisu abv;
    CircleVisual cvs;

    
    public void settings() {
           size(1200, 700);
           
            
    
            // Use this to make fullscreen
            //fullScreen();
    
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

            getAudioPlayer().cue(0);
            getAudioPlayer().play();
           // loadAudio("LittleFluffyClouds.mp3");
    
            // Call this instead to read audio from the microphone
            //startListening();
    
            //wf=new waveForm(this);
            //abv = new AudioBandsVisu(this);
        }
    
        /*public void keyPressed() {
            if (key == ' ') {
                getAudioPlayer().cue(0);
                getAudioPlayer().play();
            }
        }*/
        
        float smoothedBoxSize = 0;
        //float cameraX = 0; 
        float angle = 0;
        float cameraZ = -1000; // Initial camera Z position
        float targetZ = -200; // Target camera Z position
         // Target camera Z position
        float initialBoxZ = -500; // Initial Z position for the cubes
        float boxZ = initialBoxZ;
      
        float boxSpeed = 0.04f; // Speed of movement for the boxes
        boolean reverseDirection = false;

        //float value=500;
        public void draw()
        {
            /*calculateAverageAmplitude();
            background(0);
            noFill();
            lights();*/
            /*for(int j=0; j<5; j++)
            {

                for(int i=0;i<3;i++)
            {
                
                stroke(map(getSmoothedAmplitude(), 0, 1, 0, 300)*i, 255, 255);
                camera(cameraX, i*200, 50, // Position of the camera
         (i*10), (i*10), 0, // Point the camera towards the center of the sketch
         0, 1, 0);
               cameraX += 0.5;
               
               if (cameraX > width) {
                cameraX = -width;
            }

 
           translate(0, 0, -250);
           float boxSize = 50 + (getAmplitude() * 100);
                
           //map(average, 0, 1, 100, 400); 
           smoothedBoxSize = lerp(smoothedBoxSize, boxSize, 0.3f);        
         
           rotateY(angle*2);
           rotateX(angle*2);
           //rotateZ(angle*2);
            //strokeWeight(1);
           //box(smoothedBoxSize/2);
           sphere(10);
           //sphere(smoothedBoxSize)     ;       
           strokeWeight(2);

           //translate(250,250);
           box(smoothedBoxSize);
           //translate(50,50);
           box(smoothedBoxSize*1.5f);
           //translate(100, 100);
           box(smoothedBoxSize*2.5f);
           //cube(smoothedBoxSize);
         
         
            angle += 0.03f;
        
       
            camera(0, 0, 0, 0, 0, -1, 0, 1, 0);

    
  
        // Draw a box or any other 3D objects
        // Replace this with your 3D scene drawing code
        //box(100);
        
  
       // Increase or decrease the camera's x-coordinate

                
       
            }


            
            }*/



        calculateAverageAmplitude();
        background(0);
        noFill();
        lights();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        
        camera(0, 0, cameraZ, 0, 0,-1, 0, 1, 0);
        translate(0, 0, -250);
               
        float boxSize = 50 + (getAmplitude() * 300);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize = lerp(smoothedBoxSize, boxSize, 0.05f);        
        
        //angle +=0.0;

        /*if (cameraZ < targetZ) {
            cameraZ += 0.5f; // Adjust the speed as needed
          }*/

        // Update the Z position of the cubes to move them closer to the camera
        /*if (!reverseDirection) {
            boxZ -= boxSpeed; // Move the boxes forward
          } else {
            boxZ += boxSpeed; // Move the boxes backward
          }*/
        
          // Check if the boxes have reached the edges of the screen
        /*   if (boxZ >= width / 2 - 50 || boxZ <= -width / 2 + 50) {
            reverseDirection = !reverseDirection; // Reverse the direction if the boxes run out of the screen
        }*/

        int val1=20;
        int val2=20;
        
        //for x coordinates
        for (int i =1; i<=10; i++){
            pushMatrix();
            translate(val1, 0,0);
            rotateY(angle);
            rotateX(angle);
            box(smoothedBoxSize*i);
            popMatrix();
            val1=-val1;

        }
      
        //for y coordinates

        for (int i =1; i<=10; i++){
            pushMatrix();
            translate(0, val2,0);
            rotateY(angle);
            rotateX(angle);
            box(smoothedBoxSize*i);
            popMatrix();
            val2=-val2;

        }

        /*pushMatrix();
        translate(-50, 0, 0);  
        rotateY(angle);
        rotateX(angle);
        box(smoothedBoxSize);
            //strokeWeight(1);
            //sphere(smoothedBoxSize);
        popMatrix();
        pushMatrix();
        translate(50, 0, 0);
        rotateY(angle);
        rotateX(angle);
        strokeWeight(2); 
        box(smoothedBoxSize);
        popMatrix();

        pushMatrix();
        translate(0, 50, 0);
        rotateY(angle);
        rotateX(angle);
        strokeWeight(2); 
        box(smoothedBoxSize);
        popMatrix();

        pushMatrix();
        translate(+0, -50, 0);
        rotateY(angle);
        rotateX(angle);
        strokeWeight(2); 
        box(smoothedBoxSize);
        popMatrix();*/



        angle += 0.01; 

            
            
        }
    
    }
 
    
    