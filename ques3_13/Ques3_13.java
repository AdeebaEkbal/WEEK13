package ques3_13;
import java.io.*;
public class Ques3_13 
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr =new FileReader("A.txt");
        FileWriter fw =new FileWriter("B.txt");
        int c=fr.read();
        while(c>=0)
        {
            fw.write((char) c);
            c=fr.read();
        }
        fr.close();
        fw.close();
    }
}
