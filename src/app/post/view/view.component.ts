import { Component, OnInit } from '@angular/core';
import { Post } from 'src/post/post';
import { PostService } from 'src/post/post.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {
  id:number;
  post:Post

  constructor(    public postService: PostService,

    private route: ActivatedRoute,

    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['postId'];

      

    this.postService.find(this.id).subscribe((data: Post)=>{

      this.post = data;

    });

  }
  }

