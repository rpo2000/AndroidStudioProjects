package taylormarkryan.ticketviewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DataProvider{

    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>>QuestionsDetails = new HashMap<String, List<String>>();
        List<String> Story_Points = new ArrayList<String>();
        Story_Points.add("What happens if someone tries to edit a page at the same time as someone else?");
        Story_Points.add("If another user is editing the same page as you, Confluence will display a message above your edit screen indicating who user is and when they last edited.");
        Story_Points.add("What happens if two of us are editing the same page and the other user saves before I do?");
        Story_Points.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        List<String> Backlog_Management = new ArrayList<String>();
        Backlog_Management.add("What happens if someone tries to edit a page at the same time as someone else?");
        Backlog_Management.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        Backlog_Management.add("Connecting to SSL services");
        Backlog_Management.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        List<String> JIRA_Concepts = new ArrayList<String>();
        JIRA_Concepts.add("What happens if someone tries to edit a page at the same time as someone else?");
        JIRA_Concepts.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        JIRA_Concepts.add("Connecting to SSL services");
        JIRA_Concepts.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        List<String>  Importing_Syncing_Updating = new ArrayList<String>();
        Importing_Syncing_Updating.add("How to Activate Header Row for Subtask List in Issue Detail View");
        Importing_Syncing_Updating.add("How to Activate Header Row for Subtask List in Issue Detail View");
        Importing_Syncing_Updating.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        Importing_Syncing_Updating.add("How can I control the editing of issue fields via workflow?");
        List<String> Graphical_Schedule = new ArrayList<String>();
        Graphical_Schedule.add("What happens if someone tries to edit a page at the same time as someone else?");
        Graphical_Schedule.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        Graphical_Schedule.add("Connecting to SSL services");
        Graphical_Schedule.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        List<String> Prerequisites_and_Permissions = new ArrayList<String>();
        Prerequisites_and_Permissions.add("What happens if someone tries to edit a page at the same time as someone else?");
        Prerequisites_and_Permissions.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        Prerequisites_and_Permissions.add("Merging your changes (technique 1)");
        Prerequisites_and_Permissions.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        List<String> Scheduling = new ArrayList<String>();
        Scheduling.add("What happens if someone tries to edit a page at the same time as someone else?");
        Scheduling.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        Scheduling.add("Connecting to SSL services");
        Scheduling.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        List<String> Sprints = new ArrayList<String>();
        Sprints.add("What happens if someone tries to edit a page at the same time as someone else?");
        Sprints.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");
        Sprints.add("Connecting to SSL services");
        Sprints.add("If someone else has saved the page before you, when you click Save, Confluence will check if there are any conflicts between your changes and theirs. If there are no conflicting changes, Confluence will merge the changes.");

        QuestionsDetails.put("Story Points", Story_Points);
        QuestionsDetails.put("Backlog Management", Backlog_Management);
        QuestionsDetails.put("JIRA Concepts", JIRA_Concepts);
        QuestionsDetails.put("Importing Syncing Updating", Importing_Syncing_Updating);
        QuestionsDetails.put("Graphical Schedule", Graphical_Schedule);
        QuestionsDetails.put("Prerequisites and Permissions", Prerequisites_and_Permissions);
        QuestionsDetails.put("Scheduling", Scheduling);
        QuestionsDetails.put("Sprints", Sprints);


        return QuestionsDetails;

    }


}