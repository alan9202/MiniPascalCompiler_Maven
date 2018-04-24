package com.own.develop.compiler;

import java.io.File;

import com.own.develop.util.GetResourcesFile;

import org.junit.Test;

public class SintacticAnalyzerTest {
    
    @Test
    public void testExect() {
        GetResourcesFile resources = new GetResourcesFile();
        
        File inputFile = resources.getResourcesFile("test.ps");
        
        SintacticAnalyzer.exect(inputFile);
    }
}