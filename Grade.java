import java.util.*;
class Calculate{
    private ArrayList<Double> g;
    private int st;
    public Calculate(int n)
    {
        this.st=n;
        this.g=new ArrayList<>();
    }
    public void getdetails()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<st;i++)
        {
            System.out.print("Enter Grade for Student"+(i+1)+":");
            Double m=sc.nextDouble();
            g.add(m);
        }
        sc.close();
    }
    public double calculateAverage()
    {
        double s=0;
        for(int i=0;i<st;i++)
        {
            s+=g.get(i);
        }
        return s/st;
    }
    public double calculateHigh(){
        return Collections.max(g);
    }
    public double calculateLow()
    {
        return Collections.min(g);
    }
}
public class Grade {
    public static void main(String argv[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of Students:");
        int n=sc.nextInt();
        Calculate c=new Calculate(n);
        c.getdetails();
        System.out.println("Average score:"+c.calculateAverage());
        System.out.println("Highest score:"+c.calculateHigh());
        System.out.println("Lowest score:"+c.calculateLow());
        sc.close();
    }
}