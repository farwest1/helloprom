package com.moeller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bernd on 22.07.2017.
 *
 * Package com.moeller.api
 */
@RestController
public class HelloPromController {

  private final CounterService counterService;
  private static final Logger LOGGER = LoggerFactory.getLogger(HelloPromController.class);

  @Autowired
  public HelloPromController(CounterService counterService){
    this.counterService=counterService;
  }



  @RequestMapping("/")
  public String index() {
    LOGGER.debug("Basic Request called");
    this.counterService.increment("services.api.index.invoked");
    return "Greetings from Spring Boot!";
  }
}
