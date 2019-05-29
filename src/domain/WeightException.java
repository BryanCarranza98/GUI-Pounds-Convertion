package domain;

public class WeightException
    extends RuntimeException
{



    public WeightException()
    {
        super("Something bad happened with this weight.... ");
    }

    public WeightException(String message) // what we pass here gets pass to parent
    {
        super(message);
    }

}
