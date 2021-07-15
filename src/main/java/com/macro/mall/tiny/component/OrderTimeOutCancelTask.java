package com.macro.mall.tiny.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class OrderTimeOutCancelTask {
    private Logger LOGGER = LoggerFactory.getLogger(OrderTimeOutCancelTask.class);

    /**
     * cron表达式:Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * 每十分钟扫表一次,扫描设定超时时间之前下的订单,如果没有支付则取消该订单
     */
    @Scheduled(cron = "0 0/10 * ? * ?")
    private void cancelTimeOutOrder() {
        LOGGER.info("取消订单,并根据sku编号释放锁定库存");
    }
}
