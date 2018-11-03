package pl.sda.reminder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2v2 {

    public static void main(String[] args)
            throws IOException {

        List<String> lines = Files.lines(Paths.get("input.txt"))
                .map(line -> {
                    String[] splitArray = line.split(";");
                    return new Employee(splitArray[0], splitArray[1],
                            splitArray[2], Long.valueOf(splitArray[3]));
                })
                .sorted((o1, o2) -> (int) (o1.getId() - o2.getId()))
                .map(e -> e.getName() + ";" + e.getSurname() + ";" +
                        e.getPosition() + ";" + e.getId())
                .collect(Collectors.toList());

        Files.write(Paths.get("result.txt"), lines);
    }

}
