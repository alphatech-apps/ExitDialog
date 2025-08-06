package com.jakir.exitdialog;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;


public class Exit_Dialog_Material {

    Activity activity;

    public Exit_Dialog_Material(Activity activity) {
        this.activity = activity;
    }

    public void showDialog(boolean useMaterialDesign) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(activity);
        View view = View.inflate(activity, useMaterialDesign ? R.layout.exit_dialog_layout_material : R.layout.exit_dialog_layout_custom, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();

        LottieAnimationView animation_p = view.findViewById(R.id.animation_p);
        animation_p.playAnimation();

        TextView cancelx = view.findViewById(R.id.cance_tv);
        TextView okx = view.findViewById(R.id.ok_tv);
        cancelx.setOnClickListener(view1 -> {
            dialog.dismiss();
        });
        okx.setOnClickListener(view1 -> {
            activity.finishAffinity();
            System.exit(0);
        });
    }
}
