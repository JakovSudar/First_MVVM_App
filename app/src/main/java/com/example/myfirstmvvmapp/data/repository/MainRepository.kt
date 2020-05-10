package com.example.myfirstmvvmapp.data.repository

import com.example.myfirstmvvmapp.data.api.ApiHelper
import com.example.myfirstmvvmapp.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}