public class Test {
    static int age;
    static {
        int age = 10;
        var Firstname="ghoshit";
        var  Lastname="kashyap";
        System.out.println("static block called ");
    }
    Test(){
        System.out.println(age);
    }
}

    class Main {
        public static void main(String args[]) {

            // Although we have two objects, static block is executed only once.
            Test t1 = new Test();
        }
    }
