package fr.test.poc.pocb.api;

import fr.test.poc.pocb.aspect.PocAnnotation;

public class PocService {

  @PocAnnotation()
  public String getValue() {
    return "Hello POC";
  }

}
