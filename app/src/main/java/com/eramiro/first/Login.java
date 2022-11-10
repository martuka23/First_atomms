package com.eramiro.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

/**
 * This is the login
 * @author eramiro
 */

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


//    Glide for loading girls
        ImageView fondo = findViewById(R.id.tree);

        Glide.with(this)
            // .load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
              .load(R.drawable.tree)
                .transition(DrawableTransitionOptions.withCrossFade(100))

//                .centerCrop()
//                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.fucsia_200)))
//                .circleCrop()
                .into(fondo);




    }




    // Method for Vaccinate button
    public void openMain(View v) {
        Intent intent = new Intent(Login.this, Main.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void openSignup(View v) {
        Intent intent = new Intent(Login.this, Signup.class);
        startActivity(intent);
    }

}

