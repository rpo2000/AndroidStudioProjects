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
        List<String> Action_Movies = new ArrayList<String>();
        Action_Movies.add("300");
        Action_Movies.add("Die Hard");
        Action_Movies.add("Terminator");
        Action_Movies.add("Avengers");
        List<String> Romantic_Movies = new ArrayList<String>();
        Romantic_Movies.add("Titanic");
        Romantic_Movies.add("Love Actually");
        Romantic_Movies.add("The Notebook");
        Romantic_Movies.add("Pretty Woman");
        List<String> Comedy_Movies = new ArrayList<String>();
        Comedy_Movies.add("The Big Lebowski");
        Comedy_Movies.add("American Pie");
        Comedy_Movies.add("Shaun of the Dead");
        Comedy_Movies.add("Dumb and Dumber");
        List<String> Other_Movies = new ArrayList<String>();
        Other_Movies.add("Boyhood");
        Other_Movies.add("Clerks");
        Other_Movies.add("Requiem for a Dream");
        Other_Movies.add("500 Days of Summer");

        MoviesDetails.put("Action_Movies", Action_Movies);
        MoviesDetails.put("Romantic_Movies", Romantic_Movies);
        MoviesDetails.put("Comedy_Movies", Comedy_Movies);
        MoviesDetails.put("Other_Movies", Other_Movies);

        return MoviesDetails;

    }
}
