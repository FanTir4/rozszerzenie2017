ArrayList<Kuleczka> kuleczki = new ArrayList<Kuleczka>();
void setup()
{
  size(640, 480);
  for (int i=0; i<100; i++)
  {
    kuleczki.add(new Kuleczka());
  }
}


void draw()
{
  background(51);
  for (int i=0; i<100; i++)
  {
    Kuleczka k = kuleczki.get(i);
    k.rysuj();
  }
}