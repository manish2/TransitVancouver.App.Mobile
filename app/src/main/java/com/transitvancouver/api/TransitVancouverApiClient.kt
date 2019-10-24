package com.transitvancouver.api

import com.squareup.okhttp.Handshake
import okhttp3.*
import java.io.IOException
import java.io.InputStream
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager





object Settings {
    val API_URL = "http://transitvancouverapi.azurewebsites.net/api"
}


fun getBusSchedules() {
    val url = Settings.API_URL + "/Schedule"

    val request = Request.Builder().url(url).build()
    var client = OkHttpClient()
    client.newCall(request).enqueue(object: Callback {
        override fun onResponse(call: Call, response: Response) {
            val body = response?.body?.string()
            println(body)
        }
        override fun onFailure(call: Call, e: IOException) {
            println("Network call failed!")

        }
    })
}
