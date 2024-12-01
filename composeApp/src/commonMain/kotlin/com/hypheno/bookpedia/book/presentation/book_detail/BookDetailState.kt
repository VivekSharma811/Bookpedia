package com.hypheno.bookpedia.book.presentation.book_detail

import com.hypheno.bookpedia.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)