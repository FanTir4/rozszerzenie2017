class Kuleczka
{
  int x, y;
  int r;
  Kuleczka()
  {
    x=(int)random(0, width);
    y=(int)random(0, height);
    r=(int)random(5, 20);

  }
  void rysuj()
  {
  ellipse( x, y, 2*r, 2*r);
  
  }
}