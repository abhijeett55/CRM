package com.crmecosystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

import lombok.extern.slf4j.Slf4j;




@EnableAsync
@Configuration
@Slf4j
public class AsyncConfig implements AsyncConfigurer {
    private static final int CORE_POOL_SIZE = 20;
    private static final int MAX_POOL_SIZE = 20;
    private static final int KEEP_ALIVE_SECONDS = 60;
    private static final int AWAIT_TERMINATION_SECONDS = 60;

}