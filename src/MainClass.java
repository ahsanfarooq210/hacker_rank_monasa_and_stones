import java.util.*;

public class MainClass
{
    public static void main(String[] args)
    {
        int t;
        Scanner in=new Scanner(System.in);
        //System.out.println("Enter the number of test cases");
        t=in.nextInt();

        for(int i=t;i>0;i--)
        {
            int n,a,b;

            //System.out.println("Enter the number of stones: ");
            n=in.nextInt();
            //System.out.println("Enter the value of a and b: ");
            a=in.nextInt();
            b=in.nextInt();
            Set <Integer>s= findLastStoneVlaue(a,b,n);
            List<Integer> list=new ArrayList<>(s);
            Collections.sort(list);
            for(int ans:list)
            {
                System.out.print(ans+" ");
            }
            System.out.println();


        }
    }

    private static Set<Integer> findLastStoneVlaue(int a, int b, int n)
    {
        Set <Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add((b*i)+(a*(n-i-1)));
        }
        return s;

    }
}
