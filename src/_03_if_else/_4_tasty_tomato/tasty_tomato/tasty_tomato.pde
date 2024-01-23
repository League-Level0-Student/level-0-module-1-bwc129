void setup() {
    size(500, 500);


    background (200, 0, 0);
    noStroke();
   fill (#FF0303);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (#03FF11);
    rect(176, 103, 12, 32);
} 
    void draw() {
    
      
      if (mousePressed) {
      
     fill (200,0,0);
     
     ellipse(mouseX, mouseY, 20, 20);
    }
    
}
