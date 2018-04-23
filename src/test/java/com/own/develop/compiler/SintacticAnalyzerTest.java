package com.own.develop.compiler;

import java.io.File;

import org.junit.Test;

import com.own.develop.util.GetResourcesFile;

public class SintacticAnalyzerTest {
    
    @Test
    public void testExect() {
        GetResourcesFile resources = new GetResourcesFile();
        
        File inputFile = resources.getResourcesFile("test.ps");
        
        SintacticAnalyzer.exect(inputFile);
    }
}
