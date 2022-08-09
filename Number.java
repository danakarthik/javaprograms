import java.util.*;
class Number
{
  private double num1;
    Number (double num2)
  {
    num1 = num2;

  }
  boolean isZero ()
  {
    if (num1 == 0)
      return true;
    else
      return false;
  }
  boolean isPositive ()
  {
    if (num1 > 0)
      return true;
    else
      return false;

  }
  boolean isNegative ()
  {
    if (num1 < 0)
      return true;
    else
      return false;

  }
  boolean isOdd ()
  {
    if ((num1 % 2) != 0)
      return true;
    else
      return false;

  }
  boolean isEven ()
  {
    if ((num1 % 2) == 0)
      return true;
    else
      return false;

  }
  boolean isPrime ()
  {
    boolean f = false;
    for (int i = 2; i < num1; i++)
      {
	if (num1 % i == 0)
	  f = true;
      }
    if (f == false)
      return true;
    else
      return false;
  }
  boolean isAmstrong ()
  {

    double sum = 0, rem;
    double temp = num1;

    int c = (int) Math.log10 (num1) + 1;

    while (temp > 0)
      {
	rem = temp % 10;

	sum = sum + (int) Math.pow (rem, c);
	temp /= 10;

      }
    if (sum == num1)
      return true;
    else
      return false;

  }
  double getFactorial ()
  {

    double f = 1;
    for (int i = 1; i < num1; i++)
      {
	f = f * i;
      }
    return f;
  }
  double getSqrt ()
  {
    return Math.sqrt (num1);

  }
  double sumDigits ()
  {
    double rem, sum = 0;
    while (num1 > 0)
      {
	rem = num1 % 10;

	sum = sum + rem;
	num1 /= 10;


      }
    return sum;

  }
  double getReverse ()
  {
    int temp = (int) num1;

    
    int rem, sum = 0;
    while (temp > 0)
      {
	rem = temp % 10;

	sum = (sum * 10) + rem;

	temp = temp / 10;


      }

    

    return (double) sum;

  }
  void ListFactor ()
  {
    for (int i = 1; i <= num1; ++i)
      {


	if (num1 % i == 0)
	  {
	    System.out.print (i + " ");
	  }
      }
  }
  void dispBinary ()
  {
    int temp = (int) num1;
    System.out.println ("Binary is " + Integer.toBinaryString (temp));
  }


}

public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    double n = in.nextDouble ();
    Number x = new Number (n);
      x.ListFactor ();
      x.dispBinary ();
      System.out.println ("getReverse" + x.getReverse ());
      System.out.println ("zero" + x.isZero ());
      System.out.println ("Positive" + x.isPositive ());
      System.out.println ("Negative" + x.isNegative ());
      System.out.println ("isOdd" + x.isOdd ());
      System.out.println ("isEven" + x.isEven ());
      System.out.println (" isPrime" + x.isPrime ());
      System.out.println (" isAmstrong" + x.isAmstrong ());
      System.out.println ("getFactorial" + x.getFactorial ());
      System.out.println ("getSqrt" + x.getSqrt ());
      System.out.println ("sumDigits" + x.sumDigits ());


  }
}
