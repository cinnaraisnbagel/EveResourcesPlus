package com.robertwmurphy.everssplus;

public class Ore {

    private int oreID;
    private String oreName;
    private String rssOne;
    private String rssTwo;
    private String rssThree;
    private String rssFour;
    private String rarity; //How often it's found in New Eden
    private String highestSec; //The highest system security an ore is found
    private String lowestSec; //The lowest system security an ore is found
    private String processingLVL; //The processing skill levels that apply to a given ore

    //Constructor
    Ore(int id, String name, String rss1, String rss2, String rss3, String rss4, String rare, String highSec,
        String lowSec, String procLVL) {
        setOreID(id);
        setOreName(name);
        setRSSOne(rss1);
        setRSSTwo(rss2);
        setRSSThree(rss3);
        setRSSFour(rss4);
        setRarity(rare);
        setHighestSec(highSec);
        setLowestSec(lowSec);
        setProcessingLVL(procLVL);
    }

    //Setters
    public void setOreID(int id) {
        oreID = id;
    }

    public void setOreName(String name) {
        oreName = name;
    }

    public void setRSSOne(String rss1) {
        rssOne = rss1;
    }

    public void setRSSTwo(String rss2) {
        rssTwo = rss2;
    }

    public void setRSSThree(String rss3) {
        rssThree = rss3;
    }

    public void setRSSFour(String rss4) {
        rssFour = rss4;
    }

    public void setRarity(String rare) {
        rarity = rare;
    }

    public void setHighestSec(String highSec) {
        highestSec = highSec;
    }

    public void setLowestSec(String lowSec) {
        lowestSec = lowSec;
    }

    public void setProcessingLVL(String procLVL) {
        processingLVL = procLVL;
    }

    //Getters
    public int setOreID() {
        return oreID;
    }

    public String setOreName() {
        return oreName;
    }

    public String setRSSOne() {
        return rssOne;
    }

    public String setRSSTwo() {
        return rssTwo;
    }

    public String setRSSThree() {
        return rssThree;
    }

    public String setRSSFour() {
        return rssFour;
    }

    public String setRarity() {
        return rarity;
    }

    public String setHighestSec() {
        return highestSec;
    }

    public String setLowestSec() {
        return lowestSec;
    }

    public String setProcessingLVL() {
        return processingLVL;
    }
}

