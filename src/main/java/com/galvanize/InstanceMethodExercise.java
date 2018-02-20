package com.galvanize;

public class InstanceMethodExercise {
    private int bar;

    private void foo(int baz){
        bar += baz;
    }

    public int bar(){
        return (this.bar * 20);
    }

}
