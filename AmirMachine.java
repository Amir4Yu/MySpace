public class AmirMachine{
////add gender ----> if else----> instance methods
  enum Horoscope{
    ARIES(1, "ARI"),
    TARUS(2, "TAR"),
    GEMINI(3, "GEM"),
    CANCER(4, "CAN"),
    LEO(5, "LEO"),
    VIRGO(6, "VIR"),
    LIBRA(7, "LIB"),
    SCORPIO(8, "SCO"),
    SAGITTARIUS(9, "SAG"),
    CAPRICORN(10, "CAP"),
    AQUARIUS(11, "AQU"),
    PISCES(12, "PIS");
  
  private int code;
  private String shortname;
  
  private Horoscope(int code, String shortname){
    this.code = code;
    this.shortname = shortname;
  }
  
  public static void printHoroscopeConditionlly(){
    for (Horoscope abc: Horoscope.values()){
      if (abc.getCode() == 5||abc.getCode()==11) {
        System.out.println("Your Horoscope is "+ abc.getShortname()+"!!!!"+
        "You're lucky one!!!");
      }
    }
  }
  
  
  public int getCode(){
    return this.code;
  }
  
  public String getShortname(){
    return this.shortname;
  }
      }



  
  public static void main(String[] args){
    Horoscope.printHoroscopeConditionlly();

   

  }
}
