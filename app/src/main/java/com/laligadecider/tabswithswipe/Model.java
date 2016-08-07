package com.laligadecider.tabswithswipe;


public class Model{
    String name;
    String name1; /* 0 -&gt; checkbox disable, 1 -&gt; checkbox enable */

    public Model(String name, String name1){
        this.name = name;
        this.name1 = name1;
    }
    public String getName(){

        return this.name;
    }
    public String getName1(){

        return this.name1;
    }

}

