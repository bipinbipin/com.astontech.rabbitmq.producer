package demo;

import demo.performance.Stopwatch;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Created by bipin on 4/25/2017.
 */
@Component
public class Producer implements CommandLineRunner {


    private final RabbitTemplate rabbitTemplate;
    private final ConfigurableApplicationContext context;

    public Producer(RabbitTemplate rabbitTemplate, ConfigurableApplicationContext context) {
        this.rabbitTemplate = rabbitTemplate;
        this.context = context;
    }

    final static String QUEUE_NAME = "spring-boot";
    final static String MSG_NAME = "Bipin Produced Message";

    @Override
    public void run(String... args) throws Exception {


        Stopwatch timer = new Stopwatch();
        IntStream.range(1, 100000)
//                .parallel()
                .forEach(i -> {

//                    System.out.println("Sending message...");
                    rabbitTemplate.convertAndSend(QUEUE_NAME, new MessagePOJO(MSG_NAME + i, UUID.randomUUID().toString()));


                });

        System.out.println("Time Elapsed: " + timer.elapsedTime());

//        for(int i=0; i< 1000; i++) {
//
//            System.out.println("Sending message...");
//            rabbitTemplate.convertAndSend(QUEUE_NAME, new MessagePOJO(MSG_NAME, UUID.randomUUID().toString()));
//        }
//        for(int i=0; i < 100; i++) {
//            System.out.println("Sending message...");
//            rabbitTemplate.convertAndSend(Application.queueName, "Hello from RabbitMQ!");
////            receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
//
//        }

        //context.close();
    }

    void forStream() {

    }

    public void sendObject(Object object) {

    }

}
