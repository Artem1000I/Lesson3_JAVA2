package org.example;

public class PairString {
    private String valueT;
    private String valueU;

    public PairString(String valueT,String valueU){
        this.valueT = valueT;
        this.valueU = valueU;




    }
    public  void  summ(){System.out.println("Key: " + valueT + "value: " + valueU);}

    public String getSumm(){return valueT + valueU;}

    @Override
    public String toString(){return "PairString Test";}


}
