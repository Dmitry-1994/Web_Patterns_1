package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateDate(int shift) {
        // TODO: добавить логику для объявления переменной date и задания её значения, для генерации строки с датой
        String date = "";
        // Вы можете использовать класс LocalDate и его методы для получения и форматирования даты
        date = LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }

    public static String generateCity(String locale) {
        // TODO: добавить логику для объявления переменной city и задания её значения, генерацию можно выполнить
        // с помощью Faker, либо используя массив валидных городов и класс Random
        Faker faker = new Faker(new Locale(locale));
        String city = faker.address().city();
        return city;
    }

//    public static String generateName(String locale) {
//        // TODO: добавить логику для объявления переменной name и задания её значения, для генерации можно
//        // использовать Faker
//        return name;
//    }
//
//    public static String generatePhone(String locale) {
//        // TODO: добавить логику для объявления переменной phone и задания её значения, для генерации можно
//        // использовать Faker
//        return phone;
//    }
//
//    public static class Registration {
//        private Registration() {
//        }
//
//        public static UserInfo generateUser(String locale) {
//            // TODO: добавить логику для создания пользователя user с использованием методов generateCity(locale),
//            // generateName(locale), generatePhone(locale)
//            return user;
//        }
//    }
//
//    @Value
//    public static class UserInfo {
//        String city;
//        String name;
//        String phone;
//    }
}
