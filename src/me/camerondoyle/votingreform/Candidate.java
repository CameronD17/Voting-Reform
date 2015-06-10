package me.camerondoyle.votingreform;

public class Candidate
{
    int id;
    String name, party;
    
    public Candidate(int id, String name, String party)
    {
        this.id = id;
        this.name = name;
        this.party = party;
    }
}
