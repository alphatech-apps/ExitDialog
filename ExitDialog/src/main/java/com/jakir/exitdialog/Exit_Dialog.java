package com.jakir.exitdialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.jakir.exitdialog.R;


public class Exit_Dialog extends Dialog {

    Activity activity;
    public Exit_Dialog(Activity activity) {
        super(activity);
        this.activity= activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().getAttributes().windowAnimations = R.style.DialogAnimation_fade_in_zoom; //dialog animation
        setContentView(R.layout.exit_dialog_layout2);

        TextView exit_tittlex=findViewById(R.id.exit_tittlex);
//        exit_tittlex.setText("Do you want to Exit > "+ getContext().getString(R.string.app_name));
        TextView cancelx=findViewById(R.id.cancelx);
        TextView okx=findViewById(R.id.okx);
        cancelx.setOnClickListener(view1 -> {
            dismiss();
        });
        okx.setOnClickListener(view1 -> {
            // finish();
            activity.finishAffinity();
            System.exit(0);
        });


        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        LottieAnimationView animation_p = findViewById(R.id.animation_p);
        animation_p.playAnimation();

    }
}
