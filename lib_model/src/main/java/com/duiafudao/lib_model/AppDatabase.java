package com.duiafudao.lib_model;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;
import android.support.annotation.NonNull;

/**
 * create by liumingrui at 2018/7/30
 **/
public class AppDatabase extends RoomDatabase {
  @NonNull
  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
    return null;
  }
  @NonNull
  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return null;
  }
  @Override
  public void clearAllTables() {

  }
}
