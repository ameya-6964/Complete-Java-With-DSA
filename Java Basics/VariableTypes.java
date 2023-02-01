// Everything in Java is Stored Inside Binary Representation (0,1) with base Power of 2

public class VariableTypes {
    public static void main(String[] args) {
        // Byte Datatype -> 1 Bit
        byte b1 = 10;
        byte b2 = 15;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3); // 25

        // short Datatype 2 bytes -> (16 bit)
        short s1 = 10;
        short s2 = 15;
        short s3 = (short) (s1 + s2);
        System.out.println(s3); // 25

        // Int Datatype -> 4 Bytes (32 bits)
        int i1 = 10;
        int i2 = 15;
        int i3 = i1 + i2;
        System.out.println(i3); // 25

        // long Datatype -> 8 Bytes (64 bits)
        long l1 = 10;
        long l2 = 15;
        long l3 = l1 + l2;
        System.out.println(l3); // 25

        // float Datatype -> 4 Bytes (32 bits)
        float f1 = 10.00f;
        float f2 = 15.00f;
        float f3 = f1 + f2;
        System.out.println(f3); // 25.00

        // double Datatype -> 8 Bytes (64 bits)
        double d1 = 10.00;
        double d2 = 15.00;
        double d3 = d1 + d2;
        System.out.println(d3); // 25.00

        // char Datatype -> 2 Bytes (16 bits)
        char ch = 'a';
        System.out.println(ch); // a
        System.out.println(ch + 0); // 97
        System.out.println(ch + 3); // 100 Because a has binary value of 97

    }
}
