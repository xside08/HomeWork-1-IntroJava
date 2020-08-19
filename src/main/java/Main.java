package main.java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        byte byteVariable = 99;
        short shortVariable = 777;
        long longVariable = 98765567;
        double doubleVariable = 3.14;
        float floatVariable = 5.42f;

///byte
        long plusByteAndSByte = byteVariable + byteVariable;
        long plusByteAndShort = byteVariable + shortVariable;
        long plusByteAndLong = byteVariable + longVariable;
        float plusByteAndDouble = byteVariable + (float)doubleVariable;
        double plusByteAndFloat = byteVariable + floatVariable;

        System.out.println("");
        System.out.println("byte and byte -> " + byteVariable +" + "+ byteVariable +" = "+ plusByteAndSByte);
        System.out.println("byte and short ->" + byteVariable +" + "+ shortVariable +" = "+   plusByteAndShort);
        System.out.println("byte and long ->" + byteVariable +" + "+ longVariable +" = "+   plusByteAndLong);
        System.out.println("byte and double ->" + byteVariable +" + "+ doubleVariable +" = "+   plusByteAndDouble);
        System.out.println("byte and float -> " + byteVariable +" + "+ floatVariable +" = "+   plusByteAndFloat);


        long minusByteAndSByte = byteVariable - byteVariable;
        long minusByteAndShort = byteVariable - shortVariable;
        long minusByteAndLong = byteVariable - longVariable;
        double minusByteAndDouble = byteVariable - doubleVariable;
        double minusByteAndFloat = byteVariable - floatVariable;

        System.out.println("");
        System.out.println("byte and byte -> " + byteVariable +" - "+ byteVariable +" = "+ minusByteAndSByte);
        System.out.println("byte and short -> " + byteVariable +" - "+ shortVariable +" = "+ minusByteAndShort);
        System.out.println("byte and long -> " + byteVariable +" - "+ longVariable +" = "+ minusByteAndLong);
        System.out.println("byte and double -> " + byteVariable +" - "+ doubleVariable +" = "+ minusByteAndDouble);
        System.out.println("byte and float -> " + byteVariable +" - "+ floatVariable +" = "+ minusByteAndFloat);


        long myltiplyByteAndSByte = byteVariable * byteVariable;
        long myltiplyByteAndShort = byteVariable * shortVariable;
        long myltiplyByteAndLong = byteVariable * longVariable;
        double myltiplyByteAndDouble = byteVariable * doubleVariable;
        double myltiplyByteAndFloat = byteVariable * floatVariable;

        System.out.println("");
        System.out.println("byte and byte -> " + byteVariable +" * "+ byteVariable +" = "+ myltiplyByteAndSByte);
        System.out.println("byte and short -> " + byteVariable +" * "+ shortVariable +" = "+ myltiplyByteAndShort);
        System.out.println("byte and long -> " + byteVariable +" * "+ longVariable +" = "+ myltiplyByteAndLong);
        System.out.println("byte and double -> " + byteVariable +" * "+ doubleVariable +" = "+ myltiplyByteAndDouble);
        System.out.println("byte and float -> " + byteVariable +" * "+ floatVariable +" = "+ myltiplyByteAndFloat);


        long divideByteAndSByte = byteVariable / byteVariable;
        long divideByteAndShort = byteVariable / shortVariable;
        long divideByteAndLong = byteVariable / longVariable;
        double divideByteAndDouble = byteVariable / doubleVariable;
        double divideByteAndFloat = byteVariable / floatVariable;

        System.out.println("");
        System.out.println("byte and byte -> " + byteVariable +" / "+ byteVariable +" = "+ divideByteAndSByte);
        System.out.println("byte and short -> " + byteVariable +" / "+ shortVariable +" = "+ divideByteAndShort);
        System.out.println("byte and long -> " + byteVariable +" / "+ longVariable +" = "+ divideByteAndLong);
        System.out.println("byte and double -> " + byteVariable +" / "+ doubleVariable +" = "+ divideByteAndDouble);
        System.out.println("byte and float -> " + byteVariable +" / "+ floatVariable +" = "+ divideByteAndFloat);


