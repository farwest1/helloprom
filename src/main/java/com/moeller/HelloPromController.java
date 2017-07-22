package com.moeller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bernd on 22.07.2017.
 *
 * Package com.moeller.api
 */
@RestController
public class HelloPromController {

  @RequestMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }
}
