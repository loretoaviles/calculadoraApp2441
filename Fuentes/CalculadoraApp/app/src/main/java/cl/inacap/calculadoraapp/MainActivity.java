package cl.inacap.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText n1Txt;
    private EditText n2Txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.n1Txt = findViewById(R.id.n1txt);
        this.n2Txt = findViewById(R.id.n2Txt);
    }

    public void sumar(View v){
        int n1 = Integer.parseInt(this.n1Txt.getText().toString());
        int n2 = Integer.parseInt(this.n2Txt.getText().toString());

        Toast.makeText(this, "La suma es " + (n1+n2), Toast.LENGTH_SHORT).show();

    }

    public void restar(View v){
        int n1 = Integer.parseInt(this.n1Txt.getText().toString());
        int n2 = Integer.parseInt(this.n2Txt.getText().toString());

        Toast.makeText(this, "La resta es " + (n1-n2), Toast.LENGTH_SHORT).show();

    }
    public void multiplicar(View v){
        int n1 = Integer.parseInt(this.n1Txt.getText().toString());
        int n2 = Integer.parseInt(this.n2Txt.getText().toString());

        Toast.makeText(this, "La multiplicación es " + (n1*n2), Toast.LENGTH_SHORT).show();

    }
    public void dividir(View v){
        int n1 = Integer.parseInt(this.n1Txt.getText().toString());
        int n2 = Integer.parseInt(this.n2Txt.getText().toString());

        Toast.makeText(this, "La division es " + (n1/n2), Toast.LENGTH_SHORT).show();

    }
}