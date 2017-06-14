import java.io.*;
import java.util.*;
public class alp
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char ip=s.next().charAt(0);
        if((ip >='a' && ip<='z') || (ip >='A' && ip<='Z'))
        {
            System.out.println("alphabet");
        }
        else
        {
            System.out.println("not an alpbabet");
        }
    }
}
