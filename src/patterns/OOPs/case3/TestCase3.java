package patterns.OOPs.case3;

public class TestCase3 {
    public static void main(String[] args) {
        ClassA classA = new ClassB();
        ((ClassB) classA).m2();
        classA.m1();
    }
}
