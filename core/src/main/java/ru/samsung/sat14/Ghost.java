package ru.samsung.sat14;

class Ghost {
    float x, y;
    float vx, vy;

    Ghost(float x, float y, float vx, float vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    void move() {
        x += vx;
        if (x > 1600 - 230 || x < -70) {
            vx = -vx;
        }
        y += vy;
        if (y > 900 - 300 || y < 0) {
            vy = -vy;
        }
    }

    void move1() {
        x += vx;
        y += vy;
        if (y > 900 - 200) {
            vy = 0;
            vx = 15;
            y = 900 - 200;
        }
        if (x > 1600 - 200) {
            vx = 0;
            vy = -15;
            x = 1600 - 200;
        }
        if (y < 0) {
            vy = 0;
            vx = -15;
            y = 0;
        }
        if (x < 0) {
            vy = 15;
            vx = 0;
            x = 0;
        }
    }
}
