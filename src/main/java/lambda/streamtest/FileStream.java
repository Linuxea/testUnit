package lambda.streamtest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Linuxea on 10/28/17.
 */
public class FileStream {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/linuxea/git_home/testUnit/src/main/java/lambda/streamtest/FileStream.java");
        try (Stream<String> stringStream = Files.lines(path)) {
            stringStream.forEach(System.out::println);
        }

        Path rootPath = Paths.get("/home/linuxea/git_home/testUnit/src/main/java/");
        System.out.println(rootPath.toAbsolutePath().toString());
        Files.walk(rootPath).forEach(System.out::println);


    }

}
