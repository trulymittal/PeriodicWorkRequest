package com.example.killer.periodicworkrequest;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

public class MyPeriodicWork extends Worker {

    private static final String TAG = "MyPeriodicWork";

    @NonNull
    @Override
    public Result doWork() {
        Log.e(TAG, "doWork: Work is done.");
        return Result.SUCCESS;
    }
}
