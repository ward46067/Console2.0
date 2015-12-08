package com.ward;

public class Menu {
    private String[] menu;
    private String title;
    
    public Menu(int l, String t){
        if(l < 1){
            l = 1;
        }
        
        menu = new String[l + 1];
        title = t;
        menu[0] = title;
        
        
    }
    
    public Menu(int l){
        this(l, "Menu");
    }
    
    public Menu(){
        this(1);
    }
    
    public void setOption(int o, String s){
       s = s.trim();
       menu[o] = s; 
    }
    public void addOption(String s){
        String[] temp = new String[menu.length + 1];
        temp = menu;
        temp[menu.length] = s;
        menu = new String[temp.length];
        menu = temp;
    }
    
    public void print(){
        for(int i = 0; i < menu.length; i++){
            if(i == 0){
                System.out.println(menu[i]);
            } else {
                System.out.println(i + ": " + menu[i]);
            }
        }
    }
    
    public void setTitle(String t){
        title = t;
        menu[0] = title;
    }
}
