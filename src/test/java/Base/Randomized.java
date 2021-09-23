package Base;

import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Randomized {

	
	
	  public static String getCurrentDate(String dateFormat)
      {
		  Date date = new Date();
		  SimpleDateFormat dateStrCurrent = new SimpleDateFormat(dateFormat);
          return dateStrCurrent.format(date);
      }
      /// <summary>
      /// Returns current date
      /// </summary>
      /// <returns>Current date string as "MM/dd/yyyy"</returns>
      public static String getCurrentDate()
      {
    	  Date date = new Date();
    	  SimpleDateFormat dateStrCurrent = new SimpleDateFormat("MM/dd/yyyy");
    	  return dateStrCurrent.format(date);
      }     
      public static String getCurrentDayNumber()
      {
    	  Date date = new Date();
    	  SimpleDateFormat dateStrCurrent = new SimpleDateFormat("dd");
    	  return dateStrCurrent.format(date);
      }
      
      public static String getCurrentMonth()
      {
    	  Date date = new Date();
    	  SimpleDateFormat dateStrCurrent = new SimpleDateFormat("MM");          
    	  return dateStrCurrent.format(date);

      }
  
      public static String getCurrentMonthName()
      {
    	  Date date = new Date();
    	  SimpleDateFormat dateStrCurrent = new SimpleDateFormat("MMM");
    	  return dateStrCurrent.format(date);
      }
      
      public static String getCurrentYear()
      {

          String yearStrCurrent = Year.now().toString();
          return yearStrCurrent;
      }

      public static String getCurrentTime(String timeFormat)
      {
    	  Date date = new Date();
		  SimpleDateFormat timeStrCurrent = new SimpleDateFormat(timeFormat);
          return timeStrCurrent.format(date);
      }
      public static String getNoOfDaysDifferenceBetweenTwoDates(String date1, String date2)
      {
    	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	    Date firstDate = null;
    	    Date secondDate = null;
			try {
				firstDate = sdf.parse(date1);
				secondDate = sdf.parse(date2);
			} catch (ParseException e) {
				e.printStackTrace();
			}   	
    	    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
    	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    	    String days = String.valueOf(diff);
    	    return days;
      }

      public static String getCurrentTime()
      {
    	  Date date = new Date();
		  SimpleDateFormat timeStrCurrent = new SimpleDateFormat("HH:mm:ss");
		  return timeStrCurrent.format(date);
      }


      
      //Future date methods
      public static String getFutureDate(int NoOfDays, String dateFormat)
      {
    	  
    	
    	  SimpleDateFormat dateStrFuture = new SimpleDateFormat(dateFormat);
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.DATE, NoOfDays); // +days
    	  return   dateStrFuture.format(cal.getTime()).toString();
    	  
    	  
      }

      public static String getFutureDate(int NoOfDays)
      {
    	  SimpleDateFormat dateStrFuture = new SimpleDateFormat("MM/dd/yyyy");
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.DATE, NoOfDays); // +days
    	  return   dateStrFuture.format(cal.getTime()).toString();
      }
      
      public static String getFutureDateByMonth(int NoOfMonths)
      {
    	  SimpleDateFormat dateStrFuture = new SimpleDateFormat("\"MM/dd/yyyy\"");
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.MONTH, NoOfMonths); // +months
    	  return   dateStrFuture.format(cal.getTime()).toString();
      }
           
      public static String getFutureDate(String fromDate, int NoOfDays)
      {
    	  SimpleDateFormat dateStrFuture = new SimpleDateFormat("MM/dd,yyyy");
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.DATE, NoOfDays); // +days
    	  return   dateStrFuture.format(cal.getTime()).toString();
      } 
      
      public static String getFutureDayNumber(int NoOfDays)
      {
    	  Date date = new Date();
    	  SimpleDateFormat dateStrCurrent = new SimpleDateFormat("dd");
    	  return dateStrCurrent.format(date);
    	  
         
      }
          
      public static String getFutureYearByNoOfDays(int NoOfDays)
      {
          Year year = Year.now(); 
         
          return year.toString();
      }
          
      public static String getFutureYearByNoOfYears(int NoOfYears)
      {
    	  int yearStrCurrent =Integer.parseInt(Year.now().toString());
           yearStrCurrent= yearStrCurrent+NoOfYears;
            return String.valueOf(yearStrCurrent);
      }   
      
      public static String getFutureDateByMonth(int NoOfMonths, String dateFormat)
      {
    	  SimpleDateFormat dateStrFuture = new SimpleDateFormat(dateFormat);
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.MONTH, NoOfMonths); // +months
    	  return   dateStrFuture.format(cal.getTime()).toString();
      } 
 
      public static String getFutureYearByMonth(int NoOfMonths)
      {
    	  String yearStrCurrent = Year.now().atMonth(NoOfMonths).toString();
          return yearStrCurrent;
      }
            
      public static String getFutureYearByNoOfYears(int NoOfYears, String dateFormat)
      {
    	  SimpleDateFormat dateStrFuture = new SimpleDateFormat(dateFormat);
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.YEAR, NoOfYears); // +years
    	  return   dateStrFuture.format(cal.getTime()).toString();

      }   
         
      public static String getFutureTimeByHours(int NoOfHours, String timeFormat)
      {
    	  SimpleDateFormat timeStrFuture = new SimpleDateFormat(timeFormat);
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.HOUR, NoOfHours); // +hours
    	  return   timeStrFuture.format(cal.getTime()).toString();
      }
      
      public static String getFutureTimeByMinutes(int NoOfMinutes, String timeFormat)
      {
    	  SimpleDateFormat timeStrFuture = new SimpleDateFormat(timeFormat);
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.MINUTE, NoOfMinutes); // +minutes
    	  return   timeStrFuture.format(cal.getTime()).toString();
      }
   
      
      //Previous date methods
      public static String getPreviousDate(int NoOfDays, String dateFormat)
      {
    	  SimpleDateFormat dateStrPrevious = new SimpleDateFormat("MM/dd/yyyy");
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.DATE, -NoOfDays); // -days
    	  return   dateStrPrevious.format(cal.getTime()).toString();
      }
      
      public static String getPreviousDate(String fromDate, String format, int NoOfDays)
      {
    	  SimpleDateFormat dateStrPrevious = new SimpleDateFormat("MM/dd/yyyy");     
    	  Calendar cal = Calendar.getInstance();  
    	  try {
			cal.setTime(dateStrPrevious.parse(fromDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  cal.add(Calendar.DATE, -NoOfDays);    
          return dateStrPrevious.format(cal.getTime()).toString();
      }
      
      public static String getPreviousYear(int NoOfYears)
      {
    	  SimpleDateFormat dateStrPrevious = new SimpleDateFormat("yyyy");
    	  Calendar cal = Calendar.getInstance();    	  
    	  cal.add(Calendar.YEAR, -NoOfYears);
    	  return   dateStrPrevious.format(cal.getTime()).toString();
      }
      
      public static String getPreviousMonth(int NoOfMonths)
      {
    	  SimpleDateFormat dateStrPrevious = new SimpleDateFormat("MM");
    	  Calendar cal = Calendar.getInstance();    	  
    	  cal.add(Calendar.MONTH, -NoOfMonths);
    	  return   dateStrPrevious.format(cal.getTime()).toString();
      }
      
      public static String getPreviousDateByMonth(int NoOfMonths, String dateFormat)
      {
    	  SimpleDateFormat dateStrPrevious = new SimpleDateFormat(dateFormat);
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.MONTH, - NoOfMonths); // +months
    	  return   dateStrPrevious.format(cal.getTime()).toString();
      } 
      
      public static String getPreviousDateByMonth(int NoOfMonths)
      {
    	  SimpleDateFormat dateStrPrevious = new SimpleDateFormat("MM/dd/yyyy");
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.MONTH, - NoOfMonths); // +months
    	  return   dateStrPrevious.format(cal.getTime()).toString();
      } 
      
      public static String getPreviousYearByNoOfYears(int NoOfYears, String dateFormat)
      {
    	  SimpleDateFormat dateStrPrevious = new SimpleDateFormat("MM/dd/yyyy");
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.YEAR, -NoOfYears); // -years
    	  return   dateStrPrevious.format(cal.getTime()).toString();

      }   
   
      public static String getPreviousTimeByHours(int NoOfHours, String timeFormat)
      {
    	  SimpleDateFormat timeStrFuture = new SimpleDateFormat(timeFormat);
    	  Calendar cal = Calendar.getInstance();
    	  cal.add(Calendar.HOUR, -NoOfHours); // -hours
    	  return   timeStrFuture.format(cal.getTime()).toString();
      }
     
     
	 public static int getRandomNumber()
     {
         //This method returns a random decimal digit.
         Random rannum = new Random();
         int result = rannum.nextInt(9);
         if (result==0)
             result = 1;
         return result;
     }
	 
	 public static double getRandomDecimalNumber()
     {
       
         Random rannum = new Random();
         double result = rannum.nextDouble();
         return result;
     }
	 
	  public static int getRandomNumber(int numLen)
      {
          Random rannum1 = new Random();
          int result1 = rannum1.nextInt(numLen);
          return result1;
      }
	  
	  public static int getRandomEvenNumber(int numLen)
	     {
	         Random rand = new Random();

	         int randomNum = rand.nextInt(numLen);
	         while ((randomNum % 2) != 0)
	             randomNum = rand.nextInt(numLen);
	         return randomNum;
	     }
		 
		 public static int getRandomOddNumber(int numLen)
	     {
	         Random rand = new Random();

	         int randomNum = rand.nextInt(numLen);
	         while ((randomNum % 2) == 0)
	             randomNum = rand.nextInt(numLen);
	         return randomNum;

	     }
		 
		 public static int getRandomBetweenTwoNum(int startNo, int endNo)
	     {

	         Random rannum1 = new Random();
	         int result1 = rannum1.nextInt(endNo);
	         if (result1 < startNo)
	             result1 = startNo;
	         return result1;
	     }  

		 
		 public static int  getRandomNumbers(int numStrLen)
	        {
	            String nums = "";
	            Random _random = new Random();
	            StringBuilder sb = new StringBuilder(numStrLen); 
	            if (numStrLen > 10)
	                numStrLen = 10;
	            for (int i = 0; i < numStrLen; i++)
	            {

	                int num = _random.nextInt(9);
	                sb.append(num);
	            }
	            return Integer.parseInt(nums);
	        }
		 
		 
		   public static String randomString(int strLen)
	       {           
			// chose a Character random from this String 
		        String str = "abcdefghijklmnopqrstuvxyz"; 
		  
		  
		        StringBuilder sb = new StringBuilder(strLen); 
		  
		        for (int i = 0; i < strLen; i++) { 
		  
		            // generate a random number between 
		            // 0 to String variable length 
		            int index  = (int)(str.length() 
		                        * Math.random()); 
		  
		            // add Character one by one in end of sb 
		            sb.append(str.charAt(index)); 
		                          
		        } 
		  
		        return sb.toString(); 
	       }
		

		   public static String getRandomChar()
	        {

	            // ... Between 'a' and 'z' inclusize.
	            Random _random = new Random();
	            int num = _random.nextInt(26); // Zero to 25
	            char let = (char)('a' + num);
	            return String.valueOf(let);
	        }
		   
		   public static String randomAlphanumericSpecialCharsString(int strLen)
	        {

	            String allowedChars = "abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ0123456789@\"!#$%&'()*+,-./:;<=>?@[\\]_\"";
	            SecureRandom rnd = new SecureRandom();
	            StringBuilder sb = new StringBuilder(strLen); 
	            for (int i = 0; i < strLen; i++)
	            	sb.append( allowedChars.charAt( rnd.nextInt(allowedChars.length()) ) );
	            return sb.toString();

	        }
		   
		   public static String randomAlphanumericSpecialCharsPasswordString(int strLen)
	        {

	            String allowedChars = "abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ0123456789@\"!#$%&'()*+,-./:;<=>?@[\\]_\"";
	            SecureRandom rnd = new SecureRandom();
	            StringBuilder sb = new StringBuilder(strLen); 
	            for (int i = 0; i < strLen; i++)
	            	sb.append( allowedChars.charAt( rnd.nextInt(allowedChars.length()) ) );
	            return sb.toString();

	        }
		   
		   public static String randomAlphanumeric(int strLen)
	        {

	            String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	            SecureRandom rnd = new SecureRandom();
	            StringBuilder sb = new StringBuilder(strLen); 
	            for (int i = 0; i < strLen; i++)
	            	sb.append( allowedChars.charAt( rnd.nextInt(allowedChars.length()) ) );
	            return sb.toString();

	        }
		   
		   public static String manualPlusRandomString(String manualStr, int strLenth)
	        {
	            StringBuilder sb = new StringBuilder();
	            // ... Between 'a' and 'z' inclusize.
	            Random _random = new Random();
	            for (int i = 0; i < strLenth; i++)
	            {
	                int num = _random.nextInt(26); // Zero to 25

	                char let = (char)('a' + num);

	                sb.append(let);

	            }
	            String ranStr = sb.toString();
	            ranStr = manualStr + ranStr;
	            //new string(Characters);
	            return ranStr;
	        }
		   
		 /// <summary>
	        /// Returns random number string
	        /// </summary>
	        /// <param name="numLen"></param>
	        /// <returns>Random number string</returns>
	        public static String randomNumberString(int numLen)
	        {
	            String nums = "";
	            StringBuilder sb = new StringBuilder(numLen); 
	            // ... Between 'a' and 'z' inclusize.
	            Random _random = new Random();
	            for (int i = 0; i < numLen; i++)
	            {

	                int num = _random.nextInt(9); // Zero to 25
	                //char let = (char)('a' + num);
	                sb.append(num);
	            }
	            return sb.toString();
	        }
		   
		   public static int getRandomDropDownValue(int unitLength)
	        {

	            Random rannum1 = new Random();
	            unitLength = unitLength - 1;
	            int result1 = rannum1.nextInt(unitLength - 1);
	            if (result1 < 1)
	                result1 = 1;
	            return result1;
	        }
		   
		   public static String getRandomPhoneNumbers()
	        {
	            String nums = "";
	            Random _random = new Random();
	            for (int i = 0; i < 10; i++)
	            {
	                int num = _random.nextInt(9); 
	            }
	            return nums.toString();
	        }
		   
		   public static String removeCharAt(String value,int index)
		     {
		       String  realvalue = null;
		       StringBuffer str = new StringBuffer(value);
		       StringBuffer removedString = str.deleteCharAt(index);
		       
		       realvalue = new String(removedString);
		        
		        return realvalue;         
		     }

		   public static String removeStringByIndexCount(String value,int startIndex,int count)
		     {
		       String  realvalue = null;
		       StringBuffer str = new StringBuffer(value);   
		       StringBuffer removedString = str.delete(startIndex, (startIndex+count));       
		       realvalue = new String(removedString);
		        
		       return realvalue;         
		     }
		   public static String removeStringByIndex(String value,int startIndex,int endIndex)
		     {
		       String  realvalue = null;
		       StringBuffer str = new StringBuffer(value);
		       StringBuffer removedString = str.delete(startIndex, endIndex);
		       
		       realvalue = new String(removedString);
		        
		       return realvalue;         
		     }
		   public static String insertStringByIndex(String value,int startIndex, String value1)
		   {
		        
		       String  realvalue = null;
		       StringBuffer str = new StringBuffer(value);
		       
		       char [] insertValue = value1.toCharArray();
		   
		       StringBuffer str1 = str.insert(startIndex,insertValue);
		       
		        realvalue = new String(str1);
		        
		        return realvalue;
		     }

		   public static String  enterRandomNumbers(int numStrLen)
	        {
	            
			 String nums = "";
	            Random _random = new Random();
	            StringBuilder sb = new StringBuilder(numStrLen); 
	            if (numStrLen > 0)	
	            {
	            	for (int i = 0; i < numStrLen; i++)
	            	{

	                int num = _random.nextInt(9);
	                sb.append(num);
	            	
	            	}
	            		 nums = new String(sb);
	            }
	            return nums;
	        }
		     
		   

		     
}
