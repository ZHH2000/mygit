package HealthManagement;
import java.util.Scanner;
//管理员修改密码
public class AdminInfoModifier {

    public static void Modifier() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入管理员账号：");
        String adminAccount = scanner.nextLine();

        System.out.println("请输入原密码：");
        String oldPassword = scanner.nextLine();

        // 模拟验证原密码是否正确
        boolean isPasswordCorrect = true; // 实际中应进行密码验证

        if (!isPasswordCorrect) {
            System.out.println("原密码错误");
            return;
        }

        System.out.println("请输入新密码：");
        String newPassword = scanner.nextLine();

        System.out.println("请输入新的账户信息（如姓名等）：");
        String newAccountInfo = scanner.nextLine();

        // 这里可以进行实际的密码和账户信息修改操作
        System.out.println("密码和账户信息修改成功");
    }
}
