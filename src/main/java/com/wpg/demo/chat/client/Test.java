package com.wpg.demo.chat.client;

import com.wpg.demo.chat.server.ChatServer;

/**
 * @author dingsl
 * @description
 * @date 2020/12/29
 */
public class Test {
    public static void main(String[] args) throws Exception {
        new ChatClient("127.0.0.1", 9070).start();
    }
}
