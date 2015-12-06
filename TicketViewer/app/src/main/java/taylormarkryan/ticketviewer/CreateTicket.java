package taylormarkryan.ticketviewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateTicket extends AppCompatActivity {

    Button save;
    ArrayList<String> addArray = new ArrayList<String>();
    EditText txt;
    ListView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_ticket);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txt = (EditText) findViewById(R.id.editText);
        show = (ListView) findViewById(R.id.listView);
        save = (Button) findViewById(R.id.buttonArray);
        save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String getInput = txt.getText().toString();



                if (addArray.contains(getInput)) {
                    Toast.makeText(getBaseContext(), "Item already added to the Array", Toast.LENGTH_LONG).show();
                } else if (getInput == null || getInput.trim().equals("")) {
                    Toast.makeText(getBaseContext(), "Input Field is Empty", Toast.LENGTH_LONG).show();
                } else {
                    addArray.add(getInput);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(CreateTicket.this, android.R.layout.simple_list_item_1),addArray);
                    show.setAdapter(adapter);
                    ((EditText)findViewById(R.id.editText)).setText(" ");
                }
            }
        });
    }
}


