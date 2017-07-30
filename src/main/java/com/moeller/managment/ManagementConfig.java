package com.moeller.managment;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Bernd on 30.07.2017.
 *
 * Package com.moeller.managment
 */
@Configuration
public class ManagementConfig extends WebMvcConfigurerAdapter{

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new RequestMonitoringInterceptor()).addPathPatterns("/*");
  }
}
