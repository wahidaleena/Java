public class Addition{
    
private int result;
private int chk=100;

public int sum(int a, int b)
{

try
{
    int c=a;
    int d=b;
    result=c+d;
    
}
catch(Exception ex)
{
    System.out.println("An exception was caused by the method sum"+ex);
}
return result;
}

public void check()
{
try
{
    if(chk==100)
    {
        System.out.println("Checked the value of variable,Hurray its 100");
    }
}
catch(ArithmeticException ex)
{
    System.out.println("An exception was caused by the method check"+ex);
}
}

     public static void main(String []args){
        Addition add = new Addition();
        int res=add.sum(10,20);
        System.out.println("The result is"+res);
        add.check();
     }
}
