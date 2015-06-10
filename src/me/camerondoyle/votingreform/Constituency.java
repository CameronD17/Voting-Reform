package me.camerondoyle.votingreform;

import java.util.ArrayList;

public class Constituency
{
    int id, numVoters, numSeats, ceiling, votersPerMP;
    String name;
    ArrayList<Voter> voters;
    ArrayList<Candidate> candidates;
    
    public Constituency(int i, String constituency, int voterCount, int seatCount, int voterCeiling, int perMP, String[] runs)
    {
        id = i;
        name = constituency;
        numVoters = voterCount;
        numSeats = seatCount;
        ceiling = voterCeiling;
        votersPerMP = perMP;
        
        generateCandidates(numSeats, runs);
    }
    
    public void generateCandidates(int seats, String[] running)
    {
        boolean[] parties = convertStringArrayToBooleanArray(running);
        
        int j = 1;
                
        if (parties[0] = true)
        {
            for(int i = 0; i < seats; i++)
            {
                candidates.add(new Candidate(i*j, "Generic Conservative", "Conservatives"));
            }
            j++;
        }
    }    
    
    public static boolean[] convertStringArrayToBooleanArray(String[] arrayToConvert)
    {
        boolean[] newArray = new boolean[arrayToConvert.length];
        int i = 0;
        
        for (String s : arrayToConvert)
        {
           if (s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false"))
           {
               newArray[i] = Boolean.parseBoolean(s);
           }                   
           else
           {
               System.out.println("Error: " + s + " is not in a recognised format.");
               return new boolean[0];
           }
           i++;
        }  
        
        return newArray;
    }
    
    public void print()
    {
        System.out.println( "ID: " + id +
                            "\nName: " + name +
                            "\nVoters: " + numVoters + 
                            "\nSeats: " + numSeats +
                            "\nCeiling: " + ceiling +
                            "\nVoters Per MP: " + votersPerMP + "\n");
    }
}
