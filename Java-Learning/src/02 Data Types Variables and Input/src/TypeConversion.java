class TypeConversion {
    public static void main(String[] args) {
        // Implicit (Automatic)
        byte b1 = 10;
        int i1 = b1;            // byte → int (automatic)

        // Explicit (Casting)
        int i2 = 130;
        byte b2 = (byte) i2;     // int → byte (data loss, result = -126)

        float f1 = 5.6f;
        int i3 = (int) f1;       // float → int (decimal removed → 5)

        System.out.println("byte to int: " + i1);
        System.out.println("int to byte (overflow): " + b2);
        System.out.println("float to int: " + i3);
    }
}