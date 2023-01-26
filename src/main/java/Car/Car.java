package Car;

public class Car {
    private static Integer NAME_MAX = 5;
    private static Integer NAME_MIN = 1;
    private static Integer MIN_MOVABLE_NUM = 4;

    private String name;
    private Integer distance;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
        validateName();
    }

    public Car(String name, Integer distance) {
        this(name);
        this.distance = distance;
    }

    private void validateName() {
        if (NAME_MIN > name.length() || NAME_MAX < name.length()) {
            throw new IllegalArgumentException("이름의 길이는 1이상 5이하여야합니다.");
        }
    }

    public static Boolean movable(int randomNumber) {
        if (randomNumber >= MIN_MOVABLE_NUM){
            return true;
        }
        return false;
    }

    public void move() {
        this.distance += 1;
    }

    public String name() {
        return this.name;
    }
    public Integer distance() {
        return this.distance;
    }
}