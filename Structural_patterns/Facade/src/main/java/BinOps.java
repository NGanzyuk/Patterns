public class BinOps {
    public String sum(String a, String b) {
        int a_2 = Integer.parseInt(a, 2);
        int b_2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(a_2 + b_2);
    }

    public String mult(String a, String b) {
        int a_2 = Integer.parseInt(a, 2);
        int b_2 = Integer.parseInt(b, 2);
        return Integer.toBinaryString(a_2 * b_2);
    }
}