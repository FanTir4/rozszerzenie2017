int red, green, blue;


void setup()
{
  size(640, 640);
  frameRate(5);
}

void draw()
{
  background( red, green, blue);
  fill(random(256));
  ellipse(320, 320, 640, 640);
}

void keyPressed()
{
  if (key=='')
  {  
    red=(int)random(256);
    green=(int)random(256);
    blue=(int)random(256);
  }
}