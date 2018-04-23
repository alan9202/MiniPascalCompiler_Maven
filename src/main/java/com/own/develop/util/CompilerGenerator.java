package com.own.develop.util;

import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
import java_cup.internal_error;

public class CompilerGenerator {
    final static Logger logger = Logger.getLogger(CompilerGenerator.class);
    
    public static void generateLexicographic() {
        logger.info("Starting lexicographic generator.");
        
        GetResourcesFile resources = new GetResourcesFile();
        File inputFile = resources.getResourcesFile("Lexicografico.flex");
        
        jflex.Main.generate(inputFile);
        
        logger.info("Ending lexicographic generator.");
    }

    public static void generateSintactic() {
        try {
            logger.info("Starting sintactic generator..");
            
            GetResourcesFile resources = new GetResourcesFile();
            File inputFile = resources.getResourcesFile("Sintactico.cup");
            
            String[] asintactico = { "-parser", "SintacticAnalyzer", inputFile.getPath() };
            
            java_cup.Main.main(asintactico);
            
            logger.info("Finalizo generacion de clase para el analisis sintactico.");
        } catch (IOException ex) {
            logger.error(ex.getMessage(), ex);
        } catch (internal_error ex) {
            logger.error(ex.getMessage(), ex);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
    }
}
