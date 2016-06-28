package com.example.gwent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsoluteLayout;

/**
 * Created by Александр on 27.06.2016.
 */
public class GameActivity extends Activity implements View.OnClickListener {

    AbsoluteLayout AbsLay;

    int wrapContent = AbsoluteLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game);
    }

    @Override
    public void onClick(View v){


    }
}
