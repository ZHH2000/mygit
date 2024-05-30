package HealthManagement;
//个人健康管理系统java代码医师的登录注册
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalHealthManagement {

    // 存储医师信息（模拟）
    private static Map<String, String> doctorInfo = new HashMap<>();

    public static void doctor() {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. 医师注册");
            System.out.println("2. 医师登录");
            System.out.println("3. 退出");

            System.out.print("请选择： ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerDoctor(scanner);
                    break;
                case 2:
                    loginDoctor(scanner);
                    break;
            }
        } while (choice!= 3);
    }

    public static void registerDoctor(Scanner scanner) {
        System.out.print("请输入医师用户名： ");
        String username = scanner.next();

        System.out.print("请输入密码： ");
        String password = scanner.next();

        doctorInfo.put(username, password);
        System.out.println("注册成功！");
    }

    public static void loginDoctor(Scanner scanner) {
        System.out.print("请输入医师用户名： ");
        String username = scanner.next();

        System.out.print("请输入密码： ");
        String password = scanner.next();

        if (doctorInfo.containsKey(username) && doctorInfo.get(username).equals(password)) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }
}
