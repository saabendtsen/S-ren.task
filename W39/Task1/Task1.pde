int[] nums = {8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};
void setup() {
  sorter(nums);
}

void sorter(int[] x) {
  int tmp;
  for (int j =0; j < x.length-1; j++) {
    
    for (int i = 0; i < x.length-1; i++) {
      if (x[i] > x[i+1]) {
        tmp = x[i];
        x[i] = x[i+1];
        x[i+1] = tmp;
      }
    }
  }
  println(nums);
}
