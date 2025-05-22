package fr.test.poc.poca.configuration;

import fr.test.poc.pocb.api.PocService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectionConfig {

  @Bean
  PocService pocService() {
    return new PocService();
  }

}