//// short
        long plusShortAndSByte = shortVariable + byteVariable;
        long plusShortAndShort = shortVariable + shortVariable;
        long plusShortAndLong = shortVariable + longVariable;
        double plusShortAndDouble = shortVariable + doubleVariable;
        double plusShortAndFloat = shortVariable + floatVariable;

        System.out.println("");
        System.out.println("short and byte -> " + shortVariable +" + "+ byteVariable +" = "+ plusShortAndSByte);
        System.out.println("short and short ->" + shortVariable +" + "+ shortVariable +" = "+   plusShortAndShort);
        System.out.println("short and long ->" + shortVariable +" + "+ longVariable +" = "+   plusShortAndLong);
        System.out.println("short and double ->" + shortVariable +" + "+ doubleVariable +" = "+   plusShortAndDouble);
        System.out.println("short and float -> " + shortVariable +" + "+ floatVariable +" = "+   plusShortAndFloat);


        long minusShortAndSByte = shortVariable - byteVariable;
        long minusShortAndShort = shortVariable - shortVariable;
        long minusShortAndLong = shortVariable - longVariable;
        double minusShortAndDouble = shortVariable - doubleVariable;
        double minusShortAndFloat = shortVariable - floatVariable;

        System.out.println("");
        System.out.println("short and byte -> " + shortVariable +" - "+ byteVariable +" = "+ minusShortAndSByte);
        System.out.println("short and short -> " + shortVariable +" - "+ shortVariable +" = "+ minusShortAndShort);
        System.out.println("short and long -> " + shortVariable +" - "+ longVariable +" = "+ minusShortAndLong);
        System.out.println("short and double -> " + shortVariable +" - "+ doubleVariable +" = "+ minusShortAndDouble);
        System.out.println("short and float -> " + shortVariable +" - "+ floatVariable +" = "+ minusShortAndFloat);


        long myltiplyShortAndSByte = shortVariable * byteVariable;
        long myltiplyShortAndShort = shortVariable * shortVariable;
        long myltiplyShortAndLong = shortVariable * longVariable;
        double myltiplyShortAndDouble = shortVariable * doubleVariable;
        double myltiplyShortAndFloat = shortVariable * floatVariable;

        System.out.println("");
        System.out.println("short and byte -> " + shortVariable +" * "+ byteVariable +" = "+ myltiplyShortAndSByte);
        System.out.println("short and short -> " + shortVariable +" * "+ shortVariable +" = "+ myltiplyShortAndShort);
        System.out.println("short and long -> " + shortVariable +" * "+ longVariable +" = "+ myltiplyShortAndLong);
        System.out.println("short and double -> " + shortVariable +" * "+ doubleVariable +" = "+ myltiplyShortAndDouble);
        System.out.println("short and float -> " + shortVariable +" * "+ floatVariable +" = "+ myltiplyShortAndFloat);


        long divideShortAndSByte = byteVariable / byteVariable;
        long divideShortAndShort = byteVariable / shortVariable;
        long divideShortAndLong = byteVariable / longVariable;
        double divideShortAndDouble = byteVariable / doubleVariable;
        double divideShortAndFloat = byteVariable / floatVariable;

        System.out.println("");
        System.out.println("short and byte -> " + shortVariable +" / "+ byteVariable +" = "+ divideShortAndSByte);
        System.out.println("short and short -> " + shortVariable +" / "+ shortVariable +" = "+ divideShortAndShort);
        System.out.println("short and long -> " + shortVariable +" / "+ longVariable +" = "+ divideShortAndLong);
        System.out.println("short and double -> " + shortVariable +" / "+ doubleVariable +" = "+ divideShortAndDouble);
        System.out.println("short and float -> " + shortVariable +" / "+ floatVariable +" = "+ divideShortAndFloat);

