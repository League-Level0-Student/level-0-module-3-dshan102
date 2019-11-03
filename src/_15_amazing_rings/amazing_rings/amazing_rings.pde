int x = 151;
int y = 200;
int x1 = 549;
int speed1 = 1;
int speed2 = 1;

void setup() {
  size(700,400);
}

void draw() {
  background(12,242,52);
  for(int i=20; i>=0; i--) {
    noFill();
    ellipse(x,y,i*15,i*15);
    x+=speed1;
  }
    if (x>width) {
    speed1=-speed1;
  }
    if (x<0) {
      speed1=-speed1;
    }
  for(int i1=20; i1>=0; i1--) {
    noFill();
    ellipse(x1,y,i1*15,i1*15);
    x1-=speed2;
  }
    if (x1>width) {
      speed2=-speed2;
    }
    if (x1<0) {
      speed2=-speed2;
    }

}
