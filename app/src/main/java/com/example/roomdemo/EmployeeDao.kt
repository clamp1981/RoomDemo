package com.example.roomdemo

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface EmployeeDao {
    @Insert
    suspend fun insertEmployee( employeeEntity : EmployeeEntity )

    @Update
    suspend fun updateEmployee( employeeEntity : EmployeeEntity )

    @Delete
    suspend fun deleteEmployee( employeeEntity : EmployeeEntity)

    @Query( "SELECT * FROM 'employee-table'")
    fun fetchAllEmployees() : Flow<List<EmployeeEntity>>

    @Query( "SELECT * FROM 'employee-table' where id=:id")
    fun fetchEmployeeById(id:Int) : Flow<List<EmployeeEntity>>

}