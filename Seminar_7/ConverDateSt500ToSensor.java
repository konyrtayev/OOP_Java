package Seminar_7;

import java.time.*;

public class ConverDateSt500ToSensor implements MeteoSensor {
    int id;
	double temperature; 
	int year;			 
	int day;			 
	int second;		 
    public ConverDateSt500ToSensor ( SensorTemperature st500 ) {            // Получение данных из датчика
        this.id = st500.identifier();
        this.temperature = st500.temperature();
        this.year = st500.year();
        this.day = st500.day();
        this.second = st500.second();
    }
                                        // Реализация всех методов из интерфейса MeteoSensor
    @Override
    public int getId() {
        return id;
    }

    @Override
    public Float getTemperature() {
        return (float) temperature;
    }

    @Override
    public Float getHumidity() {
        return (float) 0;
    }

    @Override
    public Float getPressure() {
        return (float) 0;
    }

    @Override
    public LocalDateTime getDateTime() {
        int hour = second/3600;                                 // Получение часа из приходящего с датчика данных
        int minute = (second - hour*3600)/60;                   // Получение минут из приходящего с датчика данных
        int sec = (second - hour*3600 - minute*60);             // Получение секунд из приходящего с датчика данных
        LocalDate date = LocalDate.ofYearDay(year,day);         // Формирование года, месяца, и числа из данных с датчика (год, день года) 
        LocalTime time = LocalTime.of(hour, minute, sec);       // Формирование времени
        return LocalDateTime.of(date, time);                    // Возврат в нужном формате
    }
}
