int[] intarray = {123,4,5234,7,9,3,4,6};
String[] stringarray = {"bøs","bøsb","søs","fds"};
boolean[] booarray = {true,false,true,true};


void setup() {
 printString(stringarray); 
 println(sumarray(intarray));
 println(avgarray(intarray));
}


void printString(String[] x) {
  println(x[0]);
  println(x[1]);
  println(x[2]);
  println(x[3]);
}

int sumarray(int[] x){
  return x[0]+x[1]+x[2]+x[3]+x[4];
}

int avgarray(int[]x){
  return (x[0]+x[1]+x[2]+x[3]+x[4]) / intarray.length;
}


void sorter(int[] x) {
   int temp;
   for (int i = 1; i < x.length; i++) {
    for (int j = i; j > 0; j--) {
     if (x[j] < x [j - 1]) {
      temp = x[j];
      x[j] = x[j - 1];
      x[j - 1] = temp;
     }
    }
   }
   for (int i = 0; i < x.length; i++) {
     System.out.println(x[i]);
   }
  }

Sorter = nested For loop. 
vi venter til vi bruger array list. på engelsk.
