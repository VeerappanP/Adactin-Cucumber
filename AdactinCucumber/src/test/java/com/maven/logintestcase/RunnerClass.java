package com.maven.logintestcase;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\com\\maven\\logintestcase\\Feature file\\logintestcase.feature"},
		dryRun = !true,
		glue = "com.maven.logintestcase",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"html:Report/Logintestcase.html"}
		)

public class RunnerClass  {
	
	

}
