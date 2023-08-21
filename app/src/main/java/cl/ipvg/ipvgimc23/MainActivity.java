package cl.ipvg.ipvgimc23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText peso,altura;
     Button aceptar;
     TextView resultado;
     TextView mensaje;

     Float fpeso,faltura,fresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            peso = (EditText) findViewById(R.id.etPeso);
            altura = (EditText) findViewById(R.id.etAltura);
            aceptar = (Button) findViewById(R.id.tvAceptar);
            resultado = (TextView) findViewById(R.id.tvResultado);
            mensaje = (TextView) findViewById(R.id.tvMensaje);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    fpeso = Float.parseFloat(peso.getText().toString());
                    faltura = Float.parseFloat(altura.getText().toString());
                    // resultado=(peso/(altura*altura))

                    fresultado = fpeso / (faltura * faltura);
                    resultado.setText("Resultado IMC: " + fresultado);
                } catch (NumberFormatException e)
                {
                    resultado.setText("Error en el Resultado del IMC");
                }

                if (fresultado > 30) {
                    mensaje.setText("SobrePeso");
                }
                else
                {
                    mensaje.setText("Normal");
                }
            }


        });
    }
}