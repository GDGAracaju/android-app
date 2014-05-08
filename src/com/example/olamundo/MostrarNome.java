package com.example.olamundo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MostrarNome extends Activity {

	private static String nomeMostrado = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mostrar_nome);
		
		String nome = getIntent().getExtras().getString("nome");
		
		nomeMostrado = nomeMostrado +","+ nome;
		
		TextView nomeView = (TextView) findViewById(R.id.mostrar_nome);
		nomeView.setText(nomeMostrado);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mostrar_nome, menu);
		return true;
	}

}
