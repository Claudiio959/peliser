package yoa.pmdm.claudio.peliser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textCorreo, textContra;
    EditText textPoncorreo,textPoncontra;
    Button btnRegis, btnEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        textCorreo=(TextView) findViewById(R.id.textCorreo);
        textContra=(TextView) findViewById(R.id.textContra);
        textPoncontra=(EditText) findViewById(R.id.textPoncontra);
        textPoncorreo=(EditText) findViewById(R.id.textPoncorreo);
        btnEntrar=(Button) findViewById(R.id.btnEntrar);
        btnRegis=(Button) findViewById(R.id.btnRegis);

        btnRegis.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,registro.class);
                startActivity(i);
            }
        } );


    }
}
