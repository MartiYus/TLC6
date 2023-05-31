import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { BooksComponent } from '../books/books.component';
import { NotBookComponent } from '../not-book/not-book.component';
import { BookDetailComponent } from '../book-detail/book-detail.component';
import { BookFormComponent } from '../book-form/book-form.component';

const routes:Routes = [
  {path:'', redirectTo: 'books', pathMatch: 'full'},
  {path: 'books', component: BooksComponent},
  {path: 'newbook', component: BookFormComponent},
  {path: 'book-detail/:isbn', component: BookDetailComponent}
]


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
