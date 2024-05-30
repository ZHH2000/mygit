
import HealthManagement.AdminInfoModifier;
import HealthManagement.HealthManagementLogin;
import HealthManagement.OnlineHealthConsultation;
import HealthManagement.PersonalHealthManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // ====》1.输出欢迎信息
        System.out.println("欢迎来到个人健康管理系统");

//        ====》2.循环程序，需要退出选择5退出
        while (true){
            // ====》（第一遍循环）3.显示服务选项
//            ====》（第二遍循环）17.显示服务选项
            System.out.println("1.登录");
            System.out.println("2.管理员修改密码");
            System.out.println("3.个人健康管理系统医师的登录注册");
            System.out.println("4.用户在线咨询");
            System.out.println("5.程序正常退出");
            System.out.println("请选择服务：");
//            ====》（第一遍循环）4.选择服务（选择1为例子）
//            ====》（第二遍循环）18.现在选择结束
            Scanner sc = new Scanner(System.in);
//            ====》（第一遍循环）5.输入1
//            ====》（第二遍循环）19.输入5
            int index = sc.nextInt();
//            ====》（第一遍循环）6.判断是不是1
//            ====》（第二遍循环）20.判断是不是1，现在选择的是5，继续下面的判断，一直到5
            if (index == 1){
//                ====》（第一遍循环）7.选择1的时候，加入HealthManagementLogin的Login方法
//                现在到HealthManagementLogin
                HealthManagementLogin.Login();
//                ====》（第一遍循环）15.回车继续，进入到Enter函数
                Enter();
//                ====》（第一遍循环）16.进行循环到17.
            }else if(index == 2){
                AdminInfoModifier.Modifier();
                Enter();
            }else if(index == 3){
                PersonalHealthManagement.doctor();
                Enter();
            }else if(index == 4){
                OnlineHealthConsultation.OnlineHealth();
                Enter();
            }else if(index == 5){
//                ====》（第二遍循环）21.判断是5
//                ====》（第二遍循环）22.选择5，关闭虚拟机，程序结束
                System.exit(0);
            }


        }

    }

    // 定义停顿方法，等待用户按回车继续
    public static void Enter() throws IOException  {//停顿
        System.out.println("按回车继续");
//        读取一行
        new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}