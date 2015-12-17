///Student : Gershom Raymundo
///squids and boats project

float horizon;
float r, g, b;
float sX, sY;
float counter;

Squid mySquid1;
Squid mySquid2;
Squid mySquid3;

Boat myBoat1;

//setup the screen
void setup(){
  size( 800, 800 );
  horizon = height / 3;
  
  mySquid1 = new Squid( 255, 56, 113, width / 2 ,height, 2 );
  mySquid2 = new Squid( 57, 61, 255, width / 3, height, 3);
  mySquid3 = new Squid( 60, 232, 52, width / 4, height, 1.5); 
  
  
  myBoat1 = new Boat ( 50, 50, 2);
}

//void reset(){
//}

void draw(){
  scene();
  mySquid1.display();
  mySquid1.move();
  mySquid2.display();
  mySquid2.move();
  mySquid3.display();
  mySquid3.move();
  
  
  myBoat1.display();
  myBoat1.move();
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

