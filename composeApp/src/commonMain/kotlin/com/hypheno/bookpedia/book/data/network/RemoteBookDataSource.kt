package com.hypheno.bookpedia.book.data.network

import com.hypheno.bookpedia.book.data.dto.BookWorkDto
import com.hypheno.bookpedia.book.data.dto.SearchResponseDto
import com.hypheno.bookpedia.core.domain.DataError
import com.hypheno.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}
