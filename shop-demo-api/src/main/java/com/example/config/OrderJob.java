package com.example.config;

import com.example.utils.DateUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @className: OrderJob
 * @author: YanBo
 * @date: 2023/8/9 16:28
 */
@Component
public class OrderJob {
    @Scheduled(cron = "0/3 * * * * ?")
    public void autoCloseOrder() {
        System.out.println("执行任务，当前时间" + DateUtil.getCurrentDateString(DateUtil.DATETIME_PATTERN));
    }
}
