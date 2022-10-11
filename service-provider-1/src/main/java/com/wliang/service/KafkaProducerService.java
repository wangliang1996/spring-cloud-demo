package com.wliang.service;

/**
 * @author wliang
 * @description 卡夫卡消息发送服务
 * @date 2022-09-03 15:03
 */
public interface KafkaProducerService {
    /**
     * 发送普通消息
     * @param topic
     * @param data
     */
    void sendMessage(String topic, String data);
}
