public class DemoRecursion{

  public static int sum(int x){
    /// base condition to exit
    if (x == 1){//1.2, 1.4
      return 1;//1.5
    }
    return sum(x - 1); //1.1->return sum(3-1); //1.3->return sum(2-1)
  }


public static int getEvenMultpier(int x){

  int v;

  if (x <= 1){
    return 0;
  }
  
  if (x == 2){
    return 2;

  }
  if (x % 2 == 0){
    v = x;
  } else {
  v = x - 1;
  }
  return v * getEvenMultpier(v - 2);
  //if x = 6 -> 2*4*6 ->2*(2*2)(2*3)
  //if x =8 -> 2*4*6*8 ->2*(2*2)(2*3)(2*4)
  //if x = 10 -> 2*4*6*8*10 ->2*(2*2)(2*3)(2*4)(2*5)
  //if x = 12 ->  2*4*6*8*10*12 ->2*(2*2)(2*3)(2*4)(2*5)(2*6)
  //if x = 7 -> 2*4*6
  //pattern->





  
}



public static void main (String[] args){
  System.out.println(DemoRecursion.sum(3));

  System.out.println(DemoRecursion.getEvenMultpier(12));



  }
}