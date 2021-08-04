package com.codingwithmitch.mviexample.ui.main.state

import com.codingwithmitch.mviexample.model.BlogPosts
import com.codingwithmitch.mviexample.model.User

data class MainViewState(
    var blogPosts: List<BlogPosts>? = null,
    var user: User? = null
)