package ua.kpi.model;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
  public int add (int first, int second){
    return first+second;
  }

}
