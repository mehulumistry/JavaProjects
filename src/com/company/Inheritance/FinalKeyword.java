package com.company.Inheritance;

/**
 * Created by apple on 31/05/17.
 *
 * Final Keyword-is used to declare the constant values
 *
 * 1.to stop change the value
 * 2.to stop overiding
 * 3.to stop inheritance
 *
 */
class FinalVariable
{
    final int i=101;
    final int j;//blank final variables
    static  final int k;//static blank final variable
    FinalVariable()
    {
        j=20;//intializing blank final variable

    }
    static {
        k=30;
    }
    void change()
    {

        System.out.println(i+"  "+j+"   "+k);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        FinalVariable f=new FinalVariable();
        f.change();
    }
}
