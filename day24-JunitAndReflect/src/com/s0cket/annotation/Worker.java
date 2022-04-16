package com.s0cket.annotation;

@MyAnno(value = 12, per=Person.p1, anno2 = @MyAnno2, strs = {"zhaoxiao","dddd"})
@MyAnno3
public class Worker {
    @MyAnno3
    public String name = "zhaoxiao";
    @MyAnno3
    public void show(){
    }
}
