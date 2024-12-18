package ClassNConstructors.pack2;

import ClassNConstructors.pack1.Java1;

public class Java3 extends Java1 {



    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.a = 10;
      /*  ob.d = 34.56;
        ob.c = 'd';
        ob.str = "text";
        ob.display();*/

        Java3 j3 = new Java3();
        j3.a = 10;
    //    j3.d = 78.89; // private
        j3.c = 'h'; // protected
    //    j3.dispaly();

    }

}
