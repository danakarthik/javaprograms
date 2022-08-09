abstract class Box{

    abstract void area();
    abstract void volume();
}
 class Box3d extends Box {
    int len,br,hi;
    Box3d(int a, int b,int c){
        len=a;
        br=b;
        hi=c;
    }


  

    void area(){
        int area=len*br;
        System.out.println(area);

    }
    void volume(){
        int vol=len*br*hi;
        System.out.println(vol)

    }

}
public class Abstraction{
    public static void main(String args[]){
        Box w = new Box3d(4,6,7);
        w.area();
        w.volume();
    
        
    }
}
