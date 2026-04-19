class Number {
    int value;
}

public class CallByValueReference {

    static void changePrimitive(int x) {
        x = 100;
    }

    static void changeObject(Number n) {
        n.value = 100;
    }

    public static void main(String[] args) {
        int a = 10;
        changePrimitive(a);
        System.out.println("After primitive call: " + a);

        Number obj = new Number();
        obj.value = 10;
        changeObject(obj);
        System.out.println("After object call: " + obj.value);
    }
}