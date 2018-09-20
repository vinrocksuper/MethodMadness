//Vincent Li 9/20/18

package VLi;

public class VLiLib
{
    public static void println(String str)
    {
        System.out.println(str);
    }
    public static String cutOut(String mainStr, String subStr)
    {
        int check = mainStr.indexOf(subStr);
        if(check > -1)
        {
            mainStr = mainStr.replaceFirst(subStr,"");
        }
        return(mainStr);
        // using the replaceFirst function I just replaced whatever the subStr is with an empty string
    }
    public static String dateStr(String date)
    {
        String month = date.substring(0,date.indexOf("/"));
        String day = date.substring(date.indexOf("/")+1,5);
        String year = date.substring(6,date.length());
        date = day + "-"+ month + "-" + year;
        return(date);
        //I break the inserted string into 3 smaller strings, one for day,month and year, then reassemble them in the provided format.
    }
    public static void multiplicationTable(int base, int range)
    {
        for(int i=0;i<=range;i++)
        {
            String num = String.valueOf(base * i);
            println(num);
            //It just prints out the multiples of base based off of range
        }
    }
    public static String sumUpTo(int upTo)
    {
        int sum = 0;
        for(int i = 0; i <= upTo;i++)
        {
            sum += i;
            //The for loop uses the parameter to dictate how many numbers to add to the total sum
        }
        String str = String.valueOf(sum);
        return (str);
    }
    public static String leastCommonMultiple(int num1, int num2, int num3)
    {
        //The reason I had to make these into doubles was because Java would automatically parse x/(any positive integer) to 0 and stop the loop.
        double a = num1;
        double b = num2;
        double c = num3;
        double x = 1.0;
        while(x/a !=0 && x/b!=0 && x/c!=0)
        {
            //It looks for a value that has no remainders when divided by all 3 integers and returns it.
            //It has to be converted back into an integer first though.

            if(x%a == 0 && x%b==0 && x%c==0)
            {
                int val = (int)(x);
                return(String.valueOf(val));
            }
            x++;
        }
        // This line is technically unnecessary as the if statement covers this line too.
        return(String.valueOf(num1*num2*num3));

        }
}
