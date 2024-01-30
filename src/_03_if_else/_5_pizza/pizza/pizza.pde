PImage pepperoni;
  
  
  
void setup() {
 size(2000, 2000); 
 fill(#FEFF03);
 pepperoni = loadImage("pepperoni.png");
ellipse(1000, 475, 1500, 1000);

fill(#FF0303);
ellipse(1000,475, 900, 750);
}
void draw() {

  image (pepperoni, mouseX, mouseY);
}

  
    
