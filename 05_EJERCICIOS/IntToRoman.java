public class IntToRoman {
 /*
    convert an integer to roman
    M = 1000
    D = 500
    C = 100
    L = 50
    X = 10
    V = 5
    I = 1

    conditions:
    int >= 0 and int <= 3999
*/
  public static void main(String[] args) {
    
    System.out.println(intToRoman(3289));
    // n = 3289 -> 3000 + 200 + 80 + 9 - r = MMMCCLXXXIX
  }

  public static String intToRoman(int n){

    if (n >= 1 & n <= 3999){
      int number = n, units, tens, hundreds, thousands;
      String roman = "";
      units = number % 10; number /= 10; // units  = 9, number = 328
      tens = number % 10; number /= 10; // tens  = 8, number = 32
      hundreds = number % 10; number /= 10; // hundreds  = 2, number = 3
      thousands = number % 10; number /= 10; // thousands  = 3, number = 0
  
  
      switch (thousands){
        case 1: roman += "M"; break;
        case 2: roman += "MM"; break;
        case 3: roman += "MMM"; break;
      }
  
      switch (hundreds){
        case 1: roman += "C"; break;
        case 2: roman += "CC"; break;
        case 3: roman += "CCC"; break;
        case 4: roman += "CD"; break;
        case 5: roman += "D"; break;
        case 6: roman += "DC"; break;
        case 7: roman += "DCC"; break;
        case 8: roman += "DCCC"; break;
        case 9: roman += "CM"; break; 
      }
  
      switch (tens){
        case 1: roman += "X"; break;
        case 2: roman += "XX"; break;
        case 3: roman += "XXX"; break;
        case 4: roman += "XL"; break;
        case 5: roman += "L"; break;
        case 6: roman += "LX"; break;
        case 7: roman += "LXX"; break;
        case 8: roman += "LXXX"; break;
        case 9: roman += "XC"; break; 
      }
  
      switch (units){
        case 1: roman += "I"; break;
        case 2: roman += "II"; break;
        case 3: roman += "III"; break;
        case 4: roman += "IV"; break;
        case 5: roman += "V"; break;
        case 6: roman += "VI"; break;
        case 7: roman += "VII"; break;
        case 8: roman += "VIII"; break;
        case 9: roman += "IX"; break; 
      }
      return roman;
    }
    else {
      return "The number must be >= 1 and <= 3999";
    }
  }
}
