package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.CatApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CatApplication.class })
public class CucumberSpingConfiguration {}
