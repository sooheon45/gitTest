package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.CatShipApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CatShipApplication.class })
public class CucumberSpingConfiguration {}
