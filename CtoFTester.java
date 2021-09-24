public class CtoFTester {
  static int celsiusToFahrenheit(int x) {
    return (x * 9 / 5) + 32;
  }
static int fahrenheitToCelsius(int x) {
    return (x - 32) * 5 / 9;
  }

  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(10));
    System.out.println(fahrenheitToCelsius(10));
  }
}