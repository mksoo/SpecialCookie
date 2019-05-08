package com.at5pecial.specialcookie;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class EventDialogFragment extends DialogFragment implements View.OnClickListener {

    public static final String TAG_EVENT_DIALOG = "dialog_event";

    public EventDialogFragment(){}

    public static EventDialogFragment getInstance(){

        EventDialogFragment e = new EventDialogFragment();
        return e;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog, container);
        Button mConfirmBtn = v.findViewById(R.id.btn_confirm);
        mConfirmBtn.setOnClickListener(this);

        // fragment 밖의 영역을 터치 시 화면이 dismiss되는 놈.
        //setCancelable(false);
        return v;
    }

    @Override
    public void onClick(View v) {
        dismiss();
    }
}
