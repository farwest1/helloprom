package com.moeller.managment;

import io.prometheus.client.Counter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Created by Bernd on 30.07.2017.
 *
 * Package com.moeller.managment
 */
public class RequestMonitoringInterceptor extends HandlerInterceptorAdapter {

  private static final Logger LOGGER = LoggerFactory.getLogger(RequestMonitoringInterceptor.class);
  private static final Counter requests = Counter.build().name("bernd_requests_cnt2").help("Total requests in Interceptor").register();

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
      Object handler, Exception ex) throws Exception {
    LOGGER.debug("increment request counter");
    requests.inc();
  }
}
