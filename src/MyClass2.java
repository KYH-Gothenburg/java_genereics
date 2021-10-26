public class MyClass2 implements IMyInterface{
    @Override
    public int add(int a, int b) {
        return a * b;
    }

    @Override
    public int subtract(int a, int b) {
        return a / b;
    }

    public void hej() {
        System.out.println("Hej");
    }
}
