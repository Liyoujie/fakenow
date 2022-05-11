package com.li;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@Slf4j
@SpringBootApplication
public class FakenowApplication {

    public static void main(String[] args) {
        SpringApplication.run(FakenowApplication.class, args);
        log.info("项目启动成功！");
    }

}
