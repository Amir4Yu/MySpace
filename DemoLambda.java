///Function Interface means an interface has has one abstract method only
@FunctionalInterface
interface Substraction1{
  int substract();
}

@FunctionalInterface
interface Substraction2{
  int substract(int x, int y);
}

@FunctionalInterface
interface Substraction3{
  int substract(int x);
}



///Unnecesary coding for Function Interface///
class Abc implements Substraction1{
  public int substract(){
    return 2;
  }
}

public class DemoLambda{


  public static void main(String[] args){
///Normal Handlingby creating a Class and implemnts the interface
    Abc abc = new Abc();
    System.out.println(abc.substract());//print 2

///Alternative
    Substraction1 s = () -> 2; ///()means no input parameters

    Substraction2 a;
    if (s.substract() == 2){
      a = ((x, y) -> x - y +2);
    }else{
      a = ((x, y) -> x - y +4);
    }
    Substraction3 e = x -> x + 2;

    System.out.println(s.substract());
    System.out.println(a.substract(10));
    System.out.println(a.substract(3,4));





  }
}

