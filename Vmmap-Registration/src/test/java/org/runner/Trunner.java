package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prakash\\eclipse-workspace\\practice\\Vmmap-Registration\\src\\test\\resources\\reg.feature\\regi.feature",
                 glue="org.sd",
                 dryRun=false)


public class Trunner {

}
