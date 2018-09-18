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

        return(String.valueOf(num1*num2*num3));
    }
}
