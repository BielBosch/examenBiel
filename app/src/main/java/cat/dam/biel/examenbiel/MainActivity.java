package cat.dam.biel.examenbiel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //creacio gridLayouts
    GridLayout gl_esquerra, gl_dret;
    //creacio imatgeviews
    ImageView img_esquerra_r1c1, img_esquerra_r1c2, img_esquerra_r2c1, img_esquerra_r2c2;
    ImageView img_dreta_r1c1, img_dreta_r1c2, img_dreta_r2c1, img_dreta_r2c2;
    //creacio imatgebuttons
    ImageButton greater, equal, less;
    //creacio buttons
    Button btn_sortir;
    //creacio tv
    TextView tv_punts;

    //variables i imports
    Random r = new Random();
    int sumaRandsTotalEsquerra = 0;
    int sumaRandsTotalDreta = 0;

    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //decleracio grid
        gl_esquerra = (GridLayout) findViewById(R.id.gl_esquerra);
        gl_dret = (GridLayout) findViewById(R.id.gl_dret);
        //declaracio iv esquerra
        img_esquerra_r1c1 = (ImageView) findViewById(R.id.img_esquerra_r1c1);
        img_esquerra_r1c2 = (ImageView) findViewById(R.id.img_esquerra_r1c2);
        img_esquerra_r2c1 = (ImageView) findViewById(R.id.img_esquerra_r2c1);
        img_esquerra_r2c2 = (ImageView) findViewById(R.id.img_esquerra_r2c2);
        //declaracio iv dreta
        img_dreta_r1c1 = (ImageView) findViewById(R.id.img_dreta_r1c1);
        img_dreta_r1c2 = (ImageView) findViewById(R.id.img_dreta_r1c2);
        img_dreta_r2c1 = (ImageView) findViewById(R.id.img_dreta_r2c1);
        img_dreta_r2c2 = (ImageView) findViewById(R.id.img_dreta_r2c2);
        //declaracio Image buttons
        greater = (ImageButton) findViewById(R.id.greater);
        equal = (ImageButton) findViewById(R.id.equal);
        less = (ImageButton) findViewById(R.id.less);
        //declaracio Buttons
        btn_sortir = (Button) findViewById(R.id.btn_sortir);
        //declaracio tv
        tv_punts = (TextView) findViewById(R.id.tv_punts);

        //generar animals
        switchosEsquerra();
        switchosDreta();

        //listentrs dels buttons
        greater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprovarGran(sumaRandsTotalEsquerra,sumaRandsTotalDreta);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprovarIgual(sumaRandsTotalEsquerra,sumaRandsTotalDreta);
            }
        });

        less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprovarPetit(sumaRandsTotalEsquerra,sumaRandsTotalDreta);
            }
        });

        //boto que surt de lapplicacio ( no demana confirmacio)
        btn_sortir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }

    //funcio que em genera un random
    public int crearRandom() {
        int rand = r.nextInt(10) + 1;
        return rand;
    }

    //funcions que seguint un switch em generern les imatges referenciades a un numero aletori generat a la funcio crearRandom()
    public void switchosEsquerra(){
        switch (crearRandom()) {
            case 1:
                img_esquerra_r1c1.setImageResource(R.drawable.i00);
                break;
            case 2:
                img_esquerra_r1c1.setImageResource(R.drawable.i01);
                sumaRandsTotalEsquerra += 1;
                break;
            case 3:
                img_esquerra_r1c1.setImageResource(R.drawable.i02);
                sumaRandsTotalEsquerra += 2;
                break;
            case 4:
                img_esquerra_r1c1.setImageResource(R.drawable.i03);
                sumaRandsTotalEsquerra += 3;
                break;
            case 5:
                img_esquerra_r1c1.setImageResource(R.drawable.i04);
                sumaRandsTotalEsquerra += 4;
                break;
            case 6:
                img_esquerra_r1c1.setImageResource(R.drawable.i05);
                sumaRandsTotalEsquerra += 5;
                break;
            case 7:
                img_esquerra_r1c1.setImageResource(R.drawable.i06);
                sumaRandsTotalEsquerra += 6;
                break;
            case 8:
                img_esquerra_r1c1.setImageResource(R.drawable.i07);
                sumaRandsTotalEsquerra += 7;
                break;
            case 9:
                img_esquerra_r1c1.setImageResource(R.drawable.i08);
                sumaRandsTotalEsquerra += 8;
                break;
            case 10:
                img_esquerra_r1c1.setImageResource(R.drawable.i09);
                sumaRandsTotalEsquerra += 9;
                break;
            case 11:
                img_esquerra_r1c1.setImageResource(R.drawable.i10);
                sumaRandsTotalEsquerra += 10;
                break;
        } //esquerra esquerra adalt

        switch (crearRandom()) {
            case 1:
                img_esquerra_r1c2.setImageResource(R.drawable.i00);
                break;
            case 2:
                img_esquerra_r1c2.setImageResource(R.drawable.i01);
                sumaRandsTotalEsquerra += 1;
                break;
            case 3:
                img_esquerra_r1c2.setImageResource(R.drawable.i02);
                sumaRandsTotalEsquerra += 2;
                break;
            case 4:
                img_esquerra_r1c2.setImageResource(R.drawable.i03);
                sumaRandsTotalEsquerra += 3;
                break;
            case 5:
                img_esquerra_r1c2.setImageResource(R.drawable.i04);
                sumaRandsTotalEsquerra += 4;
                break;
            case 6:
                img_esquerra_r1c2.setImageResource(R.drawable.i05);
                sumaRandsTotalEsquerra += 5;
                break;
            case 7:
                img_esquerra_r1c2.setImageResource(R.drawable.i06);
                sumaRandsTotalEsquerra += 6;
                break;
            case 8:
                img_esquerra_r1c2.setImageResource(R.drawable.i07);
                sumaRandsTotalEsquerra += 7;
                break;
            case 9:
                img_esquerra_r1c2.setImageResource(R.drawable.i08);
                sumaRandsTotalEsquerra += 8;
                break;
            case 10:
                img_esquerra_r1c2.setImageResource(R.drawable.i09);
                sumaRandsTotalEsquerra += 9;
                break;
            case 11:
                img_esquerra_r1c2.setImageResource(R.drawable.i10);
                sumaRandsTotalEsquerra += 10;
                break;
        } //esquerra esquerra abaix

        switch (crearRandom()) {
            case 1:
                img_esquerra_r2c1.setImageResource(R.drawable.i00);
                break;
            case 2:
                img_esquerra_r2c1.setImageResource(R.drawable.i01);
                sumaRandsTotalEsquerra += 1;
                break;
            case 3:
                img_esquerra_r2c1.setImageResource(R.drawable.i02);
                sumaRandsTotalEsquerra += 2;
                break;
            case 4:
                img_esquerra_r2c1.setImageResource(R.drawable.i03);
                sumaRandsTotalEsquerra += 3;
                break;
            case 5:
                img_esquerra_r2c1.setImageResource(R.drawable.i04);
                sumaRandsTotalEsquerra += 4;
                break;
            case 6:
                img_esquerra_r2c1.setImageResource(R.drawable.i05);
                sumaRandsTotalEsquerra += 5;
                break;
            case 7:
                img_esquerra_r2c1.setImageResource(R.drawable.i06);
                sumaRandsTotalEsquerra += 6;
                break;
            case 8:
                img_esquerra_r2c1.setImageResource(R.drawable.i07);
                sumaRandsTotalEsquerra += 7;
                break;
            case 9:
                img_esquerra_r2c1.setImageResource(R.drawable.i08);
                sumaRandsTotalEsquerra += 8;
                break;
            case 10:
                img_esquerra_r2c1.setImageResource(R.drawable.i09);
                sumaRandsTotalEsquerra += 9;
                break;
            case 11:
                img_esquerra_r2c1.setImageResource(R.drawable.i10);
                sumaRandsTotalEsquerra += 10;
                break;
        }//esquerra dreta adalt

        switch (crearRandom()) {
            case 1:
                img_esquerra_r2c2.setImageResource(R.drawable.i00);
                break;
            case 2:
                img_esquerra_r2c2.setImageResource(R.drawable.i01);
                sumaRandsTotalEsquerra += 1;
                break;
            case 3:
                img_esquerra_r2c2.setImageResource(R.drawable.i02);
                sumaRandsTotalEsquerra += 2;
                break;
            case 4:
                img_esquerra_r2c2.setImageResource(R.drawable.i03);
                sumaRandsTotalEsquerra += 3;
                break;
            case 5:
                img_esquerra_r2c2.setImageResource(R.drawable.i04);
                sumaRandsTotalEsquerra += 4;
                break;
            case 6:
                img_esquerra_r2c2.setImageResource(R.drawable.i05);
                sumaRandsTotalEsquerra += 5;
                break;
            case 7:
                img_esquerra_r2c2.setImageResource(R.drawable.i06);
                sumaRandsTotalEsquerra += 6;
                break;
            case 8:
                img_esquerra_r2c2.setImageResource(R.drawable.i07);
                sumaRandsTotalEsquerra += 7;
                break;
            case 9:
                img_esquerra_r2c2.setImageResource(R.drawable.i08);
                sumaRandsTotalEsquerra += 8;
                break;
            case 10:
                img_esquerra_r2c2.setImageResource(R.drawable.i09);
                sumaRandsTotalEsquerra += 9;
                break;
            case 11:
                img_esquerra_r2c2.setImageResource(R.drawable.i10);
                sumaRandsTotalEsquerra += 10;
                break;
        }//esquerra dreta adalt
    }

    public void switchosDreta(){
        switch (crearRandom()) {
            case 1:
                img_dreta_r1c1.setImageResource(R.drawable.i00);
                break;
            case 2:
                img_dreta_r1c1.setImageResource(R.drawable.i01);
                sumaRandsTotalDreta += 1;
                break;
            case 3:
                img_dreta_r1c1.setImageResource(R.drawable.i02);
                sumaRandsTotalDreta += 2;
                break;
            case 4:
                img_dreta_r1c1.setImageResource(R.drawable.i03);
                sumaRandsTotalDreta += 3;
                break;
            case 5:
                img_dreta_r1c1.setImageResource(R.drawable.i04);
                sumaRandsTotalDreta += 4;
                break;
            case 6:
                img_dreta_r1c1.setImageResource(R.drawable.i05);
                sumaRandsTotalDreta += 5;
                break;
            case 7:
                img_dreta_r1c1.setImageResource(R.drawable.i06);
                sumaRandsTotalDreta += 6;
                break;
            case 8:
                img_dreta_r1c1.setImageResource(R.drawable.i07);
                sumaRandsTotalDreta += 7;
                break;
            case 9:
                img_dreta_r1c1.setImageResource(R.drawable.i08);
                sumaRandsTotalDreta += 8;
                break;
            case 10:
                img_dreta_r1c1.setImageResource(R.drawable.i09);
                sumaRandsTotalDreta += 9;
                break;
            case 11:
                img_dreta_r1c1.setImageResource(R.drawable.i10);
                sumaRandsTotalDreta += 10;
                break;
        } //dreta esquerra adalt

        switch (crearRandom()) {
            case 1:
                img_dreta_r1c2.setImageResource(R.drawable.i00);
                break;
            case 2:
                img_dreta_r1c2.setImageResource(R.drawable.i01);
                sumaRandsTotalDreta += 1;
                break;
            case 3:
                img_dreta_r1c2.setImageResource(R.drawable.i02);
                sumaRandsTotalDreta += 2;
                break;
            case 4:
                img_dreta_r1c2.setImageResource(R.drawable.i03);
                sumaRandsTotalDreta += 3;
                break;
            case 5:
                img_dreta_r1c2.setImageResource(R.drawable.i04);
                sumaRandsTotalDreta += 4;
                break;
            case 6:
                img_dreta_r1c2.setImageResource(R.drawable.i05);
                sumaRandsTotalDreta += 5;
                break;
            case 7:
                img_dreta_r1c2.setImageResource(R.drawable.i06);
                sumaRandsTotalDreta += 6;
                break;
            case 8:
                img_dreta_r1c2.setImageResource(R.drawable.i07);
                sumaRandsTotalDreta += 7;
                break;
            case 9:
                img_dreta_r1c2.setImageResource(R.drawable.i08);
                sumaRandsTotalDreta += 8;
                break;
            case 10:
                img_dreta_r1c2.setImageResource(R.drawable.i09);
                sumaRandsTotalDreta += 9;
                break;
            case 11:
                img_dreta_r1c2.setImageResource(R.drawable.i10);
                sumaRandsTotalDreta += 10;
                break;
        } //dreta esquerra abaix

        switch (crearRandom()) {
            case 1:
                img_dreta_r2c1.setImageResource(R.drawable.i00);
                break;
            case 2:
                img_dreta_r2c1.setImageResource(R.drawable.i01);
                sumaRandsTotalDreta += 1;
                break;
            case 3:
                img_dreta_r2c1.setImageResource(R.drawable.i02);
                sumaRandsTotalDreta += 2;
                break;
            case 4:
                img_dreta_r2c1.setImageResource(R.drawable.i03);
                sumaRandsTotalDreta += 3;
                break;
            case 5:
                img_dreta_r2c1.setImageResource(R.drawable.i04);
                sumaRandsTotalDreta += 4;
                break;
            case 6:
                img_dreta_r2c1.setImageResource(R.drawable.i05);
                sumaRandsTotalDreta += 5;
                break;
            case 7:
                img_dreta_r2c1.setImageResource(R.drawable.i06);
                sumaRandsTotalDreta += 6;
                break;
            case 8:
                img_dreta_r2c1.setImageResource(R.drawable.i07);
                sumaRandsTotalDreta += 7;
                break;
            case 9:
                img_dreta_r2c1.setImageResource(R.drawable.i08);
                sumaRandsTotalDreta += 8;
                break;
            case 10:
                img_dreta_r2c1.setImageResource(R.drawable.i09);
                sumaRandsTotalDreta += 9;
                break;
            case 11:
                img_dreta_r2c1.setImageResource(R.drawable.i10);
                sumaRandsTotalDreta += 10;
                break;
        }//dreta dreta adalt

        switch (crearRandom()) {
            case 1:
                img_dreta_r2c2.setImageResource(R.drawable.i00);
                break;
            case 2:
                img_dreta_r2c2.setImageResource(R.drawable.i01);
                sumaRandsTotalDreta += 1;
                break;
            case 3:
                img_dreta_r2c2.setImageResource(R.drawable.i02);
                sumaRandsTotalDreta += 2;
                break;
            case 4:
                img_dreta_r2c2.setImageResource(R.drawable.i03);
                sumaRandsTotalDreta += 3;
                break;
            case 5:
                img_dreta_r2c2.setImageResource(R.drawable.i04);
                sumaRandsTotalDreta += 4;
                break;
            case 6:
                img_dreta_r2c2.setImageResource(R.drawable.i05);
                sumaRandsTotalDreta += 5;
                break;
            case 7:
                img_dreta_r2c2.setImageResource(R.drawable.i06);
                sumaRandsTotalDreta += 6;
                break;
            case 8:
                img_dreta_r2c2.setImageResource(R.drawable.i07);
                sumaRandsTotalDreta += 7;
                break;
            case 9:
                img_dreta_r2c2.setImageResource(R.drawable.i08);
                sumaRandsTotalDreta += 8;
                break;
            case 10:
                img_dreta_r2c2.setImageResource(R.drawable.i09);
                sumaRandsTotalDreta += 9;
                break;
            case 11:
                img_dreta_r2c2.setImageResource(R.drawable.i10);
                sumaRandsTotalDreta += 10;
                break;
        }//dreta dreta adalt
    }


    //funcio que comprova la sumatotal de les imatges dels dos costat i comprva si son iguals
    public void comprovarIgual(int num1, int num2) {
        if (num1 == num2) {
            Toast.makeText(getApplicationContext(), "CORRECTE!!! hi han " + sumaRandsTotalEsquerra +" a l'Esquerra i " + sumaRandsTotalDreta +  " a la Dreta", Toast.LENGTH_SHORT).show();

            contador++;
            gl_esquerra.removeAllViewsInLayout();
            gl_dret.removeAllViewsInLayout();
            tv_punts.setText("  "+contador);
            //generar animals
            switchosEsquerra();
            switchosDreta();

        } else {
            Toast.makeText(getApplicationContext(), "Incorrecte hi han " + sumaRandsTotalEsquerra +" a l'Esquerra i " + sumaRandsTotalDreta +  " a la Dreta", Toast.LENGTH_SHORT).show();
            contador = 0;
            tv_punts.setText("  " + contador); //reincia el contador a 0 quane s falla


        }
    }

    //funcio que comprova la sumatotal de les imatges dels dos costat i comprva si es mes gran

    public void comprovarGran(int num1, int num2) {
        if (num1 > num2) {
            Toast.makeText(getApplicationContext(), "CORRECTE!!! hi han " + sumaRandsTotalEsquerra +" a l'Esquerra i " + sumaRandsTotalDreta +  " a la Dreta", Toast.LENGTH_SHORT).show();

            contador++;
            gl_esquerra.removeAllViewsInLayout();
            gl_dret.removeAllViewsInLayout();
            tv_punts.setText("  "+contador);
            //generar animals
            switchosEsquerra();
            switchosDreta();

        } else {
            Toast.makeText(getApplicationContext(), "Incorrecte hi han " + sumaRandsTotalEsquerra +" a l'Esquerra i " + sumaRandsTotalDreta +  " a la Dreta", Toast.LENGTH_SHORT).show();
            contador = 0;
            tv_punts.setText("  " + contador); //reincia el contador a 0 quane s falla


        }
    }

    //funcio que comprova la sumatotal de les imatges dels dos costat i comprva si es mes petit

    public void comprovarPetit(int num1, int num2){
        if (num1 < num2) {
            Toast.makeText(getApplicationContext(), "CORRECTE!!! hi han " + sumaRandsTotalEsquerra +" a l'Esquerra i " + sumaRandsTotalDreta +  " a la Dreta", Toast.LENGTH_SHORT).show();

            contador++;
            gl_esquerra.removeAllViewsInLayout();
            gl_dret.removeAllViewsInLayout();
            tv_punts.setText("  "+contador);
            //generar animals
            switchosEsquerra();
            switchosDreta();

        } else {
            Toast.makeText(getApplicationContext(), "Incorrecte hi han " + sumaRandsTotalEsquerra +" a l'Esquerra i " + sumaRandsTotalDreta +  " a la Dreta", Toast.LENGTH_SHORT).show();
            contador = 0;
            tv_punts.setText("  " + contador); //reincia el contador a 0 quane s falla

        }
    }
}