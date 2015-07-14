package me.camerondoyle.votingreform;

public class Candidate
{
    int id, constid;
    String name, party;
    
    public Candidate(int id, int constid, String name, String party)
    {
        this.id = id;
        this.constid = constid;
        this.name = name;
        this.party = party;
    }
}
