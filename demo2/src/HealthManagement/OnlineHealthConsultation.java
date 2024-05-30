package HealthManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//用户在线咨询
public class OnlineHealthConsultation {

    public static void OnlineHealth() {
        Map<String, String> healthQuestions = new HashMap<>();
        healthQuestions.put("头疼怎么办", "可能是休息不好或压力大，建议多休息观察。");
        healthQuestions.put("感冒了吃什么药", "需要根据具体症状判断，多喝水，注意休息。");

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的健康问题：");
        String question = scanner.nextLine();

        if (healthQuestions.containsKey(question)) {
            System.out.println(healthQuestions.get(question));
        } else {
            System.out.println("抱歉，没有找到相关问题的答案。");
        }
    }
}