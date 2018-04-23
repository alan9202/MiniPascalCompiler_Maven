package com.own.develop.util;

import java.io.File;

public class GetResourcesFile {
    
    public File getResourcesFile(String file) {
        return new File(this.getClass().getClassLoader().getResource(file).getFile());
    }
}
