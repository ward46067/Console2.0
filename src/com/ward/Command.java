/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ward;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 *
 * @author dalen
 */
public class Command {
    
    private int historyLimit;
    
    /**
     * Checks through preset console commamds.  
     */
    public static void commandCheck(String command) throws URISyntaxException, IOException {
        if(command.equals("///shutdown")){
           shutdown();
        }
        else if(command.equals("///restart")){
           restart(); 
        }
        else {
            
        }
    }
    
    /**
     * Shuts down the program from console
     */
    private static void shutdown(){
        System.exit(0);
    }
    
    /**
     * Restarts the program by finding the source jar file. 
     * @throws URISyntaxException
     * @throws IOException 
     */
    private static void restart() throws URISyntaxException, IOException{
        final String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
        final File currentJar = new File(Command.class.getProtectionDomain().getCodeSource().getLocation().toURI());
        
        /* is it a jar file? */
        if(!currentJar.getName().endsWith(".jar"))
          return;
        
        /* Build command: java -jar application.jar */
        final ArrayList<String> command = new ArrayList<String>();
        command.add(javaBin);
        command.add("-jar");
        command.add(currentJar.getPath());

        final ProcessBuilder builder = new ProcessBuilder(command);
        builder.start();
        System.exit(0);
        System.out.println("Still a work in progress. ");
    }
    
    /*
    public void createCommand(String command){
        
    }
    */
    
    /*
    public void setHistoryLimit(int limit){
        this.historyLimit = limit;
    }
    */
}
