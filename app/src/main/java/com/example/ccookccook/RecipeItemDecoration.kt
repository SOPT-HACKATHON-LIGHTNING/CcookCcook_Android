package com.example.ccookccook

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class RecipeItemDecoration(private val spaceHeight: Int): RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        with(outRect) {
            top = spaceHeight
            left =  spaceHeight
            right = spaceHeight
            bottom = spaceHeight
        }
    }
}