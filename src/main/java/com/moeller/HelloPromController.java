package com.moeller;

import io.prometheus.client.Counter;
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

  private static final Counter requests = Counter.build().name("bernd_requests_cnt").help("Total requests").register();
  private static final Logger LOGGER = LoggerFactory.getLogger(HelloPromController.class);



  @RequestMapping("/")
  public String index() {
    LOGGER.debug("Basic Request called");
    requests.inc();
    return "Greetings from Spring Boot!";
  }
}
