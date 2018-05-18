package com.example.dell.pradeepsdialer;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,clr,call,msg,hash,star;
    TextView txt;
    String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("CHECK", "oncreate : inside");
        txt=(TextView)findViewById(R.id.text);
        btn1=(Button)findViewById(R.id.one);
        btn2=(Button)findViewById(R.id.two);
        btn3=(Button)findViewById(R.id.three);
        btn4=(Button)findViewById(R.id.four);
        btn5=(Button)findViewById(R.id.five);
        btn6=(Button)findViewById(R.id.six);
        btn7=(Button)findViewById(R.id.seven);
        btn8=(Button)findViewById(R.id.eight);
        btn9=(Button)findViewById(R.id.nine);
        btn0=(Button)findViewById(R.id.zero);
        clr=(Button)findViewById(R.id.clear);
        call=(Button)findViewById(R.id.call);
        msg=(Button)findViewById(R.id.sms);
        hash=(Button)findViewById(R.id.hash);
        star=(Button) findViewById(R.id.star);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             str=str+"1";
                txt.setText(str);
                Log.d("CHECK"," frst button");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             str=str+"2";
                txt.setText(str);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             str=str+"3";
                txt.setText(str);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=str+"4";
                txt.setText(str);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=str+"5";
                txt.setText(str);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=str+"6";
                txt.setText(str);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=str+"7";
                txt.setText(str);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=str+"8";
                txt.setText(str);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=str+"9";
                txt.setText(str);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=str+"0";
                txt.setText(str);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str != null && str.length() > 0) {
                    str = str.substring(0, str.length() - 1);
                }
                txt.setText(str);

            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str="tel:"+str;
               Intent c=new Intent(Intent.ACTION_CALL,Uri.parse(str));
                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else
                {
                    startActivity(c);
                }

               str=" ";
                txt.setText(" ");
            }
        });
        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str="smsto:"+str;
             Intent m=new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                startActivity(m);
               str=" ";
                txt.setText(" ");
            }
        });
        hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=str+"#";
                txt.setText(str);
            }
        });
star.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        str=str+"*";
        txt.setText(str);
    }
});
    }
}
