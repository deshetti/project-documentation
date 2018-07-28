package com.factly.documentation.cucumber.stepdefs;

import com.factly.documentation.DocumentationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = DocumentationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
