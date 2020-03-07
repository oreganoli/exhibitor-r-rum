package xyz.oreganoli.exhibitorRerum

import android.content.Context
import android.graphics.Typeface
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class PostCard(
    context: Context,
    postId: Int,
    postTitle: String,
    postAuthor: String,
    postBody: String,
    postComments: Int
) : LinearLayout(context) {
    init {
        populate(
            postId,
            postTitle,
            postAuthor,
            postBody,
            postComments
        )
    }

    private fun populate(
        postId: Int,
        postTitle: String,
        postAuthor: String,
        postBody: String,
        postComments: Int
    ) {
        val outerMargin = dpToPx(10, context)
        val innerMargin = dpToPx(5, context)
        this.orientation = VERTICAL
        val outerParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        outerParams.setMargins(outerMargin, outerMargin, outerMargin, outerMargin)
        val topParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        topParams.setMargins(0, innerMargin, 0, innerMargin)
        val innerParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        val horParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        innerParams.setMargins(0, innerMargin, 0, innerMargin)
        this.layoutParams = outerParams
        val topBar = LinearLayout(context)
        topBar.orientation = VERTICAL
        topBar.layoutParams = topParams
        val idView = TextView(context)
        val idString = String.format(
            context.resources!!.getString(R.string.post_id_format),
            postId
        )
        idView.textAlignment = TEXT_ALIGNMENT_TEXT_START
        idView.typeface = Typeface.DEFAULT_BOLD
        idView.text = idString
        idView.layoutParams = horParams
        idView.gravity = Gravity.START
        val titleView = TextView(context)
        titleView.textAlignment = TEXT_ALIGNMENT_CENTER
        titleView.text = postTitle
        titleView.layoutParams = horParams
        titleView.gravity = Gravity.CENTER_HORIZONTAL
        val authorView = TextView(context)
        authorView.text = String.format(
            context.resources.getString(R.string.post_author_format),
            postAuthor
        )
        authorView.typeface = Typeface.DEFAULT_BOLD
        authorView.textAlignment = TEXT_ALIGNMENT_TEXT_END
        authorView.layoutParams = horParams
        authorView.gravity = Gravity.END

        topBar.addView(idView)
        topBar.addView(titleView)
        topBar.addView(authorView)

        val bodyView = TextView(context)
        bodyView.textAlignment = TEXT_ALIGNMENT_TEXT_START
        bodyView.text = postBody
        bodyView.layoutParams = innerParams

        val commentView = TextView(context)
        commentView.textAlignment = TEXT_ALIGNMENT_TEXT_START
        commentView.text = String.format(
            context.resources.getString(R.string.post_comment_count_format),
            postComments
        )
        commentView.layoutParams = innerParams
        addView(topBar)
        addView(bodyView)
        addView(commentView)
    }
}