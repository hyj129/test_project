package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
		// 톰켓이랑 웹 서버를 내장하고 있다.
		// 스프링부르와 톰켓이 자체적으로 실행됨
	}
}
