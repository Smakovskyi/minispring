package ua.kpi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ua.kpi.controller.Controller;
import ua.kpi.model.Calculator;
import ua.kpi.view.View;

@Configuration
@PropertySource("classpath:config.properties")
public class Config {
/*
  @Bean
  public Controller controller(Calculator calculator, View view){
    return new Controller(calculator, view);
  }

  @Bean
  public View view(){
    return new View();
  }

  @Bean
  public Calculator calculator(){
    return new Calculator();
  }
*/

}
