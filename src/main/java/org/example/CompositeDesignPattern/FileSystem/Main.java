package org.example.CompositeDesignPattern.FileSystem;

public class Main {
    public static void main(String args[]){
        Directory rootDirectory=new Directory("Movie");

        FileSystem firstMovie=new File("avengers");
        rootDirectory.add(firstMovie);

        Directory comedyMovieDirectory=new Directory("Comedy Movies");
        File firstComedyMovie=new File("Home alone");
        comedyMovieDirectory.add(firstComedyMovie);

        rootDirectory.add(comedyMovieDirectory);

        rootDirectory.ls();
    }
}
