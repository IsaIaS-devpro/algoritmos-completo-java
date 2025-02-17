
public class Main {
  public static void main(String[] args) {
     Temperaturas converter = new Temperaturas();
      
     converter.convK();
     converter.convRe();
     converter.convRa();
     converter.convF();
     System.out.println("Kelvin: " + converter.K);
     System.out.println("Reaumur: " + converter.Re);
     System.out.println("Rankine: " + converter.Ra);
     System.out.println("Fahrenheit: " + converter.F);
    
    
  }
}