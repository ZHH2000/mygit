package HealthManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//登录
public class HealthManagementLogin {

    public static void Login() {
        // 模拟存储用户名和密码
//        ====》8.创建Map实体
        Map<String, String> users = new HashMap<>();
//        ====》9.Map添加键值对
        users.put("user1", "pass1");
        users.put("user2", "pass2");
//      ====》10.调用login函数，传入users，现在进入login方法
        login(users);
//        ====》14.函数结束返回上一层Main
    }

    public static void login(Map<String, String> users) {
        Scanner scanner = new Scanner(System.in);

//        ====》11.输入用户名和密码
        System.out.print("请输入用户名： ");
        String username = scanner.nextLine();

        System.out.print("请输入密码： ");
        String password = scanner.nextLine();

//        ====》12.判断users里面有没有这个用户名，如果有则取出密码，判断密码是否正确，正确则登录成功
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
//        ====》13.函数结束返回上一层Login
    }
}