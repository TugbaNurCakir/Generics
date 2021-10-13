package multiGeneric;

public class Main {
    public static void main(String[] args) {
        String a = "abc";
        Integer b = 5;
        Boolean c = true;
        Test<String, Integer, Boolean> nums = new Test<>(a, b, true);

        nums.showInfo();
    }
}
