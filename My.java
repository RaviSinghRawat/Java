import java.util.Scanner;

class My {
    public static void main(String arr[])
    {
        int a[]=new int[5];
        int i, t=0,ec=0,oc=0;
        float avg;
        Scanner ob = new Scanner(System.in);
        for(i=0; i<=4; i++)
        {
            System.out.print("Enter a no.");
            a[i] = ob.nextInt();
        }

        for(i=0; i<=4; i++)
        {
            t += a[i];
            if(a[i] % 2 == 0)
                ec++;
            else
                oc++;
        }
        avg = t/5;
        System.out.println("Sum = " + t);
        System.out.println("Even Count = " + ec);
        System.out.println("Odd Count = " + oc);
        System.out.println("Average = " + avg);

    }
}