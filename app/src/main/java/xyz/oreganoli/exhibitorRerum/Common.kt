package xyz.oreganoli.exhibitorRerum

import com.beust.klaxon.Klaxon

/**
 * An alias for our deserializer type, in case we ever want to use a different library.
 */
typealias Deser = Klaxon

/**
 * This is our API. See issue #10 for why we might want to use a different server in the future.
 */
const val API_URL = "https://jsonplaceholder.typicode.com/"