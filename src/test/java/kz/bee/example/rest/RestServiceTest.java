package kz.bee.example.rest;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;

import javax.inject.Inject;

import kz.bee.example.ejb.EjbService;

@RunWith(Arquillian.class)
public class RestServiceTest {

  @Deployment
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
        .addClasses(RestService.class, EjbService.class)
        .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

  @Inject
  RestService restService;

  @Test
	public void testSayHelloA() {
	  String response = restService.sayHello("Tair");
	  
	  assertEquals(response, "Hello, Tair");
	  
	}
}
