package taylormarkryan.ticketviewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ryan on 11/30/2015.
 */
public class DataProvider{

    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>>QuestionsDetails = new HashMap<String, List<String>>();
        List<String> Story_Points = new ArrayList<String>();
        Story_Points.add("What happens if someone tries to edit a page at the same time as someone else?");
        Story_Points.add("How to Activate Header Row for Subtask List in Issue Detail View");
        Story_Points.add("Connecting to SSL services");
        Story_Points.add("How can I control the editing of issue fields via workflow?");
        List<String> Backlog_Management = new ArrayList<String>();
        Backlog_Management.add("What happens if someone tries to edit a page at the same time as someone else?");
        Backlog_Management.add("How to Activate Header Row for Subtask List in Issue Detail View");
        Backlog_Management.add("Connecting to SSL services");
        Backlog_Management.add("How can I control the editing of issue fields via workflow?");
        List<String> JIRA_Concepts = new ArrayList<String>();
        JIRA_Concepts.add("What happens if someone tries to edit a page at the same time as someone else?");
        JIRA_Concepts.add("How to Activate Header Row for Subtask List in Issue Detail View");
        JIRA_Concepts.add("Connecting to SSL services");
        JIRA_Concepts.add("How can I control the editing of issue fields via workflow?");
        List<String>  Importing_Syncing_Updating = new ArrayList<String>();
        Importing_Syncing_Updating.add("What happens if someone tries to edit a page at the same time as someone else?");
        Importing_Syncing_Updating.add("How to Activate Header Row for Subtask List in Issue Detail View");
        Importing_Syncing_Updating.add("Connecting to SSL services");
        Importing_Syncing_Updating.add("How can I control the editing of issue fields via workflow?");
        List<String> Graphical_Schedule = new ArrayList<String>();
        Graphical_Schedule.add("What happens if someone tries to edit a page at the same time as someone else?");
        Graphical_Schedule.add("How to Activate Header Row for Subtask List in Issue Detail View");
        Graphical_Schedule.add("Connecting to SSL services");
        Graphical_Schedule.add("How can I control the editing of issue fields via workflow?");
        List<String> Prerequisites_and_Permissions = new ArrayList<String>();
        Prerequisites_and_Permissions.add("What happens if someone tries to edit a page at the same time as someone else?");
        Prerequisites_and_Permissions.add("If two or more people try to edit a page simultaneously, the first one to save wins and the rest are notified that they can't save.");
        Prerequisites_and_Permissions.add("Merging your changes (technique 1)");
        Prerequisites_and_Permissions.add("This is simpler than technique 2, but risks losing your work: For a little while, your changes exist only in the clipboard.");
        List<String> Scheduling = new ArrayList<String>();
        Scheduling.add("What happens if someone tries to edit a page at the same time as someone else?");
        Scheduling.add("How to Activate Header Row for Subtask List in Issue Detail View");
        Scheduling.add("Connecting to SSL services");
        Scheduling.add("How can I control the editing of issue fields via workflow?");
        List<String> Sprints = new ArrayList<String>();
        Sprints.add("What happens if someone tries to edit a page at the same time as someone else?");
        Sprints.add("How to Activate Header Row for Subtask List in Issue Detail View");
        Sprints.add("Connecting to SSL services");
        Sprints.add("How can I control the editing of issue fields via workflow?");

        QuestionsDetails.put("Story_Points", Story_Points);
        QuestionsDetails.put("Backlog_Management", Backlog_Management);
        QuestionsDetails.put("JIRA_Concepts", JIRA_Concepts);
        QuestionsDetails.put(" Importing_Syncing_Updating", Importing_Syncing_Updating);
        QuestionsDetails.put("Graphical_Schedule", Graphical_Schedule);
        QuestionsDetails.put("Prerequisites_and_Permissions", Prerequisites_and_Permissions);
        QuestionsDetails.put("Scheduling", Scheduling);
        QuestionsDetails.put("Sprints", Sprints);


        return QuestionsDetails;

    }


}