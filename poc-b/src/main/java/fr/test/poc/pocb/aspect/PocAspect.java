package fr.test.poc.pocb.aspect;

import fr.test.poc.pocb.spi.ExternalServiceSpi;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PocAspect {

  private ExternalServiceSpi externalService;

  public void setExternalService(ExternalServiceSpi externalService) {
    this.externalService = externalService;
  }

  @Pointcut("@annotation(pocAnnotation)")
  public void pocAnnotationPointcut(PocAnnotation pocAnnotation) {}

  @Before(
    value = "pocAnnotationPointcut(pocAnnotation)",
    argNames = "pocAnnotation")
  public void pocAnnotation(JoinPoint jp, PocAnnotation pocAnnotation) {
    System.out.println("externalService.isValid(): " + externalService.isValid());
  }

}
