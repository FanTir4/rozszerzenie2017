int przesunPion = 0;
int przesunPoziom = 0;
void setup()
{
  //wykonuje się jeden raz po uruchomieniu
  size(640, 480);
}

void draw()
{
  background (#21f50f);
  rect( 100+przesunPoziom, 100+przesunPion, 10, 20);
}
void keyPressed()
{

  if (key== 'w')
    przesunPion--;
  if (key== 's')
    przesunPion++;
  if (key== 'd')
    przesunPoziom++;
  if (key== 'a')
    przesunPoziom--;
  if (key==' ')
    przesunPoziom+=10;
}