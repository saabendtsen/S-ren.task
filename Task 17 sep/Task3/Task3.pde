Student[] morestudens = new Student[10];


Teacher niller;
Student kasper;
Student allan;

void setup() {
  morestudens[0] = new Student("mads", 28, false, 'c');
  morestudens[1] = new Student("tobias", 28, false, 'c');
  morestudens[2] = new Student("sebastian", 28, false, 'c');
  morestudens[3] = new Student("August", 28, false, 'c');
  morestudens[4] = new Student("Alex", 28, false, 'c');
  morestudens[5] = new Student("Niels", 28, false, 'c');
  morestudens[6] = new Student("Kris", 28, false, 'c');
  morestudens[7] = new Student("Madder", 28, false, 'c');
  morestudens[8] = new Student("Kalde", 28, false, 'c');
  morestudens[9] = new Student("Fede", 28, false, 'c');


  niller = new Teacher("Niller", 25, false);
  kasper = new Student("Kasper", 27, false, 'C');
  allan = new Student("Allan", 16, true, 'h');

  println(niller.name);
  println(kasper.name + " " + kasper.datamatikerTeam);
  println(allan.name + " " + allan.datamatikerTeam);
  println(printname(morestudens, 3));
  println(findname(morestudens, "Madder"));
}

String printname(Student[] a, int x) {
  return a[x].name;
}

int findname (Student[] a, String name) { 

  for (int i= 0; i < morestudens.length; i++) {

    if (name == a[i].name)
      return i;
  } 
  {
    return -1;
  }
}
