package com.ebookfrenzy.creativeproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ryan on 11/27/2015.
 */
public class DataProvider {

    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>>MoviesDetails = new HashMap<String, List<String>>();
        List<String> Action_Movies = null; new ArrayList<String>();
        Action_Movies.add("300");
        Action_Movies.add("300");
        Action_Movies.add("300");
        Action_Movies.add("300");
        List<String> Romantic_Movies = null; new ArrayList<String>();
        Romantic_Movies.add("300");
        Romantic_Movies.add("300");
        Romantic_Movies.add("300");
        Romantic_Movies.add("300");
        List<String> Comedy_Movies = null; new ArrayList<String>();
        Comedy_Movies.add("300");
        Comedy_Movies.add("300");
        Comedy_Movies.add("300");
        Comedy_Movies.add("300");
        List<String> Other_Movies = null; new ArrayList<String>();
        Other_Movies.add("300");
        Other_Movies.add("300");
        Other_Movies.add("300");
        Other_Movies.add("300");

        MoviesDetails.put("Action_Movies", Action_Movies);
        MoviesDetails.put("Romantic_Movies", Romantic_Movies);
        MoviesDetails.put("Comedy_Movies", Comedy_Movies);
        MoviesDetails.put("Other_Movies", Other_Movies);

        return MoviesDetails;

    }
}
