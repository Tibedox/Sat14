package ru.samsung.sat14;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
    SpriteBatch batch;
    Texture image;

    float x = 100;
    float y = 300;
    float vx = 10;

    float x1 = 700;
    float y1 = 250;
    float vy1 = 10;

    float x2 = 0;
    float y2 = 0;
    float vx2 = 10;
    float vy2 = 10;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("ghost.png");
    }

    @Override
    public void render() {
        x += vx;
        if(x > 1600-230 || x < -70) {
            vx = -vx;
        }

        y1 += vy1;
        if(y1 > 900-300 || y1 < 0) {
            vy1 = -vy1;
        }

        x2 += vx2;
        if(x2 > 1600-230 || x2 < -70) {
            vx2 = -vx2;
        }
        y2 += vy2;
        if(y2 > 900-300 || y2 < 0) {
            vy2 = -vy2;
        }

        ScreenUtils.clear(0.2f, 0.1f, 0.3f, 1f);
        batch.begin();
        batch.draw(image, x, y, 300, 300);
        batch.draw(image, x1, y1, 300, 300);
        batch.draw(image, x2, y2, 300, 300);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
