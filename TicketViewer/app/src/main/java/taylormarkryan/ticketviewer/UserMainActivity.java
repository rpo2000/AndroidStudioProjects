package taylormarkryan.ticketviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class UserMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);

    }

    public void onClickCreateTicket(View v){
        Intent createTicket = new Intent(this, CreateTicket.class);
        startActivity(createTicket);
    }

    public void onClickMyTickets(View v){
        Intent myTickets = new Intent(this, CreateTicket.class);
        startActivity(myTickets);
    }

    public void onClickFaq(View v){
        Intent Faq = new Intent(this, FrequentlyAskedQuestions.class);
        startActivity(Faq);
    }

    public void onClickProfile(View v){
        Intent profile = new Intent(this, ProfileActivity.class);
        startActivity(profile);

    }

    public void onClickCallTechSupport(View v){
        Intent techSupport = new Intent(this, ContactSupportActivity.class);
        startActivity(techSupport);
    }


}
