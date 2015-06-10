package me.camerondoyle.votingreform;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VotingReform
{
    static Scanner input = new Scanner(System.in);
    
    static ArrayList<Constituency> constituencies = new ArrayList<Constituency>();

    public static void main(String[] args)
    {
        //generateConstituencies();        
        //printConstituencies();
        String[] testParties = {"true","true","true","true","true","true","true","true","true","true","true","true"};
        Constituency testConstituency = new Constituency(1, "Test Location", 475123, 5, 100000, 95025, testParties);
        constituencies.add(testConstituency);
        
        testConstituency.print();
    }

    public static void generateConstituencies()
    {
        String csvFile = "C:/Users/doyleca/workspace/Voting Reform/src/me/camerondoyle/votingreform/constituencies.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplit = ",";

        try
        {
            br = new BufferedReader(new FileReader(csvFile));
            br.readLine(); // Skip header line
            while ((line = br.readLine()) != null)
            {
                String[] constituency = line.split(csvSplit);
                int constid = Integer.parseInt(constituency[0]);
                String name = constituency[1];
                int voters = Integer.parseInt(constituency[2]);
                int seats = Integer.parseInt(constituency[3]);
                int ceiling = Integer.parseInt(constituency[4]);
                int perMP = Integer.parseInt(constituency[5]);
                
                String[] running = Arrays.copyOfRange(constituency, 6, 17);
                
                constituencies.add(new Constituency(constid, name, voters, seats, ceiling, perMP, running));
            }
        } 
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                } 
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void printConstituencies()
    {
        for (Constituency c : constituencies)
        {
            c.print();
        }  
    }
}
