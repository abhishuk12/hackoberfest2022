
interface I1 {
    void f1();
}

interface I2 {
    void f2();
}

interface I3 {
    void f3();
}

class Main implements I1, I2, I3 {
    public void f1() {
        System.out.println("Interface 1 function.");
    }
    public void f2() {
        System.out.println("Interface 2 function.");
    }

    public void f3() {
        System.out.println("Interface 3 function.");
    }
}
public class MultipleInterfaces {

    public static void main(String[] args) {

        I1 ref = new Main(); // reference of interface storing the obj of main
        ref.f1();
        // ref.f2(); ref.f3() -> error
    }

}
