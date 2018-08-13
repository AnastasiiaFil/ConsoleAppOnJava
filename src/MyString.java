public class MyString
{
    private String MyField;

    public MyString(String s)
    {
        MyField = s;
    }

    public String GetMyString()
    {

        return MyField;
    }

    public String MyConcat(String s)
    {
        return MyField + s;
    }
}
