package com.richard.app;

import static spark.Spark.*;
public class App 
{
    public static void main( String[] args )
    {
	ReverseString rs = new ReverseString();	
	get("/hello", (req, res)->"Hello, world");

        get("/hello/:name", (req,res)->{
            return "Hello, "+ req.params(":name");
        });

	get("/reverseme/:name", (req,res)->{
            return rs.reverse(req.params(":name"));
        });

    }
}
