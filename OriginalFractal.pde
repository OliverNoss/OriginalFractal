//Oliver Noss
void setup() {
	size(500,400);
	background(0);
	stroke(255);
	strokeWeight(2);
	noFill();
	rectMode(CENTER);
	smooth();
	noLoop();
}

void draw() {
	fractal(250, 200, 200, 250);
}
public void fractal(int x, int y, int l, int h)
{
	
	
	if (h > 5)
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