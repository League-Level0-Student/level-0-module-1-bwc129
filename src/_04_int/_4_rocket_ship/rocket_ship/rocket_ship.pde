int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    
}

void draw() {
    background(275, 88, 123); 
    fill(random(255), 66, 345);
    ellipse(x, y + 130, 90, 90);
    fill(12, 128, 211);
    ellipse(x, y + 115, 70, 70);
    fill(200, 12, 156);
    ellipse(x, y + 95, 35, 35);
    fill(55, 244, 13);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
if (mousePressed) {
x=mouseX;
y=mouseY;
}}
