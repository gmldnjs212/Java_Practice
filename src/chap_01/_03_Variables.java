package chap_01;

public class _03_Variables {
    public static void main(String[] args) {

        // 문자열자료형 변수명 ("여러글자")
        String name;
        name = "나도코딩";

        // 정수자료형 변수명
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        // 실수형
        double score = 90.5;

        // 문자자료형 변수명 ('한글자')
        char grade = 'A';

        // 변수 값 업데이트
        name = "강백호";

        System.out.println(name + "님의 평균점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        // 실수값은 기본적으로 double로 인식한다. > 보다 정밀한 소수 계산이 가능하다.
        double d = 3.14;
        // 만일 float에 값을 할당하고싶다면 다음과 같이 값 뒤에 f나 F를 같이 명시해줘야한다.
        // float는 정밀한 소수계산은 불가능하다.
        float f = 3.14f;
        float ff  = 3.14F;

        System.out.println(d);
        System.out.println(f);
        System.out.println(ff);

        // 큰 정수값을 변수에 할당하는 경우
        // int i = 1_000_000_000_000; // > int에 넣기에는 너무 큰 값
        // long i = 1_000_000_000_000; // > 끝에 l을 붙여줌으로써 long타입으로 변수생성
        long l = 1_000_000_000_000l;
        long ll = 1_000_000_000_000L;

        System.out.println(l);
        System.out.println(ll);

    }
}
