package org.jianyi.sample.springboot;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PreDestroy;

@Slf4j
public class TerminateBean {

    @PreDestroy
    public void onDestroy() throws Exception {
        //可以做任何你想回收资源的操作
        log.info("Application is shutdown!");
    }
}
