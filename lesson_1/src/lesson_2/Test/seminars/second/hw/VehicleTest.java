package lesson_2.Test.seminars.second.hw;

import lesson_2.src.seminars.second.hw.Car;
import lesson_2.src.seminars.second.hw.Motorcycle;
import lesson_2.src.seminars.second.hw.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    // Подготовка окружения. Будем вызывать перед каждым тестом
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Toyota", "Hilux", 2023);
        motorcycle = new Motorcycle("Ducatti", "F500", 2022);
    }

    //    Проект Vehicle. Написать следующие тесты с использованием JUnit5:
//
//            - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
//            (используя оператор instanceof).
    @Test
    void carIsInstanceOfClassVehicles() {
        assertThat(car instanceof Vehicle).isTrue();
    }

    //            - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void carHasFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    //            - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void motorcycleHasTwoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    //            - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void carHas60InTestDriveMode() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    //            - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void motorcycleHas75InTestDriveMode() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    //            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void carHas0InParkMode() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void motorcycleHas0InParkMode() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
//    В этом проекте, вы будете работать с проектом ""Vehicle"", который представляет собой иерархию классов, включающую абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".
//
//    Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"", а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".
//
//    Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.
//
//    Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы. При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.
}