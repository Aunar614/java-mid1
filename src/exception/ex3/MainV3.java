package exception.ex3;

import exception.ex3.exception.NetworkClientExceptionV3;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) throws NetworkClientExceptionV3 {
        Scanner sc = new Scanner(System.in);
        // NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        // NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        // NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        // NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();

        while (true) {
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
