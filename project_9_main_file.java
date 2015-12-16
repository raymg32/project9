///Student : Gershom Raymundo
///squids and boats project

float horizon;
float r, g, b;
float sX, sY;
float counter;

Squid mySquid1;
Squid mySquid2;

//setup the screen
void setup(){
  size( 800, 800 );
  horizon = height / 3;
  
  mySquid1 = new Squid( 255, 56, 113, 400 ,horizon, 2 );
  mySquid2 = new Squid( 57, 61, 255, 600, horizon, 3);
}

//void reset(){
//}

void draw(){
  scene();
  mySquid1.display();
  mySquid1.move();
  mySquid2.display();
  mySquid2.move();
}

void scene(){
  background( 25, 206, 74 );
  fill( 25, 177, 206);
  rect( 0, horizon, width, height); 
}



//void messages(){
//}

//keypresses
//void keyPressed(){
//}

