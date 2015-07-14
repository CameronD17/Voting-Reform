package me.camerondoyle.votingreform;

import java.util.ArrayList;

public class Constituency
{
    int id, numVoters, numSeats, ceiling, votersPerMP;
    String name;
    ArrayList<Voter> voters;
    ArrayList<Candidate> candidates;
    
    public Constituency(int i, String constituency, int voterCount, int seatCount, int voterCeiling, int perMP, ArrayList<Candidate> cand)
    {
        id = i;
        name = constituency;
        numVoters = voterCount;
        numSeats = seatCount;
        ceiling = voterCeiling;
        votersPerMP = perMP;
        candidates = cand;
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
