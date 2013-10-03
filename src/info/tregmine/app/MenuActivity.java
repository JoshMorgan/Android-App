package info.tregmine.app;

import info.tregmine.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
        
        /**
         * Creating all buttons instances
         * */
        Button btn_chat = (Button) findViewById(R.id.btn_chat);

        Button btn_forums = (Button) findViewById(R.id.btn_forums);

        Button btn_donate = (Button) findViewById(R.id.btn_donate);

        Button btn_reports = (Button) findViewById(R.id.btn_reports);
        
        Button btn_commands = (Button) findViewById(R.id.btn_commands);
        
        Button btn_support = (Button) findViewById(R.id.btn_support);
        
        /**
         * Handling all button click events
         * */
        btn_chat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), ChatActivity.class);
				startActivity(i);
			}
		});
        
        btn_forums.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), ForumsActivity.class);
				startActivity(i);
			}
		});
        
        btn_donate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), DonateActivity.class);
				startActivity(i);
			}
		});
        
        btn_reports.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), ReportsActivity.class);
				startActivity(i);
			}
		});
        
        btn_commands.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), CommandsActivity.class);
				startActivity(i);
			}
		});

        btn_support.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(), SupportActivity.class);
				startActivity(i);
			}
		});
    }
}