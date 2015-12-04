package taylormarkryan.ticketviewer;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ryan on 11/30/2015.
 */
public class FrequentlyAskedQuestions extends AppCompatPreferenceActivity {
    HashMap<String, List<String>> Questions_category;
    List<String> Questions_list;
    ExpandableListView Exp_list;
    QuestionsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequently_asked_questions);
        Exp_list = (ExpandableListView) findViewById(R.id.list);
        Questions_category = DataProvider .getInfo();
        Questions_list = new ArrayList<>(Questions_category.keySet());
        adapter = new QuestionsAdapter(this, Questions_category, Questions_list);
        Exp_list.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}