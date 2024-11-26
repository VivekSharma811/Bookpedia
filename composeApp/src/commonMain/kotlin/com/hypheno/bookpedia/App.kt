package com.hypheno.bookpedia

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.hypheno.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.hypheno.bookpedia.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel() },
        onBookClick = {

        }
    )
}
