package com.tkpark.bike.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
@Slf4j
public class Scheduler {

    @Scheduled(cron = "0 0 4 * * *")
    public void test() {
        log.info("Scheduler.test() Start");

        log.info("Scheduler.test() End");
    }
}
