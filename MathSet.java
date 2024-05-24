import java.util.*;

class MathSet<Object> extends TreeSet<Object> {
  
  public MathSet<Object> Intersection(MathSet<Object> SetB){
    MathSet<Object> rtn = new MathSet<Object>();
  
    for(Object b: SetB){ // finds and adds all common elements to new set
      if(this.contains(b))
        rtn.add(b);
    }
    return rtn;
  }

  public MathSet<Object> Union(MathSet<Object> SetB){
    MathSet<Object> rtn = new MathSet<Object>();
    
    for (Object b: SetB) { // adds all elements from both sets into new one
      rtn.add(b);
    }
    for (Object a: this) {
      rtn.add(a);
    }
    
    return rtn;
  }
  
  public MathSet<Object> Difference(MathSet<Object> SetB){
    MathSet<Object> rtn = new MathSet<Object>();
    for (Object a: this) { // removes common elements between set B from A
      rtn.add(a);
    }
    for (Object b: SetB) {
      rtn.remove(b);
    }
    return rtn;
  }
  
  public boolean isSubsetOf(MathSet<Object> SetB){
    for (Object a: this){ // returns true or false whether A has all elements of B
      if(!SetB.contains(a))
        return false;
    }
    return true;
  }
  
  public boolean isDisjoint(MathSet<Object> SetB){
    for (Object a: this){ // returns true or false whether A and B share no elements
      if(SetB.contains(a))
        return false;
    }
    return true;
  }
  
  public void cartProduct(MathSet<Object> SetB){
    for (Object a: this){ // uses nested for loop to print all pairs between the sets
      for (Object b : SetB)
        System.out.print("("+a+", "+b+") ");
        System.out.println();
    }
    System.out.println();
  }

  public void Print(){ //prints out the set
    System.out.print("{");
    Iterator<Object> it = this.iterator();
    while (it.hasNext()) {
      System.out.print(it.next());
      if (it.hasNext())
        System.out.print(", ");
    }
    System.out.print("}");
    System.out.println();
  }
}