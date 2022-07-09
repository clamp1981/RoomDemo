package com.example.roomdemo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface EmployeeDao {
    @Insert
    suspend fun insertEmpoyee( employeeEntity : EmployeeEntity )

    @Update
    suspend fun updateEmployee( employeeEntity : EmployeeEntity )

    @Delete
    suspend fun deleteEmployee( employeeEntity : EmployeeEntity)
}