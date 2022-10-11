package com.wliang;

import com.wliang.service.KafkaProducerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class KafkaProducerApplicationTest {
    @Autowired
    private KafkaProducerService producerService;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${spring.kafka.topic-name}")
    private String topicName;

    @Test
    public void cotextLoads() {
        producerService.sendMessage(topicName, "测试");
    }
}
