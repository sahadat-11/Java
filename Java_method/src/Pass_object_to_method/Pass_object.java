package Pass_object_to_method;
class Block {
    int a, b, c, volume;
    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    // return true if ob defines same block;
    boolean Sameblock(Block ob) {
        if((ob.a == a) && (ob.b == b) && (ob.c == c)) return true;
        return false;
    }
    // return true if volume is same;
    boolean Samevolume(Block ob) {
        if(ob.volume == volume) return true;
        return  false;
    }
}
public class Pass_object {
    public static void main(String[] args) {
      Block ob1 = new Block(10, 2, 5);
      Block ob2 = new Block(10, 2, 5);
      Block ob3 = new Block(4, 5, 6);
      System.out.println("ob1 == ob2 " +ob1.Sameblock(ob2)); // pass object
      System.out.println("ob1 == ob3 " +ob1.Sameblock(ob3));
      System.out.println("ob2 == ob3 " +ob2.Sameblock(ob3));
      System.out.println("volume of ob1 == volume of ob2 " +ob1.Samevolume(ob2));
    }
}
