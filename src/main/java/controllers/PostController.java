package controllers;

import models.Post;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/api/post")
public class PostController {

    private static List<Post> db=new ArrayList<Post>();
    static {
        db.add(new Post("zeros","hi"));
        db.add(new Post("jabri","hello"));
        db.add(new Post("alami","salut"));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Post addPost(Post post){
        return null;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Post> fetchAll(){
        return db;
    }
}
