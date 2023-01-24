package chap_01;

import com.sun.beans.editors.DoubleEditor;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93 int
        System.out.println((float)score); // 93.0 int to float
        System.out.println((double)score); // 93.0 int to double

        // float, double to int
        float score_f = 93.3F; // float
        double score_d = 98.8; // double
        System.out.println((int)score_f); // float to int
        System.out.println((int)score_d); // double to int

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score);

        score_d = 93 + 98.8; // 93.0 + 98.8 , 정수가 double타입으로 자동형변환 처리됨
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동형변환)

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93); // String.valueOf(값)
        s1 = Integer.toString(93); // Integer.toString(값)
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

    }
}
