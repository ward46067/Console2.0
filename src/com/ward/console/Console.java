/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ward.console;

import java.awt.BorderLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author dalen
 */
public class Console {
    
    private int x = 300, y = 300; //global x and y size of console, 300 square by default
    private String title = "Console"; //title of the console, set to "Console" by default
    
    
    /**
     * 
     * @param x - Set the width of the console window. Default 300
     * @param y - Set the height of the console window. Default 300
     */
    public void setSize(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setSizeX(int x){
        this.x = x;
    }
    
    public void setSizeY(int y){
        this.y = y;
    }
    
    /**
     * 
     * @param title - Change the title of the console. Default "Console"
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * Builds the console.
     */
    public void build(){
        JFrame frame = new JFrame(title);
        JLabel title = new JLabel("Console");
        JTextArea console = new JTextArea();
        JTextField usrInput = new JTextField();
        JButton enter = new JButton("Enter");
        
        JScrollPane scroll = new JScrollPane(console);
        JPanel outerPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel bottomPanel = new JPanel(new BorderLayout());
        
        
        TextAreaOutputStream taos = TextAreaOutputStream.getInstance(console);
        
        frame.add(outerPanel);
        
        outerPanel.add(topPanel, BorderLayout.PAGE_START);
        outerPanel.add(mainPanel, BorderLayout.CENTER);
        outerPanel.add(bottomPanel, BorderLayout.PAGE_END);
        
        topPanel.add(title, BorderLayout.BEFORE_LINE_BEGINS);
        topPanel.setSize(600, 25);
        
        
        mainPanel.add(scroll, BorderLayout.CENTER);
        scroll.setSize(400, 400);
        
        bottomPanel.add(usrInput, BorderLayout.CENTER);
        bottomPanel.add(enter, BorderLayout.AFTER_LINE_ENDS);
        usrInput.setSize(350, 25);
        frame.getRootPane().setDefaultButton(enter);
        
         
        
        frame.pack();
        frame.setSize(x, y);
        console.setEditable(false);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        frame.show();
        
        DefaultCaret autoscroll = (DefaultCaret)console.getCaret();
        autoscroll.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    /**
     * Create the console in one line of code. 
     * @param x
     * @param y
     * @param title 
     */
    public void build(int x, int y, String title){
        setSize(x, y);
        setTitle(title);
        build();  
    }
    
    /**
     * Create the console with custom size but default title.
     * @param x
     * @param y 
     */
    public void build(int x, int y){
        setSize(x, y);
        build();
    }
    
    /**
     * Create the console with default size but custom title.
     * @param title 
     */
    public void build(String title){
        setTitle(title);
        build();
    }
    
}
