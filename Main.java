import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User(2L, "log1", 10, "esen@mail.ru" ),
        new User(3L, "log2mapa", 11, "esenka@mail.ru"),
        new User(4L, "log3lenght", 12, "esen48@gmail.com"),
        new User(5L, "log4list", 13, "esenio@mail.ru"),
        new User(6L, "log5", 20, "exidfkdg@mail.ru"),
        new User(7L, "log6", 15, "esendlfkg@mail.ru"),
        new User(8L, "log7", 16, "esekdfgkn@gmail.com"),
        new User(9L, "log8", 17, "esedkfjgn@mail.ru"),
        new User(10L, "log9", 18, "esenkdjfgh@mail.ru"),
        new User(11L, "log10", 19, "eskdjhgen@mail.ru"));

        List<UserDto> userDtos = users.stream()
                .map(UserDto::new)
                .sorted(Comparator.comparingInt(UserDto::getAge))
                .collect(Collectors.toList());

        userDtos.forEach(System.out::println);

        System.out.println("====================================================");

        List<User> userDtosSec = users.stream()
                .filter(u -> u.getId() % 2 == 0)
                .toList();
        userDtosSec.forEach(System.out::println);

        System.out.println("====================================================");

        List<User> userDtosLenght = users.stream()
                .filter(userDto -> userDto.getLogin().length() <= 5)
                .toList();
        userDtosLenght.forEach(System.out::println);

        System.out.println("====================================================");

        List<User> userDtosCom = users.stream()
                .filter(userDto -> userDto.getEmail().endsWith(".com"))
                .toList();
        userDtosCom.forEach(System.out::println);

        System.out.println("====================================================");

//        List<UserDto> userDtosEmail = users.stream()
//                .map(UserDto::getEmail)
//                .collect(Collectors.toList());
//        userDtosEmail.forEach(System.out::println);

        System.out.println("====================================================");

        int userDtosNum = users.stream()
                .mapToInt(User::getAge)
                .sum();
        System.out.println(userDtosNum);

    }
}