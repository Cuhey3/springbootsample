package com.heroku.myapp.springbootsample;

import org.springframework.stereotype.Component;

@Component
public class Foo {

  public String bar;

  public Foo() {
    bar = "wao";
  }
}
