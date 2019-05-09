package com.gujci.aoe2catalog.persistance

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {

    @Provides
    @Singleton
    fun providesRoomDatabase(context: Context): AoEDAO {
        return Room.databaseBuilder(context, Database::class.java, "catalog-db").build().roomDao()
    }
}