package com.coachs;

import android.support.v7.app.ActionBarActivity;
import android.text.style.ClickableSpan;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PantallaPrincipal extends ActionBarActivity {
	private Button btnPlantel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantalla_principal);

		btnPlantel = (Button) findViewById(R.id.btnPlantel);
		
		
		btnPlantel.setOnClickListener(new ClickListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pantalla_principal, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private class ClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			Intent miIntent = new Intent(PantallaPrincipal.this, Plantel.class);
			miIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(miIntent);
			
		}
		
	}
}
