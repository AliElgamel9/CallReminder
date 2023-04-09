package com.alielgamal9.callreminder.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Reminder(
    @PrimaryKey(autoGenerate = true) val id: Int=0,
    val name: String,
    val note: String,
    val sound: String,
    val contact: Contact,
    val date: Date,
    val repeatType: RepeatType,
    val repeatInterval: Int,
    val status: ReminderStatus,
    val reminderType: ReminderType,
    val reminderAction: ReminderAction
)
