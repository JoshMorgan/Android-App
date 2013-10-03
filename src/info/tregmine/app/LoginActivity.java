package info.tregmine.app;

import info.tregmine.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        
        Button login = (Button) findViewById(R.id.btnLogin);
        
        login.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// Switching to Menu
				Intent i = new Intent(getApplicationContext(), MenuActivity.class);
				startActivity(i);
			}
		});
    }
}