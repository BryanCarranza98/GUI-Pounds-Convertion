package test;

import domain.WeightConverter;
import domain.WeightException;
import org.junit.Assert;
import org.junit.Test;



public class TestWeightConverter
{

    @Test
    public void TestWeightConstructer()
    {
        WeightConverter temp = new WeightConverter ( 60.0);
        Assert.assertNotNull(temp); // Expected result
        Assert.assertEquals(60,temp.getPounds(), 0.01); // dealta = have precision


    }


    @Test
    public void TestWeightSetKilogramsCheckPounds()
    {
        WeightConverter temp = new WeightConverter (4.4);
        Assert.assertNotNull(temp); // Expected result
        Assert.assertEquals(2.0,temp.getKilograms(), 0.01);

    }



    @Test
    public void TestWeightSetPoundsCheckKilograms()
    {
        WeightConverter temp = new WeightConverter ( 6.6);
        Assert.assertNotNull(temp); // Expected result
        Assert.assertEquals(3.0,temp.getKilograms(), 0.01);

    }



}
