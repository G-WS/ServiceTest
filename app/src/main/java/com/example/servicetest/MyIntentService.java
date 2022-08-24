//package com.example.servicetest;
//
//import android.app.IntentService;
//import android.app.PendingIntent;
//import android.content.Intent;
//import android.util.Log;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.lifecycle.LiveData;
//import androidx.work.ExistingPeriodicWorkPolicy;
//import androidx.work.ExistingWorkPolicy;
//import androidx.work.OneTimeWorkRequest;
//import androidx.work.Operation;
//import androidx.work.PeriodicWorkRequest;
//import androidx.work.WorkContinuation;
//import androidx.work.WorkInfo;
//import androidx.work.WorkManager;
//import androidx.work.WorkQuery;
//import androidx.work.WorkRequest;
//
//import java.util.List;
//import java.util.UUID;
//
//public class MyIntentService extends WorkManager{
//    private static final String TAG = "MyIntentService";
//
//
//    @NonNull
//    @Override
//    public Operation enqueue(@NonNull List<? extends WorkRequest> requests) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public WorkContinuation beginWith(@NonNull List<OneTimeWorkRequest> work) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public WorkContinuation beginUniqueWork(@NonNull String uniqueWorkName, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> work) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public Operation enqueueUniqueWork(@NonNull String uniqueWorkName, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> work) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public Operation enqueueUniquePeriodicWork(@NonNull String uniqueWorkName, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest periodicWork) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public Operation cancelWorkById(@NonNull UUID id) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public Operation cancelAllWorkByTag(@NonNull String tag) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public Operation cancelUniqueWork(@NonNull String uniqueWorkName) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public Operation cancelAllWork() {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public PendingIntent createCancelPendingIntent(@NonNull UUID id) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public Operation pruneWork() {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public LiveData<Long> getLastCancelAllTimeMillisLiveData() {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public com.google.common.util.concurrent.ListenableFuture<Long> getLastCancelAllTimeMillis() {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public LiveData<WorkInfo> getWorkInfoByIdLiveData(@NonNull UUID id) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public com.google.common.util.concurrent.ListenableFuture<WorkInfo> getWorkInfoById(@NonNull UUID id) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(@NonNull String tag) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public com.google.common.util.concurrent.ListenableFuture<List<WorkInfo>> getWorkInfosByTag(@NonNull String tag) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(@NonNull String uniqueWorkName) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public com.google.common.util.concurrent.ListenableFuture<List<WorkInfo>> getWorkInfosForUniqueWork(@NonNull String uniqueWorkName) {
//        return null;
//    }
//
//    @NonNull
//    @Override
//    public LiveData<List<WorkInfo>> getWorkInfosLiveData(@NonNull WorkQuery workQuery) {
//        return null;
//    }
//
//
//}
