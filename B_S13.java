import java.util.*;
class B_S13
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String aa=in.next();
        char a=aa.charAt(0);
        if(a=='a'|| a=='e'|| a=='i'|| a=='o'||a=='u')
        {
        System.out.println("vowels");
        }
        else
    {
        System.out.println("character");
    }
}
}
