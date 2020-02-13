/*
 * Copyright (c) 2020.
 * Nkita Knyazevkiy
 * UA
 */

package com.nikita.qrexample.unit.rest

class AppRest<T>(private val baseUrl: String, private val service: Class<T>)  {

    private var apiFactory: ApiFactory = ApiFactory()

    //@Throws(IOException::class)
    fun api(): T {
        return apiFactory
            .buildRetrofit(baseUrl)
            .create(service)
    }

}