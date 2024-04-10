package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    // System.nanoTime(); возвращает текущее время в наносекундах, возвращает более точный результат,
    // чем метод System.currentTimeMillis(), который возварщает время в миллисекундах.
    private final Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
