import java.util.Arrays;

public class CodingTestGrammar {

    public static void main(String[] args) {

        String str = "apple";

        // 길이 반환
        System.out.println(str.length());

        // 빈 문자열 체크
        System.out.println(str.isEmpty());

        // 문자 찾기
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("e"));

        // 문자열 자르기
        System.out.println(str.substring(2));

        // 문자열 치환
        System.out.println(str.replace("p", "t"));
        System.out.println(str.replaceAll(".", "a")); // 정규식 이용

        // 첫번째 문자만 치환
        System.out.println(str.replaceFirst("p", "e"));

        // 문자열 동일 여부 판단
        System.out.println(str.equals("appl"));

        // 문자열 비교
        System.out.println(str.compareTo("abcde")); // ?

        // 문자 포함여부
        System.out.println(str.contains("app"));

        // 문자열 분리
        System.out.println(Arrays.toString(str.split("")));

        // 문ㅌ자 앞뒤 공백 제거
        System.out.println(str.trim());

        // 문자 <-> 숫자 변환
        System.out.println(Integer.parseInt("100"));
        System.out.println(Integer.toString(100));
    }
}