package geek;

public class FilePathBuilder {
    public String buildPath(String username){
        return "file:///home/"+username+"/content/index.html";
    }
}
