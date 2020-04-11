package com.bd10.demomq.server;

import org.apache.activemq.command.ActiveMQQueue;
;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王青
 * @version V1.0
 * @Project: demo-mq
 * @Package com.bd10.demomq.server
 * @date 2020/3/11 20:04 星期三
 */
@Component
public class MQSender {
    @Autowired
    private JmsTemplate  jmsTemplate;
    //点对点模式
    public  void   fasong(String  message){
        ActiveMQQueue  queue=new ActiveMQQueue("wq33");
        //WQ  在  MQ  里面生成了一个频道
        jmsTemplate.convertAndSend(queue,message);
    }
    //发布订阅模式
    public void   topic(String  message){
        ActiveMQTopic  topic1=new ActiveMQTopic("wq22");
        jmsTemplate.convertAndSend(topic1,message);
    }

}
