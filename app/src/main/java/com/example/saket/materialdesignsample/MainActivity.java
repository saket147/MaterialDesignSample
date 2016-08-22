package com.example.saket.materialdesignsample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.gc.materialdesign.views.ButtonFlat;
import com.gc.materialdesign.views.ButtonFloat;
import com.gc.materialdesign.views.ButtonFloatSmall;
import com.gc.materialdesign.views.ButtonRectangle;
import com.gc.materialdesign.views.Card;
import com.gc.materialdesign.views.CheckBox;
import com.gc.materialdesign.views.ProgressBarCircularIndeterminate;
import com.gc.materialdesign.views.ProgressBarDeterminate;
import com.gc.materialdesign.views.ProgressBarIndeterminate;
import com.gc.materialdesign.views.ProgressBarIndeterminateDeterminate;
import com.gc.materialdesign.views.ScrollView;
import com.gc.materialdesign.views.Slider;
import com.gc.materialdesign.views.Switch;
import com.gc.materialdesign.widgets.ColorSelector;
import com.gc.materialdesign.widgets.Dialog;
import com.gc.materialdesign.widgets.SnackBar;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    LinearLayout linearLayout;
    ButtonFlat buttonFlat;
    ButtonRectangle buttonRectangle;
    ButtonFloat buttonFloat;
    ButtonFloatSmall buttonFloatSmall;
    CheckBox checkBox;
    Switch aSwitch;
    ProgressBarCircularIndeterminate progressBarCircularIndeterminate;
    ProgressBarDeterminate progressBarDeterminate;
    ProgressBarIndeterminateDeterminate progressBarIndeterminateDeterminate;
    ProgressBarIndeterminate progressBarIndeterminate;
    Slider normalSlider,numberSlider;
    Context context;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView=(ScrollView)findViewById(R.id.scroll);
        linearLayout=(LinearLayout)findViewById(R.id.linear);
        buttonFlat=(ButtonFlat)findViewById(R.id.buttonflat);
        buttonRectangle=(ButtonRectangle)findViewById(R.id.buttonrectangle);
        buttonFloat=(ButtonFloat)findViewById(R.id.buttonFloat);
        buttonFloatSmall=(ButtonFloatSmall)findViewById(R.id.buttonFloatSmall);
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        aSwitch=(Switch)findViewById(R.id.switchView);
        progressBarCircularIndeterminate=(ProgressBarCircularIndeterminate)findViewById(R.id.progressBarCircularIndeterminate);
        progressBarDeterminate=(ProgressBarDeterminate)findViewById(R.id.progressDeterminate);
        progressBarIndeterminate=(ProgressBarIndeterminate)findViewById(R.id.progressBarIndeterminate);
        progressBarIndeterminateDeterminate=(ProgressBarIndeterminateDeterminate)
                findViewById(R.id.progressBarIndeterminateDeterminate);
        normalSlider=(Slider)findViewById(R.id.slider);
        numberSlider=(Slider)findViewById(R.id.slidernum);

        context=getBaseContext();

        SnackBar snackbar = new SnackBar(Activity_activity, String text, String buttonText, View.OnClickListener onClickListener);
        snackbar.show();

        Dialog dialog=new Dialog(dialog = new Dialog(Context context,"data", "messege"));
        dialog.show();
        ColorSelector colorSelector = new ColorSelector(Context context,int intialColor, OnColorSelectedListener onColorSelectedListener);
        colorSelector.show();
    }
}
