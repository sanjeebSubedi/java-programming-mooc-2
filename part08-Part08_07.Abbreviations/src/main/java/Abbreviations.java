/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanjeeb
 */

import java.util.HashMap;

public class Abbreviations {
    HashMap<String, String> abbs;
    
    public Abbreviations() {
        abbs = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbs.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbs.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.abbs.get(abbreviation);
    }
}
