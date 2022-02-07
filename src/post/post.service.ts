import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

   

import {  observable, Observable, pipe, throwError } from 'rxjs';

import { catchError } from 'rxjs/operators';

  

import { Post } from './post';
import { create } from 'domain';
import { ObserversModule } from '@angular/cdk/observers';
import { json } from 'express';
@Injectable({
  providedIn: 'root'
})
export class PostService {
private rootURL='/api';
httpOptions={headers:new HttpHeaders({
  'Content-Type':'application/json'
})}
  constructor(private httpClient:HttpClient) { }
  getAll():Observable<Post[]>{
    return this.httpClient.get<Post[]>(this.rootURL+'/appointment').pipe(catchError(this.errorHandler))
  }
  
  Create(appointment:Post)
  {
    //appointment.id =;

    return this.httpClient.post(this.rootURL + '/appointment', appointment);

  }
  find(id:number):Observable<Post>{
    return this.httpClient.get<Post>(this.rootURL+'/appointment'+id).pipe(catchError(this.errorHandler))
  }
  update(id:number,apptName:string, apptType:string,apptDate:Date,pID:number,summary:string,confirmed:string, post:Post): Observable<Post>{
    return   this.httpClient.put<Post>(this.rootURL + '/appointment/' + id, JSON.stringify(post), this.httpOptions)

    .pipe(

      catchError(this.errorHandler)

    );
    
  }
  delete(id:number){

    return this.httpClient.delete<Post>(this.rootURL + '/appointment/' + id, this.httpOptions)

    .pipe(

      catchError(this.errorHandler)

    )

  }

errorHandler(error: { error: { message: string; }; status: any; message: any; }) {

  let errorMessage = '';

  if(error.error instanceof ErrorEvent) {

    errorMessage = error.error.message;

  } else {

    errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;

  }

  return throwError(errorMessage);

}
}