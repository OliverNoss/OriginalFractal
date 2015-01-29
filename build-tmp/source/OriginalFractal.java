import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup() {
	size(500,400);
	background(0);
	stroke(255);
	strokeWeight(2);
	noFill();
	rectMode(CENTER);
	smooth();
	noLoop();
}

public void draw() {
	fractal(250, 200, 200, 250);
}
public void fractal(int x, int y, int l, int h)
{
	
	
	if (h>5)
	{
		fractal(x+h/2,y+l/2,l/2,h/2);
		fractal(x+h/2,y-l/2,l/2,h/2);
		fractal(x-h/2,y+l/2,l/2,h/2);
		fractal(x-h/2,y-l/2,l/2,h/2);
		stroke(250,100,0,100);
		fill(0,100,250,100);
		ellipse(x, y, l, h);
		stroke(0,100,250,10);
		// rect(x, y, l, h);
		
		

	}
	else {
		stroke(250,100,0,100);
		fill(0,100,250,100);
		ellipse(x, y, h, l);
		stroke(0,100,250,10);
		// rect(x, y, l, h);
		
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
