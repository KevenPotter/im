package cn.kevenpotter.im.im.client.console;

import cn.kevenpotter.im.im.protocol.request.LoginRequestPacket;
import io.netty.channel.Channel;

import java.util.Scanner;

public class LoginConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        LoginRequestPacket loginRequestPacket = new LoginRequestPacket();
        System.out.println("输入用户名登录: ");
        loginRequestPacket.setUserName(scanner.next());
        loginRequestPacket.setPassword("pwd");
        channel.writeAndFlush(loginRequestPacket);
        waitForLoginResponse();
    }

    private static void waitForLoginResponse() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