////long


        long plusLongAndSByte = longVariable + byteVariable;
        long plusLongAndShort = longVariable + shortVariable;
        long plusLongAndLong = longVariable + longVariable;
        double plusLongAndDouble = longVariable + doubleVariable;
        double plusLongAndFloat = longVariable + floatVariable;

        System.out.println("");
        System.out.println("long and byte -> " + longVariable +" + "+ byteVariable +" = "+ plusLongAndSByte);
        System.out.println("long and short ->" + longVariable +" + "+ shortVariable +" = "+   plusLongAndShort);
        System.out.println("long and long ->" + longVariable +" + "+ longVariable +" = "+   plusLongAndLong);
        System.out.println("long and double ->" + longVariable +" + "+ doubleVariable +" = "+   plusLongAndDouble);
        System.out.println("long and float -> " + longVariable +" + "+ floatVariable +" = "+   plusLongAndFloat);


        long minusLongAndSByte = longVariable - byteVariable;
        long minusLongAndShort = longVariable - shortVariable;
        long minusLongAndLong = longVariable - longVariable;
        double minusLongAndDouble = longVariable - doubleVariable;
        double minusLongAndFloat = longVariable - floatVariable;

        System.out.println("");
        System.out.println("long and byte -> " + longVariable +" - "+ byteVariable +" = "+ minusLongAndSByte);
        System.out.println("long and short -> " + longVariable +" - "+ shortVariable +" = "+ minusLongAndShort);
        System.out.println("long and long -> " + longVariable +" - "+ longVariable +" = "+ minusLongAndLong);
        System.out.println("long and double -> " + longVariable +" - "+ doubleVariable +" = "+ minusLongAndDouble);
        System.out.println("long and float -> " + longVariable +" - "+ floatVariable +" = "+ minusLongAndFloat);


        long myltiplyLongAndSByte = longVariable * byteVariable;
        long myltiplyLongAndShort = longVariable * shortVariable;
        long myltiplyLongAndLong = longVariable * longVariable;
        double myltiplyLongAndDouble = longVariable * doubleVariable;
        double myltiplyLongAndFloat = longVariable * floatVariable;

        System.out.println("");
        System.out.println("long and byte -> " + longVariable +" * "+ byteVariable +" = "+ myltiplyLongAndSByte);
        System.out.println("long and short -> " + longVariable +" * "+ shortVariable +" = "+ myltiplyLongAndShort);
        System.out.println("long and long -> " + longVariable +" * "+ longVariable +" = "+ myltiplyLongAndLong);
        System.out.println("long and double -> " + longVariable +" * "+ doubleVariable +" = "+ myltiplyLongAndDouble);
        System.out.println("long and float -> " + longVariable +" * "+ floatVariable +" = "+ myltiplyLongAndFloat);


        long divideLongAndSByte = longVariable / byteVariable;
        long divideLongAndShort = longVariable / shortVariable;
        long divideLongAndLong = longVariable / longVariable;
        double divideLongAndDouble = longVariable / doubleVariable;
        double divideLongAndFloat = longVariable / floatVariable;

        System.out.println("");
        System.out.println("long and byte -> " + longVariable +" / "+ byteVariable +" = "+ divideLongAndSByte);
        System.out.println("long and short -> " + longVariable +" / "+ shortVariable +" = "+ divideLongAndShort);
        System.out.println("long and long -> " + longVariable +" / "+ longVariable +" = "+ divideLongAndLong);
        System.out.println("long and double -> " + longVariable +" / "+ doubleVariable +" = "+ divideLongAndDouble);
        System.out.println("long and float -> " + longVariable +" / "+ floatVariable +" = "+ divideLongAndFloat);



 ///double

        long plusDoubleAndSByte = longVariable + byteVariable;
        long plusDoubleAndShort = longVariable + shortVariable;
        long plusDoubleAndLong = longVariable + longVariable;
        double plusDoubleAndDouble = longVariable + doubleVariable;
        double plusDoubleAndFloat = longVariable + floatVariable;

        System.out.println("");
        System.out.println("double and byte -> " + doubleVariable +" + "+ byteVariable +" = "+ plusDoubleAndSByte);
        System.out.println("double and short ->" + doubleVariable +" + "+ shortVariable +" = "+   plusDoubleAndShort);
        System.out.println("double and long ->" + doubleVariable +" + "+ longVariable +" = "+   plusDoubleAndLong);
        System.out.println("double and double ->" + doubleVariable +" + "+ doubleVariable +" = "+   plusDoubleAndDouble);
        System.out.println("double and float -> " + doubleVariable +" + "+ floatVariable +" = "+   plusDoubleAndFloat);


        long minusDoubleAndSByte = longVariable - byteVariable;
        long minusDoubleAndShort = longVariable - shortVariable;
        long minusDoubleAndLong = longVariable - longVariable;
        double minusDoubleAndDouble = longVariable - doubleVariable;
        double minusDoubleAndFloat = longVariable - floatVariable;

        System.out.println("");
        System.out.println("double and byte -> " + doubleVariable +" - "+ byteVariable +" = "+ minusDoubleAndSByte);
        System.out.println("double and short -> " + doubleVariable +" - "+ shortVariable +" = "+ minusDoubleAndShort);
        System.out.println("double and long -> " + doubleVariable +" - "+ longVariable +" = "+ minusDoubleAndLong);
        System.out.println("double and double -> " + doubleVariable +" - "+ doubleVariable +" = "+ minusDoubleAndDouble);
        System.out.println("double and float -> " + doubleVariable +" - "+ floatVariable +" = "+ minusDoubleAndFloat);


        long myltiplyDoubleAndSByte = longVariable * byteVariable;
        long myltiplyDoubleAndShort = longVariable * shortVariable;
        long myltiplyDoubleAndLong = longVariable * longVariable;
        double myltiplyDoubleAndDouble = longVariable * doubleVariable;
        double myltiplyDoubleAndFloat = longVariable * floatVariable;

        System.out.println("");
        System.out.println("double and byte -> " + doubleVariable +" * "+ byteVariable +" = "+ myltiplyDoubleAndSByte);
        System.out.println("double and short -> " + doubleVariable +" * "+ shortVariable +" = "+ myltiplyDoubleAndShort);
        System.out.println("double and long -> " + doubleVariable +" * "+ longVariable +" = "+ myltiplyDoubleAndLong);
        System.out.println("double and double -> " + doubleVariable +" * "+ doubleVariable +" = "+ myltiplyDoubleAndDouble);
        System.out.println("double and float -> " + doubleVariable +" * "+ floatVariable +" = "+ myltiplyDoubleAndFloat);


        long divideDoubleAndSByte = longVariable / byteVariable;
        long divideDoubleAndShort = longVariable / shortVariable;
        long divideDoubleAndLong = longVariable / longVariable;
        double divideDoubleAndDouble = longVariable / doubleVariable;
        double divideDoubleAndFloat = longVariable / floatVariable;

        System.out.println("");
        System.out.println("double and byte -> " + doubleVariable +" / "+ byteVariable +" = "+ divideDoubleAndSByte);
        System.out.println("double and short -> " + doubleVariable +" / "+ shortVariable +" = "+ divideDoubleAndShort);
        System.out.println("double and long -> " + doubleVariable +" / "+ longVariable +" = "+ divideDoubleAndLong);
        System.out.println("double and double -> " + doubleVariable +" / "+ doubleVariable +" = "+ divideDoubleAndDouble);
        System.out.println("double and float -> " + doubleVariable +" / "+ floatVariable +" = "+ divideDoubleAndFloat);


 ////float

        long plusFloatAndSByte = longVariable + byteVariable;
        long plusFloatAndShort = longVariable + shortVariable;
        long plusFloatAndLong = longVariable + longVariable;
        double plusFloatAndDouble = longVariable + doubleVariable;
        double plusFloatAndFloat = longVariable + floatVariable;

        System.out.println("");
        System.out.println("float and byte -> " + floatVariable +" + "+ byteVariable +" = "+ plusFloatAndSByte);
        System.out.println("float and short ->" + floatVariable +" + "+ shortVariable +" = "+   plusFloatAndShort);
        System.out.println("float and long ->" + floatVariable +" + "+ longVariable +" = "+   plusFloatAndLong);
        System.out.println("float and double ->" + floatVariable +" + "+ doubleVariable +" = "+   plusFloatAndDouble);
        System.out.println("float and float -> " + floatVariable +" + "+ floatVariable +" = "+   plusFloatAndFloat);


        long minusFloatAndSByte = longVariable - byteVariable;
        long minusFloatAndShort = longVariable - shortVariable;
        long minusFloatAndLong = longVariable - longVariable;
        double minusFloatAndDouble = longVariable - doubleVariable;
        double minusFloatAndFloat = longVariable - floatVariable;

        System.out.println("");
        System.out.println("float and byte -> " + floatVariable +" - "+ byteVariable +" = "+ minusFloatAndSByte);
        System.out.println("float and short -> " + floatVariable +" - "+ shortVariable +" = "+ minusFloatAndShort);
        System.out.println("float and long -> " + floatVariable +" - "+ longVariable +" = "+ minusFloatAndLong);
        System.out.println("float and double -> " + floatVariable +" - "+ doubleVariable +" = "+ minusFloatAndDouble);
        System.out.println("float and float -> " + floatVariable +" - "+ floatVariable +" = "+ minusFloatAndFloat);


        long myltiplyFloatAndSByte = longVariable * byteVariable;
        long myltiplyFloatAndShort = longVariable * shortVariable;
        long myltiplyFloatAndLong = longVariable * longVariable;
        double myltiplyFloatAndDouble = longVariable * doubleVariable;
        double myltiplyFloatAndFloat = longVariable * floatVariable;

        System.out.println("");
        System.out.println("float and byte -> " + floatVariable +" * "+ byteVariable +" = "+ myltiplyFloatAndSByte);
        System.out.println("float and short -> " + floatVariable +" * "+ shortVariable +" = "+ myltiplyFloatAndShort);
        System.out.println("float and long -> " + floatVariable +" * "+ longVariable +" = "+ myltiplyFloatAndLong);
        System.out.println("float and double -> " + floatVariable +" * "+ doubleVariable +" = "+ myltiplyFloatAndDouble);
        System.out.println("float and float -> " + floatVariable +" * "+ floatVariable +" = "+ myltiplyFloatAndFloat);


        long divideFloatAndSByte = longVariable / byteVariable;
        long divideFloatAndShort = longVariable / shortVariable;
        long divideFloatAndLong = longVariable / longVariable;
        double divideFloatAndDouble = longVariable / doubleVariable;
        double divideFloatAndFloat = longVariable / floatVariable;

        System.out.println("");
        System.out.println("float and byte -> " + floatVariable +" / "+ byteVariable +" = "+ divideFloatAndSByte);
        System.out.println("float and short -> " + floatVariable +" / "+ shortVariable +" = "+ divideFloatAndShort);
        System.out.println("float and long -> " + floatVariable +" / "+ longVariable +" = "+ divideFloatAndLong);
        System.out.println("float and double -> " + floatVariable +" / "+ doubleVariable +" = "+ divideFloatAndDouble);
        System.out.println("float and float -> " + floatVariable +" / "+ floatVariable +" = "+ divideFloatAndFloat);

    }
}
