package org.example;

public class PairObject {
    private Object valueT;
    private Object valueU;

    public PairObject (Object valueU,Object valueT){
        this.valueT = valueT;
        this.valueU = valueU;


    }
    public void summ(){System.out.println("key: "+valueT.toString() + valueU.toString());}

    public Integer getSumm(){return (Integer) valueT+(Integer) valueU;}

    public String getSummString(){return (String) valueT+(String) valueU;}
}
