package ques4_13;
import java.io.*;
public class Ques4_13 
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr =new FileReader("C.txt");
        int count=0;
        int c=fr.read();
        while(c>=0)
        {
            count++;
            c=fr.read();
        }
        System.out.println(count);
        fr.close();
    }
}
