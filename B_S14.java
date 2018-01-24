import java.util.*;
class B_S14
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String aa=in.next();
        char a=aa.charAt(0);
        if(Character.isLetter(a))
        {
        System.out.println("Alphabets");
        }
        else if(Character.isDigit(a))
    {
        System.out.println("Digits");
    }
}
}

