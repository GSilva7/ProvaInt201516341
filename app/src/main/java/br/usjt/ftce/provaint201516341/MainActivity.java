/**
 * @Autor: Gabriel Gonçalves da Silva - 201516341
 */
package br.usjt.ftce.provaint201516341;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends Activity
{
    private EditText numero, vezes;
    public static final String CHAVE = "br.usjt.ftce.calculadora.resultado";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        /**
         * @Autor: Gabriel Gonçalves da Silva - 201516341
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = (EditText)findViewById(R.id.tabuada);
        vezes = (EditText)findViewById(R.id.vezes);
    }

    public void calcular(View view)
    {
        /**
         * @Autor: Gabriel Gonçalves da Silva - 201516341
         */
        Intent intent = new Intent(this, Resultado.class);
        intent.putExtra("numero", Integer.parseInt(numero.getText().toString()));
        intent.putExtra("vezes", Integer.parseInt(vezes.getText().toString()));
        startActivity(intent);
    }
}
