package com.wliang.service.impl;

import com.wliang.service.KafkaProducerService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author wliang
 * @description KafkaProducerServiceImpl
 * @date 2022-09-03 15:04
 */
@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerServiceImpl(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(String topic, String data) {
        kafkaTemplate.send(topic, data);
    }
}
