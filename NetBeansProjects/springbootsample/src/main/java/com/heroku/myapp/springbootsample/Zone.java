package com.heroku.myapp.springbootsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zone {

  @Autowired
  public Foo foo;

  public Zone(Foo foo) {
  }
}
