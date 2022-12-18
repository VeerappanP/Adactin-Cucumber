package com.maven.loginwithdifferentvaliddata;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\com\\maven\\loginwithdifferentvaliddata\\Feature file\\Adactin.feature"},
		dryRun = !true,
		glue = "com.maven.loginwithdifferentvaliddata",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"html:Report/Adactinlogin.html"}
		)
public class RunnerClass {

	
}
