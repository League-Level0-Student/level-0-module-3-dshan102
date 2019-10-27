void setup() {
  size(700,400);
}

void draw() {
  int x = 151;
  int y = 200;
  for(int i=20; i>=0; i--) {
    noFill();
    ellipse(x,y,i*15,i*15); 
  }
  int x1 = 549;
  for(int i1=20; i1>=0; i1--) {
    noFill();
    ellipse(x1,y,i1*15,i1*15);
  }
}
