package org.example.rabbit_mq.listener;

import org.example.rabbit_mq.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "test-queue")
    public void handleMessage(Notification notification) {
        System.out.println("Mesaj Alındı...");
        System.out.println(notification.toString());
    }
}
