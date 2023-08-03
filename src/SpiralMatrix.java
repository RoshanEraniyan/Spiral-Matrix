import java.util.*;


class Spiral
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int f=0;
        int row=r,col=c;
        ArrayList<Integer>l=new ArrayList<Integer>();
        while(l.size()!=row*col)
        {
            for(int i=f;i<c;i++)
            {
                l.add(a[f][i]);
            }
            if(l.size()==row*col)
            {
                break;
            }
            if(r>0)
            {
                for(int i=f+1;i<r;i++)
                {
                    l.add(a[i][c-1]);
                }
                if(l.size()==row*col)
                {
                    break;
                }
                for(int i=c-2;i>=f;i--)
                {
                    l.add(a[r-1][i]);
                }
                if(l.size()==row*col)
                {
                    break;
                }
                if(r>2)
                {
                    for(int i=r-2;i>f;i--)
                    {
                        l.add(a[i][f]);
                    }
                    if(l.size()==row*col)
                    {
                        break;
                    }
                }
            }
            r=r-1;
            c=c-1;
            f=f+1;
        }

        System.out.println(l);
    }
}
