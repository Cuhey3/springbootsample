package com.heroku.myapp.springbootsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @Autowired
  Zone zone;

  @RequestMapping(method = RequestMethod.GET)
  public String hello() {
    return zone.foo.bar;
  }
}
