package example;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person  implements Serializable {

    private String name;
}
