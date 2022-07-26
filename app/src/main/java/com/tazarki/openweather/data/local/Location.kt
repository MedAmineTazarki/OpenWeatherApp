package com.tazarki.openweather.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tazarki.openweather.data.local.Location.Companion.TABLE_NAME

/**
 * Entity class to defines the table details
 */
@Entity(tableName = TABLE_NAME)
data class Location(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "location_name") val locationName: String?,
    @ColumnInfo(name = "data") val data: String?
) {
    companion object {
        const val TABLE_NAME = "location"
    }
}
