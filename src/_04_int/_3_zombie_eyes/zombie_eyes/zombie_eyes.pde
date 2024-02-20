
void setup() {
size(500,500);
PImage face = loadImage("dogggy.jpeg");
face.resize(500, 500);
image(face, 0, 0);
fill(100,200,130);
ellipse(170, 195, 40, 40);
ellipse(330, 185, 40, 40);


}
void draw() {
println(mouseX);
  if (mouseX>=100 && mouseX<=120 && mouseY>=130 && mouseY<=150) {
fill(2,100,300);
ellipse(170, 195, 40, 40);
ellipse(330, 185, 40, 40);
}
}
