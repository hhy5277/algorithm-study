package com.algorithm.study.demo.algorithm;

/**
 * @Author: liuxun
 * @CreateDate: 2018/11/8 下午1:50
 * @Version: 1.0
 */
public class MainDemo {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            double redPacket = (Math.random() * (0.5 - 0.1) + 0.1);
            System.out.println(redPacket);
        }
        System.out.println((int)(Math.random()*0.9+0.1));
    }
}
