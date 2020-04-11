package com.bd10.demomq.controller;

import com.bd10.demomq.server.MQSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 王青
 * @version V1.0
 * @Project: demo-mq
 * @Package com.bd10.demomq.controller
 * @date 2020/3/11 20:12 星期三
 */
@Controller
public class MQController {
    @Resource
    private MQSender  mqSender;
    @RequestMapping("/fa")
    public  void test(String  msg){
        mqSender.fasong(msg);
    }

    @RequestMapping("/init")
    public  String init(){
        return "test";
    }

    @RequestMapping("/topic")
    public   void  topic(String msg){
        mqSender.topic(msg);
    }
}
