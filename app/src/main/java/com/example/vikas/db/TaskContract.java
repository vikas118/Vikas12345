package com.example.vikas.db;

import android.provider.BaseColumns;

public class TaskContract{
    public static final String DB_NAME = "com.example.vikas.db";
    public static final int DB_VERSION = 1;

    public class TaskEntryimplements BaseColumns{
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
