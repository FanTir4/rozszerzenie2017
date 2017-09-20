size(640, 200);

for (int i=0; i<20; i++)

{
  fill(i*255/20);
  rect(10+20*i, 100, 20, 20);
  if (i%3 == 0)
  {
    fill(#FF0000);
  } else 
  {
    fill(255-i*255/20);

    ellipse(10+20*i+10, 100+10, 20-i/2, 20-i/2);
  }
}