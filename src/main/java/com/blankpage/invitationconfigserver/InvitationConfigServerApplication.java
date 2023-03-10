package com.blankpage.invitationconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class InvitationConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(InvitationConfigServerApplication.class, args);
	}

}
