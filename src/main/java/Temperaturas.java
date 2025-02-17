public class Temperaturas{
  double C = 2.43;
  double Ra = 0;
  double Re = 0;
  double F  = 0;
  double K  = 0;

public void convK(){
    K = C + 273.15;
 }

public void convRe(){
  Re = C * 0.8;
  }

public void convRa(){
   Ra = C * 1.8 + 32 + 459.67;
  }

public void convF(){
      F = C * 1.8 + 32;
    }
 }
