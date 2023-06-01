import { Injectable } from '@angular/core';
import { Book } from '../models/Book';
import { Category } from '../models/Category';
import { HttpClient } from '@angular/common/http';
import { Observable, catchError } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private static readonly BOOKS_PATH = '/books';

  private static readonly CATEGORY_PATH = '/cats';

  constructor(private http: HttpClient) { 
  }

  getAllBooks():Observable<Book[]>{
    const url = this.buildUrl(BookService.BOOKS_PATH);
    return this.http.get<Book[]>(url);
  }
  getBookByIsbn(isbn:string): Observable<Book>{
    const url = this.buildUrl(BookService.BOOKS_PATH) + '/' + isbn;
    return this.http.get<Book>(url);
  }

  getAllCategories(): Observable<Category[]>{
    const url = this.buildUrl(BookService.CATEGORY_PATH);
    return this.http.get<Category[]>(url);
  }

  saveBook(book : Book): Observable<string>{
    const url = this.buildUrl(BookService.BOOKS_PATH);
    return this.http.post<any>(url, book).pipe(
      catchError(this.handleError)
    );
  }

  private buildUrl(path: string): string {
    return `${environment.baseUrl}${path}`
  }

  private handleError(error: any): Observable<never> {
    throw new Error('Oops something went wrong! Please try again later.');
  }
}
