package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dod extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
