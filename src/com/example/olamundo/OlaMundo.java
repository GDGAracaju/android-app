package com.example.olamundo;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OlaMundo extends Activity{

	private EditText inputNome; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ola_mundo);
        
        inputNome = (EditText) findViewById(R.id.input_nome);
        
//        Button enviarNome = (Button) findViewById(R.id.enviar_nome);
//        enviarNome.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//			}
//
//		});
//        
//        enviarNome.setOnClickListerner(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ola_mundo, menu);
        return true;
    }
    
    public void clicouNoBotaoEnviar(View v) {
		String nome = inputNome.getText().toString();
//		String digitou_o_nome = getString(R.string.digitou_o_nome);
//		
//		Toast.makeText(OlaMundo.this, digitou_o_nome + nome, Toast.LENGTH_LONG).show();
		
		Intent it = new Intent(this, MostrarNome.class);
		it.putExtra("nome", nome);
		startActivity(it);
		
		new TarefaAssincrona().execute("url qualquer");
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	
    	// TODO
    }
    
    private class TarefaAssincrona extends AsyncTask<String, Integer, String> {
    	
    	@Override
    	protected void onPreExecute() {
    		// TODO Auto-generated method stub
    		super.onPreExecute();
    	}

		@Override
		protected String doInBackground(String... params) {
			// TODO Auto-generated method stub
			// TODO o que ele vai fazer em background
			
			int i = 0;
			while (i < 100) {
				// consultar alguma pagina
				setProgress(i);
				i++;
			}
			return null;
		}
    	
		
		@Override
		protected void onPostExecute(String result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);
		}
    }
    
}
