package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @className: ServiceLogAspect
 * @author: YanBo
 * @date: 2023/8/7 10:25
 */

@Aspect
@Component
public class ServiceLogAspect {
    public static final Logger log = LoggerFactory.getLogger(ServiceLogAspect.class);

    @Around("execution(* com.example.service.impl..*.*(..))")
    public Object recordTimeLog(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("==== 开始执行 {} . {}======", joinPoint.getTarget().getClass(), joinPoint.getSignature().getName());
        Long begin = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        Long end = System.currentTimeMillis();

        Long takeTime = end - begin;

        if (takeTime > 3000) {
            log.error("======执行结束时间 耗时：{}", takeTime);
        } else if (takeTime > 2000) {
            log.warn("======执行结束时间 耗时：{}", takeTime);
        } else {
            log.info("======执行结束时间 耗时：{}", takeTime);
        }

        return  result;
    }
}
