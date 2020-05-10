package com.example.myfirstmvvmapp.data.api

import com.example.myfirstmvvmapp.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}