package ques5_13;
import java.io.*;
public class Ques5_13 
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr =new FileReader("D.txt");
        BufferedReader br =new BufferedReader(fr);
        int count=0;
        String c;
        while((c=br.readLine())!=null)
        {
            count++;
        }
        System.out.println(count);
        br.close();
        fr.close();
    }
}
