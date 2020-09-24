int[][] board = new int[8][8];
int size = 40;

void setup() {
  size(350, 350);


  for (int i = 0; i < board.length; i++) {

    for (int j = 0; j < board.length; j++) {
      if ((i+j) % 2 ==0) {
        board[i][j] = 0;
      } else {
        board[i][j] = 1;
      }
    }
  }
}


void draw(){
  
  for (int i = 0; i < board.length; i++) {

    for (int j = 0; j < board.length; j++) {
      if ((i+j) % 2 ==0) {
        fill(255);
      } else {
        fill(50);
      }
      rect(i*size,j*size,size,size);
    }
  }
  
}
