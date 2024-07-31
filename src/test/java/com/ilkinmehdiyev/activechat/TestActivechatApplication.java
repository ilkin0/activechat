package com.ilkinmehdiyev.activechat;

import org.springframework.boot.SpringApplication;

public class TestActivechatApplication {

	public static void main(String[] args) {
		SpringApplication.from(ActiveChatApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
