package domain;

public class WeightConverter
{

    private double pounds = 0.0; // faren
    private double kilograms = 0.0 ; // kelvin


    public WeightConverter() throws WeightException
    {
        // if no argument, default to 0 K

        setKilograms(0.0);

    }

    public WeightConverter(double inputPounds) throws WeightException
    {
        setPounds(inputPounds);

    }




    public void setKilograms(double kilograms) throws WeightException // setting the kilos to pound
    {
        if(kilograms < 0 )
        {
            throw new WeightException("Invalid kilo value: Must be >=0 ");

        }

        this.kilograms = kilograms;
        convertKiloToPounds();
    }


    public void setPounds(double pounds) throws WeightException // setting the pounds if its legible number
    {
        if(pounds < 0 )
        {
            throw new WeightException("Invalid pound value: Must be >=0 ");

        }
        this.pounds = pounds;

        convertPoundsToKilograms();
    }


    private void convertKiloToPounds()
    {

        pounds = (kilograms * 2.2);

    }

    private void convertPoundsToKilograms() // math of converting pounds to kilo
    {

        kilograms = (pounds / 2.2);

    }




    public double getKilograms() {

        return kilograms;
    }



    public double getPounds()
    {

        return pounds;
    }

    @Override
    public String toString() { // how the output would look like
        return "WeightConverter{" +
                "weightInPounds=" + pounds +
                ", weightInKilograms=" + kilograms +
                '}';

    }
}
