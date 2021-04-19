package ua.kpi.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ua.kpi.model.Calculator;
import ua.kpi.view.View;


@Component
public class Controller {
  private Calculator calculator;
  private View view;

  @Value("${controller.first}")
  private int first;

  @Value("${controller.second}")
  private int second;


  public Controller(Calculator calculator, View view) {
    this.calculator = calculator;
    this.view = view;
  }

  public void process(){
    int res = calculator.add(first, second);
    view.print(first + " + "+ second + "=" + res);

  }

}
