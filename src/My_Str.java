public class My_Str
{
    private char[] string;

    public My_Str(char[] str)
    {
        string = str;
    }

    public String GetStr()
    {
        String temp = "";

        for (char value : string)
        {
            temp += value;
        }
        return temp;
    }

    private String ConvertToString(char[] str)
    {
        String temp = "";

        for (char value : str)
        {
            temp += value;
        }
        return temp;
    }

    public String MyCnct(char[] str)
    {
        char[] result = new char[string.length + str.length];

        for (int i = 0; i < string.length; i++)
        {
            result[i] = string[i];
        }

        int j = 0;
        for (int i = result.length - string.length; i < result.length; i++)
        {
            for(; j < str.length;)
            {
                result[i] = str[j];
                j++;
                break;
            }
        }

        return ConvertToString(result);
    }
}