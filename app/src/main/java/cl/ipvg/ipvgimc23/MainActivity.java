package cl.ipvg.ipvgimc23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditTest peso,altura;
    private Button aceptar;
    private TextView resultado;

    private Float fpeso,faltura,fresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = (EditTest) findViewById(R.id.etPeso);
        altura = (EditTest) findViewById(R.id.etAltura);
        aceptar = (Button) findViewById(R.id.tvAceptar);
        resultado = (TextView) findViewById(R.id.tvResultado);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fpeso=peso.getText.
            }
        });
    }
}