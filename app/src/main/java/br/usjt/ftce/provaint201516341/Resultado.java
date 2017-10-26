/**
 * @Autor: Gabriel Gonçalves da Silva - 201516341
 */
package br.usjt.ftce.provaint201516341;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Resultado extends Activity
{
    /**
     * @Autor: Gabriel Gonçalves da Silva - 201516341
     */
    public ArrayList<String> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        lista = calcula(intent.getIntExtra("numero", 5), intent.getIntExtra("vezes", 10));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        ListView listsView = (ListView)findViewById(R.id.listView);
        listsView.setAdapter(adapter);

    }

    public ArrayList<String> calcula(int num, int vez)
    {
        ArrayList<String> list = new ArrayList<String>();
        String aux = "";
        for (int i = 1; i == vez; i++)
        {
            int resposta = num * vez;
            aux = num + " X " + i + " = " + resposta;
            list.add(i - 1, aux);
        }
        return list;
    }
}
