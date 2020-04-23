PImage face;
void setup() {
  face=loadImage("dog.jpeg");
size(2000,1000);
face.resize(2000,1000);

}

void draw() {
  background(face);
}
