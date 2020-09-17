void setup(){
  size(500,500);
  background(155);
}

boolean rDown = false;
boolean gDown = false;

void draw(){
  fill(0);
rect(10,0,100,300);

//1st light
if (rDown == true)
{
fill(255,0,0);
circle(60,60,50);
}
else
{ 
  fill(155);
  circle(60,60,50);
}

//2nd light
fill(155);
circle(60,150,50);

//3rd light

if (gDown == true)
{
fill(0,255,0);
circle(60,250,50);
}
else
{ 
  fill(155);
  circle(60,250,50);
}

}
void keyPressed()
{ 
  if (key == 'r')
  {
    rDown = true;
  } else if (key == 'g')
  {
    gDown = true;
  }
}

void keyReleased()
{
  if (key == 'r')
  {
    rDown = false;
  } else if (key == 'g')
  {
    gDown = false;
  }
    
}


  
