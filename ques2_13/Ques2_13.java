package ques2_13;
import java.io.*;
public class Ques2_13 
{
    public static void main(String[] args) throws Exception
    {
        FileWriter fw= new FileWriter("b.txt");
        fw.write("abc");
        fw.close();
    }
}
