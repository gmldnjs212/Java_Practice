package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        
        // 1
        final String KR_COUNTRY_CODE = "+82"; // ( 대한민국 국가번호 )
        // KR_COUNTRY_CODE = "+92"; > 상수의 값은 변경할 수 없기 때문에 에러발생
        System.out.println((KR_COUNTRY_CODE));
        
        // 2
        final double PI = 3.141592; // 원주율
        final String DATE_OF_BIRTH = "2001-12-31"; // 생년월일

    }
}
