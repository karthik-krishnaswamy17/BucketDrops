package com.ks17.bucketdrops;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.ks17.bucketdrops.beans.Drop;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by karthik90 on 8/23/2016.
 */
public class Dialog extends DialogFragment {
    private ImageButton imageButton;
    private Button btnAdd;
    private EditText editext;
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            switch (id) {
                case R.id.bt_add: {
                    addAction();
                    break;
                }

                case R.id.ic_close: {
                    dismiss();
                    break;
                }
            }
            dismiss();

        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.add_dialog, container, false);
    }
    //TODO Convert time to human readable format!

    private void addAction() {
        String goal = editext.getText().toString();
        long CurrentTime = System.currentTimeMillis();
        RealmConfiguration realmConfig = new RealmConfiguration.Builder(getActivity()).build();
        Realm.setDefaultConfiguration(realmConfig);
        Realm realm = Realm.getDefaultInstance();
        Drop drop = new Drop(goal, CurrentTime, 0, false);
        realm.beginTransaction();
        realm.copyToRealm(drop);
        realm.commitTransaction();
        realm.close();


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageButton = (ImageButton) view.findViewById(R.id.ic_close);
        btnAdd = (Button) view.findViewById(R.id.bt_add);
        editext = (EditText) view.findViewById(R.id.edit_text);
        imageButton.setOnClickListener(clickListener);
        btnAdd.setOnClickListener(clickListener);


    }
}
