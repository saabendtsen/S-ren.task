int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

void setup() {
  //method(10);
  //println(randomNumber(arr));
  //printNums(100);
  fibu(1, 1);
}


void method(int x) {

  for (int i = 0; i <=100; i++) {
    if ( i % x == 0) {
      println(i);
    }
  }
}

int randomNumber(int[] x) { 
  return x[(int)random(x.length)];
}

void printNums(int x) {
  if ( x > 0) {
    println(x);
    printNums(x-1);
  }
}

void fibu(int a, int b) {
  if (a < 10000) {
    println(a + "\t" + b);  
    fibu(b, a+b);
  }
}
