package generator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import objects.inhabitans.animals.predators.Bear;

import java.io.File;
import java.io.IOException;

import static constans.path.YamlPath.pathBear;

public class СollectorYAML {

    static ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
    public static void main(String[] args) {

        try {
            Bear bear = objectMapper.readValue(new File(pathBear), Bear.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
