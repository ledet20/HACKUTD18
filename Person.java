package hackutd.attempt.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bclan
 */
public class Person {

    private static String firstName;
    private static String lastName;
    private static String LinkedInID;
    private static String address;
    private static String city;
    private static String state;
    private static int zip;
    private static int ssn;
    private static int phoneNum;
    private static int routingNum;
    private static int creditCardNum;
    private static int cvv;
    private static int month;
    private static int year;
    private static double autoIncome;
    private static double homeIncome;
    private static double otherIncome;
    private static double totalIncome;
    private static String timesPerYear;
    private static int numOfTimes;
    
    public Person()
    {
        firstName = "";
        lastName = "";
        LinkedInID = "";
        address   = "";
        city = "";
        state = "";
        zip = 0;
        ssn = 0;
        phoneNum = 0;
        routingNum = 0;
        creditCardNum = 0;
        cvv = 0;
        month = 0;
        year = 0;
        autoIncome = 0;
        homeIncome = 0;
        otherIncome = 0;
        totalIncome = 0;
        timesPerYear = "";
        numOfTimes = 0;
        
    }
    
    public Person(String name)
    {
        firstName = name;
    }
    
    public void setFirstName(String name)
    {
        firstName = name;
    }  
    
    public void setLastName(String name)
    {
        lastName = name;
    } 
    
    public void setLinkedInID(String ID)
    {
        LinkedInID = ID;
    } 
            
    public void setAddress(String ad)
    {
        address = ad;
    } 
                
    public void setCity(String c)
    {
        city = c;
    } 
    
    public void setZIP(int z)
    {
        zip = z;
    } 
        
    public void setSSN(int s)
    {
        ssn = s;
    } 
            
    public void setPhone(int phone)
    {
        phoneNum = phone;
    } 
                
    public void setRouting(int route)
    {
        routingNum = route;
    } 
                    
    public void setCreditCard(int credit)
    {
        creditCardNum = credit;
    } 
                        
    public void setCVV(int c)
    {
        cvv = c;
    } 
                            
    public void setMonth(int mon)
    {
        month = mon;
    } 
                                
    public void setYear(int yr)
    {
        year = yr;
    }  
                                        
    public void setIncome(double auto, double rent, double other, double total)
    {
        autoIncome = auto;
        homeIncome = rent;
        otherIncome = other;
        totalIncome = total;
    }  
                                                    
    public void setTimesYear(String Times, int times)
    {
        timesPerYear = Times;
        numOfTimes = times;
    } 
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getLinkedIn()
    {
        return LinkedInID;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getState()
    {
        return state;
    }
    
    public int getZip()
    {
        return zip;
    }
    
    public int getSSN()
    {
        return ssn;
    }
    
    public int getPhoneNum()
    {
        return phoneNum;
    }
    
    public int getRoutingNum()
    {
        return routingNum;
    }
    
    public int getCreditCardNum()
    {
        return creditCardNum;
    }
    
    public int getCVV()
    {
        return cvv;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public double getAutoIncome()
    {
        return autoIncome;
    }
    
    public double getHomeIncome()
    {
        return homeIncome;
    }
    
    public double getOtherIncome()
    {
        return otherIncome;
    }
    
    public double getTotalIncome()
    {
        return totalIncome;
    }
    
    public String getTimesPerYear()
    {
        return timesPerYear;
    }
    
    public int getNumOfTimes()
    {
        return numOfTimes;
    }                                                   
}
