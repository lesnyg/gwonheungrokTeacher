import java.sql.SQLOutput;

public class Main {
    final static  int MAN_AGE = 30;     //정적상수
    final static  int WOMAN_AGE = 40;   //정적상수
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        stringOperatorTest1();
//            int value = 356;
//        System.out.println(value-value%100);

//        displayMulNumber(17, 4);
//        System.out.println();



        System.out.println(checkYoung(true, 35));
        System.out.println(checkYoung(false, 35));
    }

    private static String checkYoung(boolean man, int age) {
//        String result;
//        if (man) {
//            result = (age >= MAN_AGE) ? "He is Old" : "He is  Young";
//        } else {
//            result = (age >= WOMAN_AGE) ? "She is Old" : "She is  Young";
//        }
        return (man == true)?  ( (age >= MAN_AGE) ? "He is Old" : "He is  Young") :
                ( (age >= WOMAN_AGE) ? "She is Old" : "She is  Young");

    }

    private static void displayMulNumber(int range, int base) {
        for (int i = 1; i < range + 1; i++) {
            if (i % base == 0) {
                System.out.println(base + "의 배수는" + i + "  입니다.");
            }
        }

    }

    static void primitiveDataType() { // 원시형 data type 8가지
       /*  특징
           -. unsigned (음수) data type 은 별도로 없으며 '-' 로 시작한다
           -. 이진수, 팔진수, 십진수, 십육진수 로 표현이 가능하다
           -. L(long),F(float),D(double) 써픽스는 data type 에 대한 확실함을 가져간다
           -. 실수는 지수표현이 가능하다
       */

        char alpha1 = 's'; // ASCII code (1 byte)
        char alpha2 = '김'; // char 형은 2 byte 를 지닌다 -  for Unicode
        byte bit8 = 127;
        short bit16 = 32767;
        int bit32b = 0b00000001000000010000000100000001; // 2진수 - 0b 로 시작
        int bit32d = 80000; // 10진수
        int bit32o = 07777777777;  // 8진수 - 0 으로 시작
        int bit32h = 0xffffffff; // 16진수 - 0x 로 시작,안드로이드 color 값 표현시 16진수 사용 (RGB)
        int bit32u = -20000000; // 음수
        long bit64 = 100000000L;

        float float32 = -3.22F; // 실수 32 bit
        double double1 = 0.0000012D; // 실수 64 bit
        double double2 = 0.12E-5; // 0.12*10 -5
        if (double1 == double2)
            System.out.printf("double is same \n");

        boolean bool = true;
    }

    static void typeCastingTest1() { // auto casting
        char c1 = 'a';
        byte b1 = 10;
        short s1 = 10;
        int i1 = 10;
        long l1 = 10L;
        float f1 = 10.1F;
        double d1 = 10.1D;

        //c1 = b1 ; // byte --> char (X)
        //s1 = c1 ; // char --> short (X)
        i1 = c1; // char --> int
        f1 = i1; // int --> float
        d1 = i1; // int --> double
        f1 = l1; // long --> float
        d1 = l1; // long --> double
        d1 = f1; // float --> double


    }

    static void typeCastingTest2() { // explicit casting
        char c1 = 'a';
        byte b1 = 10;
        short s1 = 10;
        int i1 = 10;
        long l1 = 10L;
        float f1 = 10.1F;
        double d1 = 10.1D;
        String str1 = "abcde";

        d1 = (double) i1;
        b1 = (byte) i1;
        i1 = (int) d1;
        // c1 = (char) str1 ; // Can't convert between char <--> string

        //byte result1 = b1+5 ; // Can't as using +-*% then result be must be int
        //short result2 = s1+5 ; // Can't
        int result3 = i1 + 5;
        float result4 = f1 + 5;
        double result5 = d1 + 5;
    }

    static void stringOperatorTest1() {
        String s1 = "abcde";
        String s2 = "12345";
        String s3 = s1 + s2;  // + 연산자 를 이용하여 string 결합 가능
        //String s3a = s1-s2 ;  // - 연산자 불가능
        String s4 = s3 + "kkk";
        System.out.printf("s4=%s \n", s4);
        String s5 = s4 + 12;  // Number 를 컴파일러가 String 으로 변환 한다
        System.out.printf("s5=%s \n", s5);

        String s6 = String.valueOf(12); // String 클래스가 제공하는 메소드 이용 (정수 --> String)
        String s7 = s4 + s6;
        System.out.printf("s7=%s \n", s7);

        int convert = Integer.parseInt("900904"); // 참고 (String --> int)
    }


}
