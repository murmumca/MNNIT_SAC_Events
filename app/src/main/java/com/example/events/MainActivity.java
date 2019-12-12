package com.example.events;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
public void mnnitculrav(View view){
    Intent intent=new Intent(MainActivity.this,mnnitculrav.class);
    startActivity(intent);
}
ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int images[]={R.drawable.cover,R.drawable.cull,R.drawable.ee,R.drawable.hack,R.drawable.ff,R.drawable.kaviya};
        v_flipper=findViewById(R.id.v_flipper);
        for(int image:images)
        {
            flipperImages(image);
        }
        TextView textView=(TextView)findViewById(R.id.avishkar);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void flipperImages(int image)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
