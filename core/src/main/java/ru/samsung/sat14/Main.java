package ru.samsung.sat14;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
    SpriteBatch batch;
    Texture image;

    float x0 = 100;
    float y0 = 300;
    float vx0 = 5;

    float x1 = 700;
    float y1 = 250;
    float vy1 = 5;

    float x2 = 0;
    float y2 = 0;
    float vx2 = 5;
    float vy2 = 5;

    float x3 = 0;
    float y3 = 0;
    float vx3 = 0;
    float vy3 = 5;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("ghost.png");
    }

    @Override
    public void render() {
        x0 += vx0;
        if(x0 > 1600-230 || x0 < -70) {
            vx0 = -vx0;
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

        x3 += vx3;
        y3 += vy3;
        if(y3 > 900-200){
            vy3 = 0;
            vx3 = 5;
        }
        if(x3 > 1600-200){
            vx3 = 0;
            vy3 = -5;
        }
        if(y3<0){
            vy3 = 0;
            vx3 = -5;
        }
        if(x3<0){
            vy3 = 5;
            vx3 = 0;
        }

        ScreenUtils.clear(0.2f, 0.1f, 0.3f, 1f);
        batch.begin();
        batch.draw(image, x0, y0, 300, 300);
        batch.draw(image, x1, y1, 300, 300);
        batch.draw(image, x2, y2, 300, 300);
        batch.draw(image, x3, y3, 200, 200);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
