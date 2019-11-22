package ru.kozhukhov.sergey.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityAccount extends AppCompatActivity {

    private static final String SAVED_TESTMODEL = "PARCEL";

    private TestModel mTestModel;

    private TextView mTextViewValueTestModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        if (savedInstanceState != null) {
            mTestModel = savedInstanceState.getParcelable(SAVED_TESTMODEL);
        } else {
            mTestModel = new TestModel(getResources().getString(R.string.dict_eng));
        }

        mTextViewValueTestModel = findViewById(R.id.textView_valueTestModel);
        mTextViewValueTestModel.setText(mTestModel.toString());

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putParcelable(SAVED_TESTMODEL, mTestModel);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        mTestModel = savedInstanceState.getParcelable(SAVED_TESTMODEL);
        super.onRestoreInstanceState(savedInstanceState);
    }

}
