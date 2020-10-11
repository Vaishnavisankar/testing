package com.maveric.demobank.runner;

import java.util.HashMap;

import org.junit.runner.RunWith;

import com.maveric.demobank.common.SeMethods;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\ravipa\\JAVA\\DemoBank\\src\\test\\java\\com\\maveric\\demobank\\features\\login.feature",
	glue="com.maveric.demobank.stepdef",
	tags="@login",
	plugin={"pretty","html:target/cucumber","json:target/cucumber.json"})
	
		
		
public class TestRunner extends SeMethods {
	public static HashMap<String,SeMethods> tcObjs = new  HashMap<String,SeMethods>();
}
