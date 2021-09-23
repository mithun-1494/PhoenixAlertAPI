package Base;

import java.util.List;

import org.testng.Assert;

public class verify {
	
	

    private static final String String = null;

	/// <summary>
    /// This method is used to verify the test exepcted and test actual produced String values are equal.
    /// The assertion fails if the values are not equal. Displays a message  and a custom message if the assertion fails.
    /// </summary>
    /// <param name="expected"></param>
    /// <param name="actualValue"></param>
    /// <param name="customMessage"></param> 
    public static void ExpectedPropertyValueIsEqual(String expected,String actualValue,String customMessage)
     {
    	Assert.assertEquals(actualValue, expected,customMessage);           
     }
    /// <summary>
    /// This method is used to verify the test exepcted and test actual produced String values are not equal.
    /// The assertion fails if the values are equal. Displays a message  and a custom message if the assertion fails.
    /// </summary>
    /// <param name="expected"></param>
    /// <param name="actualValue"></param>
    /// <param name="customMessage"></param>
    public static void ExpectedPropertyValueIsNotEqual(String expected,String actualValue,String customMessage)
     {

        Assert.assertEquals(actualValue, expected,customMessage);

     }
    /// <summary>
    /// This method is used to verify the test exepcted and test actual produced integer values are equal.
    /// The assertion fails if the values are not equal. Displays a message  and a custom message if the assertion fails.
    /// </summary>
    /// <param name="expected"></param>
    /// <param name="actualValue"></param>
    /// <param name="customMessage"></param>
    public static void ExpectedIntergerValueIsEqualToActual(int expected,int actualValue,String customMessage)
     {

        Assert.assertEquals(actualValue, expected,customMessage);

     }
    /// <summary>
    /// This method is used to verify the test exepcted and test actual produced integer values are not equal.
    /// The assertion fails if the values are equal. Displays a message  and a custom message if the assertion fails.
    /// </summary>
    /// <param name="expected"></param>
    /// <param name="actualValue"></param>
    /// <param name="customMessage"></param>
    public static void ExpectedIntergerValueIsNotEqualToActual(int expected,int actualValue,String customMessage)
     {
        Assert.assertEquals(actualValue, expected,customMessage);      
     }
    
    public static void ExpectedValueIsTrue(Boolean actualValue,String customMessage)
    {

        Assert.assertTrue(actualValue,customMessage);

    }
    /// <summary>
    /// Verifies that the specified condition is not true. The assertion fails if the
    /// condition is true. Displays a message and a custom message if the assertion fails.
    /// </summary>
    /// <param name="actualValue"></param>
    /// <param name="customMessage"></param>
    public static void ExpectedValueIsNotTrue(Boolean actualValue,String customMessage)
     {

        Assert.assertFalse(actualValue,customMessage);

     }                                                               
    /// <summary>
    /// Verifies that the specified condition is false. The assertion fails if the
    /// condition is true. Displays a message and a message if the assertion fails.
    /// </summary>
    /// <param name="actualValue"></param>
    /// <param name="customMessage"></param>
    public static void ExpectedValueIsFalse(Boolean actualValue,String customMessage)
    {
        
        Assert.assertFalse(actualValue,customMessage);

    }
    /// <summary>
    /// Verifies that the specified condition is not false. The assertion fails if the
    /// condition is false. Displays a message and a custom message if the assertion fails.
    /// </summary>
    /// <param name="actualValue"></param>
    /// <param name="customMessage"></param>
    public static void ExpectedValueIsNotIsFalse(Boolean actualValue,String customMessage)
    {           
        Assert.assertFalse(actualValue,customMessage);
    }
    /// <summary>
    /// This method is used to verify the test exepcted and test actual produced String values are equal
    /// The assertion fails if the values are not equal. Displays a message if the assertion fails.
    /// </summary>
    /// <param name="expected"></param>
    /// <param name="actualValue"></param>
    public static void ExpectedPropertyValueIsEqual(String expected, String actualValue)
    {
        Assert.assertEquals(actualValue, expected);
    }
    /// <summary>
    /// This method is used to verify the test exepcted and test actual produced String values are not equal
    /// The assertion fails if the values are equal. Displays a message if the assertion fails.
    /// </summary>
    /// <param name="expected"></param>
    /// <param name="actualValue"></param>
    public static void ExpectedPropertyValueIsNotEqual(String expected, String actualValue)
    {
        Assert.assertNotEquals(actualValue, expected);
    }
    /// <summary>
    /// This method is used to verify the test exepcted and test actual produced integer values are equal
    /// The assertion fails if the values are not equal. Displays a message if the assertion fails.
    /// </summary>
    /// <param name="expected"></param>
    /// <param name="actualValue"></param>
    public static void ExpectedIntergerValueIsEqualToActual(int expected, int actualValue)
    {
        Assert.assertEquals(actualValue, expected);
    }
    /// <summary>
    /// This method is used to verify the test exepcted and test actual produced integer values are not equal.
    /// The assertion fails if the values are equal. Displays a message if the assertion fails.
    /// </summary>
    /// <param name="expected"></param>
    /// <param name="actualValue"></param>
    public static void ExpectedIntergerValueIsNotEqualToActual(int expected, int actualValue)
    {
        Assert.assertNotEquals(actualValue, expected);
    }
    /// <summary>
    /// Verifies that the specified condition is true. The assertion fails if the
    /// condition is false. Displays a message if the assertion fails.
    /// </summary>
    /// <param name="actualValue"></param>
    public static void ExpectedValueIsTrue(Boolean actualValue)
    {
       Assert.assertTrue(actualValue);
    }
    /// <summary>
    /// Verifies that the specified condition is not true. The assertion fails if the
    /// condition is true. Displays a message if the assertion fails.
    /// </summary>
    /// <param name="actualValue"></param>
    public static void ExpectedValueIsNotTrue(Boolean actualValue)
    {
        Assert.assertFalse(actualValue);
    }
    /// <summary>
    /// Verifies that the specified condition is false. The assertion fails if the
    /// condition is true. Displays a message if the assertion fails.
    /// </summary>
    /// <param name="actualValue"></param>
    public static void ExpectedValueIsFalse(Boolean actualValue)
    {
        Assert.assertFalse(actualValue);
    }
    /// <summary>
    /// Verifies that the specified condition is not false. The assertion fails if the
    /// condition is false. Displays a message if the assertion fails.
    /// </summary>
    /// <param name="actualValue"></param>
    public static void ExpectedValueIsNotFalse(Boolean actualValue)
    {
        Assert.assertTrue(actualValue);
    }

    /// <summary>
    /// Verifies that the specified condition is true. The assertion fails if the
    /// condition is false. Displays a message if the assertion fails.
    /// </summary>
    /// <param name="actualValue"></param>
    public static void ExpectedListValueIsTrue(List<String> expectedListValue, List<String> actualListValue)
    { 	
	
        for(String str : expectedListValue)
        {
            verify.ExpectedValueIsTrue(actualListValue.contains(str));
        }
  
    }


}
