/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.ward.Console;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author dalen
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, URISyntaxException, IOException {
        // TODO code application logic here
        Console console = new Console();
        
        console.build(500, 500, "TEST");
        
        System.out.println(console.answer());
    }
    
}
