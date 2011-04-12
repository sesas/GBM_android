package com.ecs160.gbm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button sendMess = (Button) findViewById(R.id.sendMessage);
        sendMess.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				sendMessage();
			}
		});
		

    }
	
    void sendMessage(){
    	Intent i = new Intent(this, SendMessage.class);
    	startActivity(i);    	
    }
}