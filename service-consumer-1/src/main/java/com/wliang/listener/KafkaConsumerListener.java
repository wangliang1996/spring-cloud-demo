package com.wliang.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author wliang
 * @description TODO
 * @date 2022-09-03 15:08
 */
@Component
public class KafkaConsumerListener {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = {"${spring.kafka.topic-name}"})
    public void listenerMessage(ConsumerRecord<String, String> record) {
        logger.info("接收到kafka消息键为:{},消息值为:{},消息头为:{},消息分区为:{},消息主题为:{}", record.key(), record.value(), record.headers(), record.partition(), record.topic());
    }
}
