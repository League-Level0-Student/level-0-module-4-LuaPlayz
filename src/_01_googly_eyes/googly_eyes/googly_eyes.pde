PImage face;
void setup() {
  face=loadImage("dog.jpg");
size(1000,900);
face.resize(1000,900);
}

void draw() {
  background(face);
  fill(#FFFFFF);
  ellipse(390,300,90,90);
  ellipse(600,300,90,90);
  fill(0,0,0);
  ellipse(mouseX,mouseY,45,45);
  ellipse(mouseY+210,mouseX,45,45);
}
