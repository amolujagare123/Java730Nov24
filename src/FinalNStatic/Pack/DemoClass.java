package FinalNStatic.Pack;

import FinalNStatic.StaticMethodDemo;

import static FinalNStatic.StaticMethodDemo.*;

/*import static FinalNStatic.StaticMethodDemo.staticMethod1;
import static FinalNStatic.StaticMethodDemo.staticMethod2;
import static FinalNStatic.StaticMethodDemo.college;*/
//import static FinalNStatic.StaticMethodDemo.*;
public class DemoClass {

    public static void main(String[] args) {

        StaticMethodDemo ob = new StaticMethodDemo();
        staticMethod1();
        staticMethod2();
        ob.college = "";


        staticMethod1();
        staticMethod2();
        StaticMethodDemo.college = "";

        staticMethod1();
        staticMethod2();
        college = "";
    }
}
