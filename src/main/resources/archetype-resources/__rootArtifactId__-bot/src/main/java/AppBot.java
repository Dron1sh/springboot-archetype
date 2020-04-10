package ${package};

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class AppBot {

    public static void main(String[] args) {

        /**
         * @since dubbo starter version 0.1.1 add AwaitingNonWebApplicationListener
         */
        ApplicationContext ctx = new SpringApplicationBuilder(AppBot.class).web(false).run(args);

        System.out.println("Dubbo service server started");

    }

}
