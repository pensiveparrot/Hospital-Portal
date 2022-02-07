import { Component, OnInit } from '@angular/core';
import { PostService } from 'src/post/post.service';
import { Post } from 'src/post/post';
import { FormGroup,FormControl,Validators } from '@angular/forms';
import { ActivatedRoute,Router } from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  id:number;
  apptName:string;
  apptType:string;
  paitentID:number;
  apptDate:Date;
  summary:string;
  confirmed:string;
  post:Post;
  formGroup:FormGroup;

  constructor(    public postService: PostService,

    private route: ActivatedRoute,

    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['postId'];

    this.postService.find(this.id).subscribe((data: Post)=>{

      this.post = data;

    });

    

    this.form = new FormGroup({

      id:new FormControl(''),
      apptTitle:new FormControl('',[Validators.required]),
      apptDate:new FormControl('',[Validators.required]),
      apptType:new FormControl('',[Validators.required]),
      paitentID:new FormControl('',[Validators.required]),
      summary:new FormControl('',[Validators.required]),
      confirmed: new FormControl('',[Validators.required])

    });

  }

   

  get f(){

    return this.form.controls;

  }

     

  submit(){

    console.log(this.form.value);

    this.postService.update(this.id, this.apptName,this.apptDate.toString(),this.apptDate,this.paitentID,this.summary,this.confirmed,this.post).subscribe(res => {

         console.log('Post updated successfully!');

         this.router.navigateByUrl('post/index');

    })

  }

   

  }

