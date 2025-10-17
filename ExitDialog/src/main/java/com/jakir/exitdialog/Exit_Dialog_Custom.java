package com.jakir.exitdialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;


public class Exit_Dialog_Custom extends Dialog {

    Activity activity;

    public Exit_Dialog_Custom(Activity activity) {
        super(activity);
        this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().getAttributes().windowAnimations = R.style.DialogAnimation_fade_in_zoom; //dialog animation
        setContentView(R.layout.exit_dialog_layout_custom);

        Button btn_cancel = findViewById(R.id.btn_cancel);
        Button btn_exit = findViewById(R.id.btn_exit);
        btn_cancel.setOnClickListener(view1 -> {
            dismiss();
        });
        btn_exit.setOnClickListener(view1 -> {
            activity.finishAffinity();
            System.exit(0);
        });

        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        LottieAnimationView animation_p = findViewById(R.id.animation_p);
        animation_p.playAnimation();

    }
}
