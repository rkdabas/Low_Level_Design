package org.example.CompositeDesignPattern.FileSystem;

public class File implements FileSystem{
    String fileName;

    public File(String fileName){
        this.fileName=fileName;
    }

    public void ls(){
        System.out.println("fileName is: "+fileName);
    }
}
