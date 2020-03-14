package xyz.oreganoli.exhibitorRerum.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ExhibitionDatabaseDao {
    @Query("select * from databaseposts")
    fun getPosts(): LiveData<List<DatabasePosts>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun
}