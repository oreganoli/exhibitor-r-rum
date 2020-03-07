package xyz.oreganoli.exhibitorRerum

import android.content.Context
import com.beust.klaxon.Klaxon
import kotlin.math.roundToInt

/**
 * An alias for our deserializer type, in case we ever want to use a different library.
 */
typealias Deser = Klaxon

/**
 * This is our API. See issue #10 for why we might want to use a different server in the future.
 */
const val API_URL = "https://jsonplaceholder.typicode.com/"

/**
 * Converts density-independent pixels into actual pixels.
 */
fun dpToPx(dp: Int, ctx: Context): Int {
    return (ctx.resources.displayMetrics.density * dp).roundToInt()
}