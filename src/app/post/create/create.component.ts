import { Component, OnInit } from '@angular/core';
import { PostService } from 'src/post/post.service';
import { Router } from '@angular/router';
import { FormGroup, FormControl, Validators} from '@angular/forms';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  form: FormGroup;

  constructor(public postService:PostService,private router:Router) { }

  ngOnInit(): void {
    this.form=new FormGroup({
      id:new FormControl(''),
      apptTitle:new FormControl('',[Validators.required]),
      apptDate:new FormControl('',[Validators.required]),
      apptType:new FormControl('',[Validators.required]),
      paitentID:new FormControl('',[Validators.required]),
      summary:new FormControl('',[Validators.required]),
      confirmed: new FormControl('',[Validators.required])
    })
  }
  get f(){

    return this.form.controls;

  }

    

  submit(){

    console.log(this.form.value);

    this.postService.Create(this.form.value).subscribe(res => {

         console.log('Post created successfully!');

         this.router.navigateByUrl('post/index');

    })

  }

  
  /*id:number;
  apptName:string;
  apptType:string;
  paitentID:number;
  apptDate:Date;
  summary:string;
  confirmed:string;*/


}
