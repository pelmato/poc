package fr.test.poc.poca;

import fr.test.poc.pocb.spi.ExternalServiceSpi;
import org.springframework.stereotype.Component;

@Component
public class ExternalServiceImpl implements ExternalServiceSpi {

  @Override
  public boolean isValid() {
    return true;
  }

}
