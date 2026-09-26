package com.khai.dict._03_primitive_types;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        playWithPrimitives();
        // playWithLiterals();
        // playWithConversions();
        // playWithArrays();
        // playWithNumberClasses();
        // playWithVariables();
    }

    public static void playWithPrimitives() {
        // Integers ------------------------------
        byte byteBalance = 0;           // 8 bit
        short shortBalance = 0;         // 16 bit
        int intBalance = 0;             // 32 bit - (should be the default)
        long longBalance = 0;           // 64 bit

        byteBalance += 120;
        System.out.println(byteBalance);
        byteBalance += 7;
        System.out.println(byteBalance);
        byteBalance += 1; // overflow
        System.out.println(byteBalance);


        // Floating Point numbers (never use for precise values like currencies)
        float floatNumber = 0;          // 32 bit
        double doubleNumber = 0;        // 64 bit - (should be the default)

        // Flags
        boolean flag = true;        // (size depend on the JVM implementation)

        // Unicode characters
        char character = 'a';       // 16 bit

        // Integer types may be unsigned (representing only non-negative integers)
        // or signed (representing negative integers as well)
        // In Java we only have signed integers / floating point numbers

        // Comparing floating point numbers ----------------------------------------------
        // Further reading: https://www.baeldung.com/java-comparing-doubles
        double d1 = 0;
        for (int i = 1; i <= 8; i++) {
            d1 += 0.1;
        }

        double d2 = 0.1 * 8;

        System.out.println("First double: " + d1);
        System.out.println("Second double: " + d2);
        System.out.println("Equality using ==: " + (d1 == d2));
        System.out.println("Equality using Math.abs(): " + (Math.abs(d1 - d2) < 0.000001d));
    }

    public static void playWithLiterals() {
        // A literal is the source code representation of a fixed value;
        // literals are represented directly in your code without requiring computation.
        // Literals are used for expressing particular values in the program
        byte b = 100;
        short s = 1000;
        int i = 10000;
        long l = 100000000L;
        char c = 'C';
        boolean result = true;

        // Integer literals -------------------------------------------
        int int1 = 10;                         // ok
        long long1 = 10;                       // ok
        long long2 = 10L;                      // ok - preferable
        long long3 = 10l;                      // ok
        //long l4 = 3_000_000_000;            // too large!!!
        long l5 = 3_000_000_000L;              // ok

        int decimal = 26;                      // 26 in decimal (base 10) format
        int hexaDecimal = 0x01A;               // 26 in hexadecimal (base 16) format
        int binary = 0b11010;                  // 26 in binary (base 2) format
        int octal =  032;                      // 26 in octal (base 8) format

        // Floating point literals -----------------------------------

        float float1 = 1;                   // ok
        //float float2 = 1.0;              // error: double
        float float3 = 1.0f;                // ok
        float float4 = 1.0F;                // ok

        double double1 = 1;                 // ok
        double double2 = 1.0;               // ok
        double double3 = 1.0f;              // ok
        double double4 = 1.0d;              // ok
        double double5 = 1.0D;              // ok

        double d1 = 123.4;
        double d2 = 1.234e2;                // scientific notation (e means power of 10)

        // Underscore in numeric literals ---------------------------
        // Used for better readability
        long creditCardNumber = 1234_5678_9012_3456L;
        System.out.println("Credit card number: " + creditCardNumber);
        long socialSecurityNumber = 999_99_9999L;
        System.out.println("Social security number: " + socialSecurityNumber);
        float pi =  3.14_15F;
        System.out.println("Pi: " + pi);
        long hexBytes = 0xFF_EC_DE_5E;
        System.out.println("Hex bytes: " + hexBytes);
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        System.out.println("Max long: " + maxLong);
        byte binaryValue = 0b0010_0101;
        System.out.println("Binary: " + binaryValue);
        long bytes = 0b11010010_01101001_10010100_10010010;
        System.out.println("Bytes " + bytes);
    }

    public static void playWithConversions() {
        // Conversions / widening  (can happen without problems)
        int int1 = 100;
        long long1 = int1;

        float floatValue1 = 1524F;
        double doubleValue1 = floatValue1;

        // Conversions / narrowing (data loss can occur!!!)
        long long2 = 100L;
        //int int2 = long2;                 // Cannot happen implicitly
        int int3 = (int) long2;             // can be done explicitly
        long hugeLong = 1000000000000L;
        int hugeInt = (int) hugeLong;       // Possible data loss!

        double double1 = 1524.0;
        //float float1 = double1;                      // Cannot happen implicitly
        float float2 = (float) double1;                // can be done explicitly
        double hugeDouble = 15054555524.0;
        float hugeFloat = (float) hugeDouble;          // Possible data loss

        float float3 = Integer.MAX_VALUE;
        System.out.printf("%.0f vs %d", float3, Integer.MAX_VALUE);
    }

    public static void playWithArrays() {
        // One dimensional array
        int[] array1;                       // declaration
        int[] array2 = new int[10];         // declaration + initialization with default values
        int[] array3 = {1, 2, 3, 4, 5};     // declaration + initialization with given values
        array2[0] = 2;                      // set value by index
        int item1 = array3[0];              // get value by index
        System.out.println(item1);
        int item2 = array3[2];               // get value by index
        System.out.println(item2);

        // Jagged array: Multi dimensional array with different size sub arrays
        int[][] jaggedArray = {
                {100, 200, 300},
                {400, 500, 600},
                {700, 800, 900, 1000}
        };

        System.out.println("Last element " + jaggedArray[2][3]);

        // Matrix: Multi dimensional array with equal size sub arrays
        int[][] matrix = {
                {100, 200, 300},
                {400, 500, 600},
                {700, 800, 900}
        };

        // Iteration over multi dimensional arrays:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }

        System.out.println("--------------");

        for (int[] subArray : matrix) {
            for (int number : subArray) {
                System.out.print(number + ",");
            }
            System.out.println();
        }

        // Array manipulations:
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] target = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.arraycopy(source, 2, target, 3, 4);
        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Target: " + Arrays.toString(target));
    }

    public static void playWithNumberClasses() {
        // further reading: https://stackoverflow.com/questions/22648627/how-does-auto-boxing-unboxing-work-in-java

        double d0 = 10.1;
        float  f0 = 132F;
        long   l0 = 5548L;
        int    i0 = 122;
        short  s0 = 6;
        byte   b0 = 7;

        // Boxing wrapping operation to transform a
        // primitive type into an object (wrapper datatype)

        Double d1 = Double.valueOf(d0);      // Explicitly
        Double d11 = d0;                     // Automatically
        Float f1 = f0;
        Long l1 = l0;
        Integer i1 = i0;
        Short s1 = s0;
        Byte b1 = b0;

        // Unboxing is the reverse transformation of boxing:
        // we extract the primitive value of an object from its wrapper object
        double d2 = d1;
        float  f2 = f1;
        long   l2 = l1;
        int    i2 = i1;
        short  s2 = s1;
        byte   b2 = b1;

        // Also, search on your own for homework:
        BigDecimal decimal = new BigDecimal(7);
    }

    public static void playWithVariables() {
        // Boxing
        // Boxing: creating an object from a primitive
        int a0 = 5;
        //Integer b0 = new Integer(a0);     // Integer - often called wrapper

        // Unboxing
        Integer a1 = 10;
        int b1 = a1;

        // Auto boxing
        int a2 = 5;
        Integer b2 = a2;        // Takes resources too

        // Can raise performance issues
        Integer[] values = {1, 2, 3, 4, 9000000};    // imagine this goes till 900000
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 10) {                    // compares wrapper to primitive - auto unboxing
                System.out.println(values[i]);
            }
        }
    }
}
