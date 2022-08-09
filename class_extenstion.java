import java.util.*;
public class Shape
{
  void draw ()
  {
    System.out.println ("Shape  draw");
}
  void erase ()
  {
    System.out.println ("Shape erase");
      
  }


  class Circle extends Shape
  {
    void draw ()
    {
      System.out.println ("circle  draw");


    }
    void erase ()
    {
      System.out.println ("circle erase");


    }
  }
  class Triangle extends Shape
  {
    void draw ()
    {
      System.out.println ("triangle draw");


    }
    void erase ()
    {
      System.out.println ("triangle erase");


    }

  }
  class Square extends Shape
  {
    void draw ()
    {
      System.out.println ("square draw");


    }
    void erase ()
    {
      System.out.println (" square erase");


    }
  }
  public static void main (String[]args)
  {
    Shape x = new Shape ();
    Cricle y= new Circle();
    Triangle z=new Traingle();
    Square a = new Square();
    x.draw ();
    x.erase();
    y.draw ();
    y.erase();
    z.draw ();
    z.erase();
    a.draw ();
    a.erase();
  }
}
}
