package com.hypheno.bookpedia.book.domain

import com.hypheno.bookpedia.core.domain.DataError
import com.hypheno.bookpedia.core.domain.EmptyResult
import kotlinx.coroutines.flow.Flow
import com.hypheno.bookpedia.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
    suspend fun getBookDescription(bookId: String): Result<String?, DataError>

    fun getFavoriteBooks(): Flow<List<Book>>
    fun isBookFavorite(id: String): Flow<Boolean>
    suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local>
    suspend fun deleteFromFavorites(id: String)
}