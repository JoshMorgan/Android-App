package info.tregmine.app;

import info.tregmine.app.R;
import android.app.Activity;
import android.os.Bundle;

public class ChatActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_layout);
    }
}
