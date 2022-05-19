package tailoc.dmt.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Chuyendoi;
    private EditText Duonglich;
    private TextView Amlich;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     Chuyendoi=(Button) findViewById(R.id.Chuyendoi);
     Duonglich=(EditText) findViewById(R.id.Duonglich);
     Amlich=(TextView) findViewById(R.id.Amlich);
     Chuyendoi.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String can[]={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
             String chi[]={"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
             String dl=Duonglich.getText().toString();
             int n=Integer.parseInt(dl);
             String am=can[n%10] + " "+chi[n%12];
             Amlich.setText(am);

         }
     });

    }
}