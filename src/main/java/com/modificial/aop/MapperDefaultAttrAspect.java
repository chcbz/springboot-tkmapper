package com.modificial.aop;

import com.modificial.entity.BaseEntity;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自定义注解 + AOP的方式实现数据源动态切换
 */
@Aspect
@Component
public class MapperDefaultAttrAspect {

    @Before("execution(* com.modificial.mapper.*.insert*(..))")
    public void beforeSwitchDS(JoinPoint point) {
        Object[] obj = point.getArgs();
        for (Object argItem : obj) {
            System.out.println("---->now-->argItem:" + argItem);
            if (argItem instanceof BaseEntity) {
                BaseEntity paramVO = (BaseEntity) argItem;
                Date date = new Date();
                paramVO.setCreateTime(date);
                paramVO.setUpdateTime(date);
                paramVO.setStatus(1);
            }
            System.out.println("---->after-->argItem:" + argItem);
        }


    }

}