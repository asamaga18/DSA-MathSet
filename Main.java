import java.util.*;

class Main {
  public static void main(String[] args) {
    MathSet<Object> setA = new MathSet<Object>();  
    MathSet<Object> setB = new MathSet<Object>();
    MathSet<Object> setC = new MathSet<Object>();
    MathSet<Object> setD = new MathSet<Object>();
    MathSet<Object> setE = new MathSet<Object>();
    MathSet<Object> setF = new MathSet<Object>();
    
    setA.add(4);
    setA.add(9);
    setA.add(2);
    setA.add(5); // adding into sets (tree so auto ordered)
    setB.add(90);
    setB.add(15);
    setB.add(11);
    setB.add(5);
    setC = setA.Union(setB); // last three set are products of the comparisons between first four (minus set f which is blank)
    setD = setB.Intersection(setA); 
    setE = setC.Difference(setD);
    System.out.print("Set A: "); // printing all the sets
    setA.Print();
    System.out.print("Set B: ");
    setB.Print();
    System.out.print("Set C: ");
    setC.Print();
    System.out.print("Set D: ");
    setD.Print();
    System.out.print("Set E: ");
    setE.Print(); 
    System.out.print("Set F: ");
    setF.Print(); 
    System.out.println();
    System.out.println("Cartesian (C, B):"); // printing cart products
    setC.cartProduct(setB);
    System.out.println("Cartesian (A, E):"); 
    setA.cartProduct(setE);
    
    System.out.println("Is Set A a subset of Set B?: "+setA.isSubsetOf(setB)); // printing true or falses from disjoints/subsets
    System.out.println("Is Set A a subset of Set C?: "+setA.isSubsetOf(setC));
    System.out.println("Is Set A a disjoint of Set B?: "+setA.isDisjoint(setB));
    System.out.println("Is Set B a disjoint of Set A?: "+setB.isDisjoint(setA));
    System.out.println("Is Set C a disjoint of Set F?: "+setC.isDisjoint(setF));



  }
}