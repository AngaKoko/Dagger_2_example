package com.blazingtech.githubbrowser.home.list

data class RepoItem(
    val name: String,
    val description: String,
    val starsCount: Int,
    val forkCount: Int
)